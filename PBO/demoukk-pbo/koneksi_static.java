import java.sql.*;
import javax.swing.*;

public class koneksi_static {

    private static Connection con;

    public static Connection db() throws SQLException {
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            con = DriverManager.getConnection("jdbc:mysql://localhost/demoukk_pbo", "root", "");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
        }
        return con;
    }
}
