import java.sql.*;

public class DB_connection extends Queries {
    public static Statement pass_statement;

    public static Statement Connect_to_database() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/university";
        final String uname = "root";
        final String password = "yjdtqibqjhajuhfabxtcrbqckjdfhm,jktt100000ckjd!";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            Connection con = DriverManager.getConnection(url, uname, password);
            Statement statement = con.createStatement();

        return pass_statement = statement;
    }


}
