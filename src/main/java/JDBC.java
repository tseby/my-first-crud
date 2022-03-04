import java.sql.*;

public class JDBC extends Admin_interface_realization {
    public static void main(String[] args) throws SQLException {
        DB_connection.Connect_to_database();
        Admin_interface_realization admin = new Admin_interface_realization();
        admin.Welcome_statment();
        }
    }
