import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin_interface_realization implements Admin_interface {
    final private Scanner sc = new Scanner(System.in);
    static Queries queriy = new Queries();
    @Override
    public String Welcome_statment() {

        System.out.println("Wow such admin. Choose an action to execute with your CRUD service.\nHere is what you can do:\n" +
                "/create\n" +
                "/update\n" +
                "/read\n" +
                "/delete");
        System.out.print("Enter an option:");
        String chosen_action = sc.nextLine();
        switch (chosen_action) {
            case "/create" -> Create();
            case "/read" -> Read();
            case "/update" -> Update();
            case "/delete" -> Delete();
        }
        return "";
    }

    @Override
    public int Create() {

        return 0;
    }

    @Override
    public int Update() {
        System.out.println("Updating");
        return 0;
    }

    @Override
    public int Delete() {
        System.out.println("Deleting");
        return 0;
    }

    @Override
    public int Read() {
        try {
            String pass_read_query = queriy.read_all_query();
            ResultSet result = DB_connection.pass_statement.executeQuery(pass_read_query);
            while (result.next()) {
                String UniveristyData = "";
                for (int i = 1; i <= 6; i++) {
                    UniveristyData += result.getString(i) + ":";
                }
                System.out.println(UniveristyData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return 0;
    }
}
