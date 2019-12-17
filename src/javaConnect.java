
import java.sql.*;
import javax.swing.JOptionPane;

public class javaConnect {

    Connection conn;

    public static Connection connectDb() {
        try {

            Class.forName("com.mysql.jdbc.Driver");
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarynew?autoReconnect=true&useSSL=false", "root", "9603159591");
            
            return conn;

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);

        }
        return null;

    }
}
