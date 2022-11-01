package ro.ase.course9.cursdb;

import ro.ase.course9.jdbc.Student;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class JDBCConnection {

	public static final String DB_URL = "jdbc:derby:C:/Users/Administrator/TestCursJavaDB4;create=true";
	//"jdbc:derby:C:/Users/Cristian/MyDB;create=true";
	public static final String USER = "admin"; //"nbuser";
	public static final String PASS = "admin"; //"nbuser";
	
	public static void main(String[] args)
	{
		Connection conn = null;
		Statement stmt = null;
		try{
			conn = DriverManager.getConnection(DB_URL,USER,PASS);
			//conn.setAutoCommit(false);
			System.out.println("Connected succesfully!");
			
			stmt = conn.createStatement();

			System.out.println("Creating table...");
			String sqlCreate = "CREATE TABLE student(COD INT PRIMARY KEY, NUME VARCHAR(10), " +
					"VARSTA INT, INALTIME INT, CNP VARCHAR(13), SEX VARCHAR(2), FORMA VARCHAR(10))";
			stmt.executeUpdate(sqlCreate);
			
			//String sqlDelete = "DROP TABLE student";
			//stmt.executeUpdate(sqlDelete);
			
			System.out.println("Inserting records...");
			String sqlInsert = "INSERT INTO student VALUES(1000,'Ionel',23,180,'11111111','M','ID')";
			String sqlInsert1 = "INSERT INTO student VALUES(2000,'Gigel',24,178,'22222222','M','ZI')";
			stmt.executeUpdate(sqlInsert1);
			
			System.out.println("Updating records...");
			String sqlUpdate = "UPDATE student set NUME='Marcel' where COD=1000";
			stmt.executeUpdate(sqlUpdate);
			
			System.out.println("Deleting records...");
			String sqlDelete = "DELETE from student where COD=1000";
	        //stmt.executeUpdate(sqlDelete);
			
			List<Student> listaStud = new ArrayList<Student>();
			ResultSet rs = stmt.executeQuery("SELECT * from student");
			int nr = 0;
			while (rs.next()){
				System.out.println(++nr+" Nume "+rs.getString(2)+"\nCNP "+rs.getString(5));
				listaStud.add(new Student(rs.getInt(1), rs.getString(2),
						rs.getInt(3), rs.getInt(4), rs.getString(5),
						rs.getString(6), rs.getString(7)));
			}
			
			for(Student s: listaStud)
				System.out.println(s.toString());
			
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Nr. coloane: " + rsmd.getColumnCount());
			for(int i=1;i<=rsmd.getColumnCount();i++)
				System.out.println(rsmd.getColumnName(i) + " " +rsmd.getColumnTypeName(i));
			
			rs.close();
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
			if ((conn!=null) && (stmt!=null))
				try {
					conn.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
	}
}
