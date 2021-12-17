 package bt.pkg2;

import java.sql.DriverManager;
import java.sql.Connection;
import javax.swing.JOptionPane;


public class Database {
    final static String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    final static String DB_URL = "jdbc:mysql://localhost/student_managerment";
    
    final static String USER = "root";
    final static String PASSWORD = "";
   
    public static Connection connection(){
        try{
            Class.forName(JDBC_DRIVER);
            
            Connection connection = DriverManager.getConnection(DB_URL,USER,PASSWORD);
            
            return connection;
            
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
        
    }
}
