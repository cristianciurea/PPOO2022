package ro.ase.course9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLiteExample {

	public static void main(String[] args) {
		
		Connection conn = null;
		Statement stmt = null;
		try{
			Class.forName("org.sqlite.JDBC");
			//conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Cristian/MySQLiteDB");
			conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Cristian/TestCursSQLite");
			conn.setAutoCommit(true);
			System.out.println("Connected succesfully!");
			
			stmt = conn.createStatement();
			String sqlCreate = "CREATE TABLE studenti(COD INT PRIMARY KEY," +
					"NUME VARCHAR(10),VARSTA INT,INALTIME INT, CNP VARCHAR(13)," +
					"SEX VARCHAR(2),FORMA VARCHAR(10))";
			//stmt.executeUpdate(sqlCreate);
			System.out.println("Table created successfuly!");
		
			String sqlInsert = "INSERT INTO studenti VALUES(101,'Ionel',23,180,'1234567890123','M','ZI')";
			//stmt.executeUpdate(sqlInsert);
			System.out.println("Record inserted successfuly!");
		
			String sqlUpdate = "UPDATE studenti set forma='ID' where COD=101";
			stmt.executeUpdate(sqlUpdate);
			System.out.println("Record updated successfuly!");
			
			String sqlDelete = "DELETE from studenti where COD=100";
	        stmt.executeUpdate(sqlDelete);
	        System.out.println("Record deleted successfuly!");
	        
			ResultSet rs = stmt.executeQuery("SELECT * from studenti");
			ResultSetMetaData rsmd = rs.getMetaData();
			System.out.println("Nr. coloane: " + rsmd.getColumnCount());
			for(int i=1;i<=rsmd.getColumnCount();i++)
				System.out.println(rsmd.getColumnName(i) + " " +rsmd.getColumnTypeName(i));
			
			int nr = 0;
			while (rs.next())
			{
				System.out.println(++nr+" Nume "+
				rs.getString(2)+"\nCNP "+rs.getString(5)+" FORMA "+rs.getString(7));
			}
			
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
			if (conn!=null)
				try {
					conn.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
		}
	}
}
