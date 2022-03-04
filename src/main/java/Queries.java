public abstract class Queries {

    private String tableName;
    private String Department;
    private int Student_ID;
    private String First_Name;
    private String Last_Name;
    private int PassOutYear;
    private int UniversityRank;
    private int DeleteOptions;

    //Create
    public abstract String insert_query(String table_name, int student_id, String department, String first_name, String last_name, int passout_year, int uni_rank);
    //Read
    public abstract String read_query();
    //Updtate
    public abstract String correct_query();
    //Delete
    public abstract String delete_query(String table_name, String column_name, String delete_target);
    //Deleting functionality
    public abstract String delete_all_rows_query();
    public abstract String delete_specific_row_query();

    public String getTableName() {
        return tableName;
    }

    public String getDepartment() {return Department;}

    public int getStudent_ID() {return Student_ID;}

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public int getPassOutYear() {
        return PassOutYear;
    }

    public int getUniversityRank() {
        return UniversityRank;
    }

    public int getDeleteOptions() {return DeleteOptions;}

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setStudent_ID(int student_ID) {
        Student_ID = student_ID;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public void setPassOutYear(int passOutYear) {
        PassOutYear = passOutYear;
    }

    public void setUniversityRank(int universityRank) {
        UniversityRank = universityRank;
    }

    public void setDeleteOptions(int deleteOptions) {DeleteOptions = deleteOptions;}
}
