import java.sql.*;
import javax.swing.*;
public class koneksi_void {
    Connection con;
    Statement stm;
    public void db(){
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/demoukk_pbo", "root", "");
            stm = con.createStatement();
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
    }
}
