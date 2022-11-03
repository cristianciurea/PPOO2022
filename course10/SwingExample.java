package ro.ase.seminar10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class SwingExample extends JFrame implements ActionListener {

    String Driver = null;
    String Database = null;
    String User = null;
    String Pass = null;
    String SQL = null;

    JTextField tfDriver;
    JTextField tfDatabase;
    JTextField tfUsername;
    JTextField tfPassword;
    JTextField tfSQL;
    JButton button;
    JTextArea textArea;

    public SwingExample()
    {
        setTitle("Database application");
        setLayout(new FlowLayout());

        JLabel label1 = new JLabel("Driver");
        add(label1);
        tfDriver = new JTextField(60);
        tfDriver.setText("org.sqlite.JDBC");
        add(tfDriver);

        JLabel label2 = new JLabel("Database URL");
        add(label2);
        tfDatabase = new JTextField(60);
        tfDatabase.setText("jdbc:sqlite:C:/Users/Administrator/MySQLiteDB");
        add(tfDatabase);

        JLabel label3 = new JLabel("Username");
        add(label3);
        tfUsername = new JTextField(60);
        add(tfUsername);

        JLabel label4 = new JLabel("Password");
        add(label4);
        tfPassword = new JTextField(60);
        add(tfPassword);

        JLabel label5 = new JLabel("SQL command");
        add(label5);
        tfSQL = new JTextField(60);
        tfSQL.setText("SELECT * FROM studenti");
        add(tfSQL);

        button = new JButton("Executa");
        add(button);
        button.addActionListener(this);

        textArea = new JTextArea(10, 60);
        add(textArea);
    }

    private void processData()
    {
        Driver = tfDriver.getText();
        if(Driver.equals(""))
            Driver = "org.sqlite.JDBC";

        Database = tfDatabase.getText();
        if(Database.equals(""))
            Database = "jdbc:sqlite:C:/Users/Administrator/MySQLiteDB";

        User = tfUsername.getText();

        Pass = tfPassword.getText();

        SQL = tfSQL.getText();
        if(SQL.equals(""))
            SQL = "SELECT * FROM studenti";
    }

    private String getField(ResultSet rs, int dataType, int col) throws SQLException {
        switch (dataType)
        {
            case Types
                    .VARCHAR:
                String str = rs.getString(col);
            case Types.INTEGER:
                int x = rs.getInt(col);
                return (new Integer(x)).toString();
        }
        return "";
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        textArea.setText("");
        processData();
        try
        {
            Class.forName(Driver);
            Connection conn = DriverManager.getConnection(Database, User, Pass);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(SQL);

            ResultSetMetaData rsmd = rs.getMetaData();
            int numCols = rsmd.getColumnCount();
            while(rs.next())
            {
                String record = "";
                for(int i=1;i<=numCols;i++)
                {
                    int dataType = rsmd.getColumnType(i);
                    record+= getField(rs, dataType, i)+" ";
                }
                textArea.append(record+"\n");
            }
        }
        catch (Exception ex)
        {
            ex.printStackTrace();
        }
    }

    public static void main(String[] args) {
        SwingExample frame = new SwingExample();
        frame.setBounds(1,1,700,500);
        frame.setVisible(true);
    }
}
