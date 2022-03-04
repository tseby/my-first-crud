import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Admin_interface_realization extends Queries implements Admin_interface {
    final private Scanner sc = new Scanner(System.in);

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
        StringBuilder query_builder = new StringBuilder();
//INSERT INTO EngineeringStudents VALUE (10215, 'CSE', 'Rajath', 'Kumar', 2019, 134);
        String pass_create_query = insert_query(getTableName(), getStudent_ID(), getDepartment(), getFirst_Name(), getLast_Name(), getPassOutYear(), getUniversityRank());//String.format("INSERT INTO %s VALUES (%s, '%s', '%s', '%s', '%s', '%s');", getTableName(), getStudent_ID(), getDepartment(), getFirst_Name(), getLast_Name(), getPassOutYear(), getUniversityRank());
        try {
            int result = DB_connection.pass_statement.executeUpdate(pass_create_query);


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
        System.out.println("Updating");
        return 0;
    }

    @Override
    public int Delete() {
        System.out.println("Enter delete options: ");

        System.out.println("Deleting");
        return 0;
    }

    //-----------------------------------------+
//INSERT INTO EngineeringStudents VALUE (10215, 'CSE', 'Rajath', 'Kumar', 2019, 134);
    @Override
    public String insert_query(String table_name, int student_id, String department, String first_name, String last_name, int passout_year, int uni_rank) {
        String insert_query = String.format("INSERT INTO %s VALUES (%s, '%s', '%s', '%s', '%s', '%s');", table_name, student_id, department, first_name, last_name, passout_year, uni_rank);
        ;
        return insert_query;
    }

    @Override
    public String read_query() {
        return "select * from EngineeringStudents";
    }

    @Override
    public String correct_query() {
        return null;
    }

    @Override
    public String delete_query(String table_name, String column_name, String delete_target) {
        System.out.print("Lets delete some data! Choose what you want to delete:\n" +
                "   1) Delete all rows in a table;" +
                "   2) Delete a specific row in a table;");
        setDeleteOptions(Integer.parseInt(sc.nextLine()));
        switch (getDeleteOptions()) {
            case 1 -> Create();
            case 2 -> Read();

        }
        String delete_query = String.format("DELETE FROM %s WHERE %s = '%s' ");
        return delete_query;
    }

    @Override
    public String delete_all_rows_query() {
        return null;
    }

    @Override
    public String delete_specific_row_query() {
        return null;
    }
}
