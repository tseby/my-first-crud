package Connection;

import java.sql.*;

public class DB_connection {
    public static Statement pass_statement;
    private static final String URL = "jdbc:mysql://localhost:3306/university";
    private static final String NAME = "root";
    private static final String PASSWORD = "yjdtqibqjhajuhfabxtcrbqckjdfhm,jktt100000ckjd!";
private static int junit_testing_integer = 0;



    public static Statement Connect_to_database() throws SQLException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
            Connection con = DriverManager.getConnection(URL, NAME, PASSWORD);
            Statement statement = con.createStatement(); // sout
        junit_testing_integer =1;
        return pass_statement = statement;
    }
    public static int getJunit_testing_integer() {
        return junit_testing_integer;
    }

}
