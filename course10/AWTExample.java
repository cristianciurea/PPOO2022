package ro.ase.seminar10;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class AWTExample extends Frame implements ActionListener {

    String Driver = null;
    String Database = null;
    String User = null;
    String Pass = null;
    String SQL = null;

    TextField tfDriver;
    TextField tfDatabase;
    TextField tfUsername;
    TextField tfPassword;
    TextField tfSQL;
    Button button;
    TextArea textArea;
    Label status;

    public AWTExample()
    {
        setTitle("Database application");
        setLayout(new FlowLayout());

        Label label1 = new Label("Driver");
        add(label1);
        tfDriver = new TextField(60);
        tfDriver.setText("org.sqlite.JDBC");
        add(tfDriver);

        Label label2 = new Label("Database URL");
        add(label2);
        tfDatabase = new TextField(60);
        tfDatabase.setText("jdbc:sqlite:C:/Users/Administrator/MySQLiteDB");
        add(tfDatabase);

        Label label3 = new Label("Username");
        add(label3);
        tfUsername = new TextField(60);
        add(tfUsername);

        Label label4 = new Label("Password");
        add(label4);
        tfPassword = new TextField(60);
        add(tfPassword);

        Label label5 = new Label("SQL command");
        add(label5);
        tfSQL = new TextField(60);
        tfSQL.setText("SELECT * FROM studenti");
        add(tfSQL);

        button = new Button("Executa");
        add(button);
        button.addActionListener(this);

        textArea = new TextArea(10, 60);
        add(textArea);

        addWindowListener(new MyWindowAdapter());

        status = new Label();
        add(status);

        textArea.addMouseListener(new MouseHandler());
        textArea.addMouseMotionListener(new MouseHandler());
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

    class MyWindowAdapter extends WindowAdapter
    {
        @Override
        public void windowClosing(WindowEvent e) {
            System.exit(0);
        }
    }

    class MouseHandler implements MouseListener, MouseMotionListener
    {

        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {

        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {
            status.setText("Mouse entered!");
        }

        @Override
        public void mouseExited(MouseEvent e) {
            status.setText("Mouse exited!");
        }

        @Override
        public void mouseDragged(MouseEvent e) {

        }

        @Override
        public void mouseMoved(MouseEvent e) {

        }
    }

    public static void main(String[] args) {
        AWTExample frame = new AWTExample();
        frame.setBounds(1,1,500,700);
        frame.setVisible(true);
    }
}
