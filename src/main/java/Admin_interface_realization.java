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
        System.out.print("Enter SQL table name: ");
        setTableName(sc.nextLine());
        System.out.print("Enter Department name: ");
        setDepartment(sc.nextLine());
        System.out.print("Enter Student_ID: ");
        setStudent_ID(sc.nextLine());
        System.out.print("Enter student's first name: ");
        setFirst_Name(sc.nextLine());
        System.out.print("Enter student's last name: ");
        setLast_Name(sc.nextLine());
        System.out.print("Enter student's pass-out year: ");
        setPassOutYear(sc.nextLine());
        System.out.print("Enter student's university rank: ");
        setUniversityRank(sc.nextLine());
StringBuilder query_builder = new StringBuilder();
        String pass_create_query = String.format("INSERT INTO %s VALUES (%");
               // "INSERT INTO "+ getTableName()+" VALUES " + "("+getStudent_ID()+getDepartment()+getFirst_Name()+getLast_Name()+getPassOutYear() + getUniversityRank();
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
                    UniveristyData += result.getString(i) + ":";
                }
                System.out.println(UniveristyData);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
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
    public String insert_query() {
        return null;
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
    public String delete_query() {
        return null;
    }
}
