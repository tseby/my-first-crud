import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin_interface_realization extends Queries implements Admin_interface {
    final private Scanner sc = new Scanner(System.in);
    private String delete_query_decider;
    private String pass_delete_query;

    @Override
    public String Welcome_statment() {
        delete_query_decider = "";
        pass_delete_query = "";
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
        System.out.print("Enter SQL table name (EngineeringStudents): ");
        setTableName(sc.nextLine());
        System.out.print("Enter Department name: ");
        setDepartment(sc.nextLine());
        System.out.print("Enter Student_ID: ");
        setStudent_ID(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter student's first name: ");
        setFirst_Name(sc.nextLine());
        System.out.print("Enter student's last name: ");
        setLast_Name(sc.nextLine());
        System.out.print("Enter student's pass-out year: ");
        setPassOutYear(Integer.parseInt(sc.nextLine()));
        System.out.print("Enter student's university rank: ");
        setUniversityRank(Integer.parseInt(sc.nextLine()));
        //INSERT INTO EngineeringStudents VALUE (10215, 'CSE', 'Rajath', 'Kumar', 2019, 134);
        String pass_create_query = insert_query(getTableName(), getStudent_ID(), getDepartment(), getFirst_Name(), getLast_Name(), getPassOutYear(), getUniversityRank());
        try {
            DB_connection.pass_statement.executeUpdate(pass_create_query);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Welcome_statment();
        return 0;
    }

    @Override
    public int Read() {
        try {
            String pass_read_query = read_query();
            ResultSet result = DB_connection.pass_statement.executeQuery(pass_read_query);
            while (result.next()) {
                String UniveristyData = "";
                for (int i = 1; i <= 6; i++) {
                    UniveristyData += result.getString(i) + ";";
                }
                System.out.println(UniveristyData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Welcome_statment();
        return 0;
    }

    @Override
    public int Update() {
        System.out.print("Let us update the data in your data base!\n" +
                "What table would you like to work with?");
        String table_name = sc.nextLine();
        System.out.print("Specify the columns you want to work with:");
        String columns_to_be_updated = sc.nextLine();
        System.out.println("Specify the pointer (primary key): ");
        String pointer = sc.nextLine();
        correct_query(table_name, columns_to_be_updated, pointer);
        return 0;
    }

    @Override
    public int Delete() {
        System.out.print("Lets delete some data! Choose what you want to delete (enter a number):\n" +
                "   1) Delete all rows in a table;\n" +
                "   2) Delete a specific row in a table;\n");
        setDeleteOptions(Integer.parseInt(sc.nextLine()));
        switch (getDeleteOptions()) {
            case 1 -> delete_all_rows_query();
            case 2 -> delete_specific_row_query();
        }
        try {
            if (delete_query_decider.equals("remove_all_rows")) {
                DB_connection.pass_statement.executeUpdate(pass_delete_query);
            } else if (delete_query_decider.equals("remove_specific_row")) {
                DB_connection.pass_statement.executeUpdate(pass_delete_query);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        Welcome_statment();
        return 0;
    }

    //-----------------------------------------+
//INSERT INTO EngineeringStudents VALUE (10215, 'CSE', 'Rajath', 'Kumar', 2019, 134);
    @Override
    public String insert_query(String table_name, int student_id, String department, String first_name, String last_name, int passout_year, int uni_rank) {
        return String.format("INSERT INTO %s VALUES (%s, '%s', '%s', '%s', '%s', '%s');", table_name, student_id, department, first_name, last_name, passout_year, uni_rank);
    }

    @Override
    public String read_query() {
        return "select * from EngineeringStudents";
    }

    @Override
    public String correct_query(String table_name, String column, String pointer) {
        return String.format("UPDATE %s\n" +
                "Set",table_name);
    }

    @Override
    public String delete_query() {

        return "";
    }

    @Override
    public String delete_all_rows_query() {
        System.out.print("Choose a table to delete all rows from: ");
        String table_to_delete = sc.nextLine();
        String delete_all_rows_query = String.format("DELETE FROM %s", table_to_delete);
        delete_query_decider = "remove_all_rows";
        return pass_delete_query = delete_all_rows_query;
    }

    @Override
    public String delete_specific_row_query() {
        System.out.print("Choose a table to delete a row from:");
        String table_to_delete = sc.nextLine();
        System.out.print("Choose a column to delete a row from:");
        String column_of_choise = sc.nextLine();
        System.out.print("Specify what exactly to be deleted:");
        String specific_chars = sc.nextLine();
        String delete_query = String.format("DELETE FROM %s WHERE %s = '%s' ", table_to_delete, column_of_choise, specific_chars);
        delete_query_decider = "remove_specific_row";
        return pass_delete_query = delete_query;
    }
}
