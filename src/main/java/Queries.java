public class Queries {

    private String tableName;
    private String Department;
    private String Student_ID;
    private String First_Name;
    private String Last_Name;
    private String PassOutYear;
    private String UniversityRank;



    //create
    public String insert(){
        return "INSERT INTO EngineeringStudents";
    }
    //read
    public String read_all_query(){
        return "select * from EngineeringStudents";
    }
    //Updtate
    public String correct_query(){

        return "";
    }
    //Delete
    public String delete_query(){

        return"";
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
