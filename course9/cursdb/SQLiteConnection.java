package ro.ase.course9.cursdb;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SQLiteConnection {

    public static final String DB_URL = "jdbc:sqlite:C:\\Users\\Administrator\\MySQLiteDBnou";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try
        {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection(DB_URL);
            System.out.println("S-a conectat...");

            stmt = conn.createStatement();

            String sqlCreate = "CREATE TABLE student(COD INT PRIMARY KEY, NUME VARCHAR(10), VARSTA INT, INALTIME INT, CNP VARCHAR(13), SEX VARCHAR(2), FORMA VARCHAR(10))";
            //stmt.executeUpdate(sqlCreate);
            System.out.println("Tabela creata...");

            String sqlInsert = "INSERT INTO student VALUES(1000, 'Ionel', 23, 180, '1234567890', 'M', 'ZI')";
            //stmt.executeUpdate(sqlInsert);

            String sqlInsert1 = "INSERT INTO student VALUES(2000, 'Gigel', 24, 178, '1234567890', 'M', 'ID')";
            //stmt.executeUpdate(sqlInsert1);

            List<Student> listaStud = new ArrayList<Student>();
            ResultSet rs = stmt.executeQuery("SELECT * FROM student");
            ResultSetMetaData rsmd = rs.getMetaData();
            System.out.println("Nr. coloane: "+rsmd.getColumnCount());
            for(int i=1;i<=rsmd.getColumnCount();i++)
                System.out.println(rsmd.getColumnName(i)+" "+rsmd.getColumnTypeName(i));


            int nr = 0;
            while(rs.next())
            {
                System.out.println(++nr+" Nume "+rs.getString(2)+
                        " CNP "+rs.getString(5));
                listaStud.add(new Student(rs.getInt(1), rs.getString(2), rs.getInt(3), rs.getInt(4),
                        rs.getString(5), rs.getString(6), rs.getString(7)));
            }

            for(Student s:listaStud)
                System.out.println(s.toString());


            rs.close();

            System.out.println("---------------------forma = ZI");
            List<Student> listaStudZI = listaStud.stream().
                    filter(s->s.getForma().equals("ZI")).
                    collect(Collectors.toList());
            for(Student s:listaStudZI)
                System.out.println(s.toString());

            System.out.println("---------------------inaltime > 178");
            List<Student> listaStudInaltime = listaStud.stream().
                    filter(s->s.getInaltime()>=178).
                    collect(Collectors.toList());
            for(Student s:listaStudInaltime)
                System.out.println(s.toString());

            String sqlUpdate = "UPDATE student SET NUME='Marcel' WHERE COD=1000";
            //stmt.executeUpdate(sqlUpdate);

            int pozitie = 0;
            for(Student s: listaStud)
                if(s.getCod()==1000) {
                    s.setNume("Maricica");
                    pozitie = listaStud.indexOf(s);
                }
            String sqlUpdate1 = "UPDATE student SET NUME='"+
                    listaStud.get(pozitie).getNume()+
                    "' where COD="+listaStud.get(pozitie).getCod();
            //stmt.executeUpdate(sqlUpdate1);

            String sqlDelete = "DELETE from student where COD="+listaStud.get(pozitie).getCod();
            //stmt.executeUpdate(sqlDelete);

            for(Student s:listaStud)
                if (s.getCod()==1000)
                {
                    listaStud.remove(s);
                    pozitie = listaStud.indexOf(s);
                }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
        finally {
            conn.close();
        }
    }
}
