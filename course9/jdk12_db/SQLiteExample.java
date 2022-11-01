package ro.ase.course9.jdk12_db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class SQLiteExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName("org.sqlite.JDBC");
			//conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Cristian/MySQLiteDB");
			conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Administrator/TestCursSQLite");
			conn.setAutoCommit(true);
			System.out.println("Connected succesfully!");
			
			stmt = conn.createStatement();
			String sqlCreate = "CREATE TABLE studenti(COD INT PRIMARY KEY," +
					"NUME VARCHAR(10),VARSTA INT,INALTIME INT, CNP VARCHAR(13)," +
					"SEX VARCHAR(2),FORMA VARCHAR(10))";
			//stmt.executeUpdate(sqlCreate);
			System.out.println("Table created successfuly!");
		
			String sqlInsert = "INSERT INTO studenti VALUES(303,'Ionel',23,180,'1234567890123','M','ZI')";
			String sqlInsert1 = "INSERT INTO studenti VALUES(304,'Gigel',24,178,'1234567890123','M','ZI')";
			stmt.executeUpdate(sqlInsert1);
			System.out.println("Record inserted successfuly!");
		
			String sqlUpdate = "UPDATE studenti set forma='ID' where COD=303";
			stmt.executeUpdate(sqlUpdate);
			System.out.println("Record updated successfuly!");
			
			String sqlDelete = "DELETE from studenti where COD=100";
	        //stmt.executeUpdate(sqlDelete);
	        System.out.println("Record deleted successfuly!");
	        
			ResultSet rs = stmt.executeQuery("SELECT * from studenti");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Nr. coloane: " + rsmd.getColumnCount());
			for(int i=1;i<=rsmd.getColumnCount();i++)
				System.out.println(rsmd.getColumnName(i) + " " +rsmd.getColumnTypeName(i));

			List<Student> listaStud = new ArrayList<Student>();
			int nr = 0;
			while (rs.next())
			{
				System.out.println(++nr+" Nume "+
				rs.getString(2)+"\nCNP "+rs.getString(5)+" FORMA "+rs.getString(7));
				listaStud.add(new Student(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7)));
			}
			
			rs.close();

			for(Student s: listaStud)
				System.out.println(s.toString());

			System.out.println("----------------forma = ZI-------------");
			List<Student> listaStudZI = listaStud.stream().
					filter(s->s.getForma().equals("ZI")).
					collect(Collectors.toList());
			for(Student s: listaStudZI)
				System.out.println(s.toString());

			System.out.println("----------------inaltime > 178-------------");
			List<Student> listaStudInaltime = listaStud.stream().
					filter(s->s.getInaltime() >= 178).
					collect(Collectors.toList());
			for(Student s: listaStudInaltime)
				System.out.println(s.toString());
		}
		catch(SQLException ex)
		{
			ex.printStackTrace();
		}
		catch(Exception ex)
		{
			ex.printStackTrace();
		}
		finally
		{
			if (conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
