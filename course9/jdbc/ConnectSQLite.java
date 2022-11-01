package ro.ase.course9.jdbc;

import java.sql.*;

public class ConnectSQLite {

    public static Connection connect(String fileName) {
        Connection conn = null;
        try {
            Class.forName("org.sqlite.JDBC");
            // db parameters
            String url = "jdbc:sqlite:C:/Users/Cristian/" + fileName;
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

        } catch (SQLException | ClassNotFoundException e) {
            System.out.println(e.getMessage());
        } /*finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }*/
        return conn;
    }

    public static void createNewTable(String fileName) {
        // SQLite connection string
        String url = "jdbc:sqlite:C:/Users/Cristian/" + fileName;

        // SQL statement for creating a new table
        String sqlCreate = "CREATE TABLE employees(id integer PRIMARY KEY, name VARCHAR(10) NOT NULL, capacity real)";

        try{
            Connection conn = DriverManager.getConnection(url);
            Statement stmt = conn.createStatement();
            stmt.execute(sqlCreate);

            System.out.println("Table created!");
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void insert(int id, String name, double capacity) {
        String sqlInsert = "INSERT INTO employees(id, name, capacity) VALUES(?, ?, ?)";

        try{
            //Class.forName("org.sqlite.JDBC");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Cristian/TestCursSQLite1.db");
            Connection conn = connect("TestCursSQLite3.db");
            PreparedStatement pstmt = conn.prepareStatement(sqlInsert);
            pstmt.setInt(1, id);
            pstmt.setString(2, name);
            pstmt.setDouble(3, capacity);
            pstmt.executeUpdate();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void selectAll(){
        String sql = "SELECT * FROM employees";

        try {
            //Class.forName("org.sqlite.JDBC");
            //Connection conn = DriverManager.getConnection("jdbc:sqlite:C:/Users/Cristian/TestCursSQLite1.db");
            Connection conn = connect("TestCursSQLite3.db");
            Statement stmt  = conn.createStatement();
            ResultSet rs    = stmt.executeQuery(sql);

            // loop through the result set
            while (rs.next()) {
                System.out.println(rs.getInt("id") +  "\t" +
                        rs.getString("name") + "\t" +
                        rs.getDouble("capacity"));
            }
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }

    public static void main(String[] args) {
        connect("TestCursSQLite3.db");
        createNewTable("TestCursSQLite3.db");
        insert(1, "Aryan", 30000);
        insert(2, "Robert", 40000);
        insert(3, "Jerry", 50000);
        selectAll();
    }
}
