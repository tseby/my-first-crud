package Connection;

import java.sql.*;

public class DB_connection {
    public static Statement pass_statement;
    private static final String URL = "jdbc:mysql://localhost:3306/university";
    private static final String NAME = "root";
    private static final String PASSWORD = "yjdtqibqjhajuhfabxtcrbqckjdfhm,jktt100000ckjd!";

    public static Statement Connect_to_database() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            Connection con = DriverManager.getConnection(URL, NAME, PASSWORD);
            Statement statement = con.createStatement(); // sout

        return pass_statement = statement;
    }

}
