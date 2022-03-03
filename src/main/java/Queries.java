public abstract class Queries {

    private String tableName;
    private String Department;
    private String Student_ID;
    private String First_Name;
    private String Last_Name;
    private String PassOutYear;
    private String UniversityRank;

    //create
    public abstract String insert_query();
    //read
    public abstract String read_query();
    //Updtate
    public abstract String correct_query();
    //Delete
    public abstract String delete_query();


    public String getTableName() {
        return tableName;
    }

    public String getDepartment() {return Department;}

    public String getStudent_ID() {return Student_ID;}

    public String getFirst_Name() {
        return First_Name;
    }

    public String getLast_Name() {
        return Last_Name;
    }

    public String getPassOutYear() {
        return PassOutYear;
    }

    public String getUniversityRank() {
        return UniversityRank;
    }

    public void setTableName(String tableName) {
        this.tableName = tableName;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public void setStudent_ID(String student_ID) {
        Student_ID = student_ID;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public void setLast_Name(String last_Name) {
        Last_Name = last_Name;
    }

    public void setPassOutYear(String passOutYear) {
        PassOutYear = passOutYear;
    }

    public void setUniversityRank(String universityRank) {
        UniversityRank = universityRank;
    }

}
