import java.sql.*;
import javax.swing.*;
public class koneksi {
    static PreparedStatement prm;
    static Connection conn;
    static Statement stm ;
    static ResultSet rst;
    public static void main(){ 
        try{
            Class. forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/crud-efficient-pbo", "root","");
        }catch(ClassNotFoundException | SQLException e) {
            JOptionPane.showMessageDialog(null," err connection "+e);
        }
    }
    public void set(String sql) { //<- for delete , update, insert
        try{
            prm = conn.prepareStatement(sql);
            prm.execute(); 
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"err query :" + e);
        }
    }
    public ResultSet get(String sql){ //<- ambil data 
        try{
            prm = conn.prepareStatement(sql);
            rst=prm.executeQuery(); 
        }catch(SQLException e) {
            JOptionPane.showMessageDialog(null,"err query :" + e);
        }
        return rst;
    }
}