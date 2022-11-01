package ro.ase.course9.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class SQLite2Example {

	public static void main(String[] args) {
		
		Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName("org.sqlite.JDBC");
            conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Cristian/BDSQLite");
            conn.setAutoCommit(true);
            System.out.println("Opened database successfully");
            
            stmt = conn.createStatement();
            String sql = "CREATE TABLE COMPANY " +
                   "(ID INT PRIMARY KEY     NOT NULL," +
                   " NAME           TEXT    NOT NULL, " + 
                   " AGE            INT     NOT NULL, " + 
                   " ADDRESS        CHAR(50), " + 
                   " SALARY         REAL)"; 
            //stmt.executeUpdate(sql);
            stmt.close();
            //c.close();
            System.out.println("Table created successfully");
            
            stmt = conn.createStatement();
            String sqlInsert = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " +
                        "VALUES (5, 'Paul', 32, 'California', 20000.00 );"; 
            stmt.executeUpdate(sqlInsert);

            sqlInsert = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (6, 'Allen', 25, 'Texas', 15000.00 );"; 
            stmt.executeUpdate(sqlInsert);

            sqlInsert = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (7, 'Teddy', 23, 'Norway', 20000.00 );"; 
            stmt.executeUpdate(sqlInsert);

            sqlInsert = "INSERT INTO COMPANY (ID,NAME,AGE,ADDRESS,SALARY) " + "VALUES (8, 'Mark', 25, 'Rich-Mond ', 65000.00 );"; 
            stmt.executeUpdate(sqlInsert);

            stmt.close();
            conn.commit();
            //c.close();
            System.out.println("Records created successfully");
            
            stmt = conn.createStatement();
            String sqlUpdate = "UPDATE COMPANY set SALARY = 25000.00 where ID=1;";
            stmt.executeUpdate(sqlUpdate);
            conn.commit();
            System.out.println("Operation done successfully");
            
            stmt = conn.createStatement();
            String sqlDelete = "DELETE from COMPANY where ID=2;";
            stmt.executeUpdate(sqlDelete);
            conn.commit();
            System.out.println("Operation done successfully");
            
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery( "SELECT * FROM COMPANY;" );
            while ( rs.next() ) {
                    int id = rs.getInt("id");
                    String  name = rs.getString("name");
                    int age  = rs.getInt("age");
                    String  address = rs.getString("address");
                    float salary = rs.getFloat("salary");
                    System.out.println( "ID = " + id );
                    System.out.println( "NAME = " + name );
                    System.out.println( "AGE = " + age );
                    System.out.println( "ADDRESS = " + address );
                    System.out.println( "SALARY = " + salary );
                    System.out.println();
            }
            rs.close();
            stmt.close();
            conn.close();
        } 
        catch(SQLException ex)
		{
			ex.printStackTrace();
		}
        catch (Exception ex) 
        {
            System.err.println(ex.getMessage());
        }
	}
}
