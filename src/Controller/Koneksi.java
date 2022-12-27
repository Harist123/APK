package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Koneksi {
    private static Connection con;
        public static Connection getKoneksi(){
            if(con==null){
                try{
                    String url;
                    url="jdbc:mysql://localhost:3306/apk";
                    String username = "root";
                    String password = "";
                    DriverManager.registerDriver(new com.mysql.jdbc.Driver());
                    con=DriverManager.getConnection(url,username,password); 
                }catch (SQLException e){
                    JOptionPane.showMessageDialog(null, "Koneksi Error");
                }
            }return con;
        }static Object getConnection(){
            throw new UnsupportedOperationException ("Not yet implemented");
        }
}
