package Abstract_classes;

public abstract class Student {

    private int Student_ID;
    private String Department;
    private String First_Name;
    private String Last_name;
    private int PassOutYear;
    private int UniversityRank;

    public int getStudent_ID() {
        return Student_ID;
    }

    public void setStudent_ID(int student_ID) {
        Student_ID = student_ID;
    }

    public String getDepartment() {
        return Department;
    }

    public void setDepartment(String department) {
        Department = department;
    }

    public String getFirst_Name() {
        return First_Name;
    }

    public void setFirst_Name(String first_Name) {
        First_Name = first_Name;
    }

    public String getLast_name() {
        return Last_name;
    }

    public void setLast_name(String last_name) {
        Last_name = last_name;
    }

    public int getPassOutYear() {
        return PassOutYear;
    }

    public void setPassOutYear(int passOutYear) {
        PassOutYear = passOutYear;
    }

    public int getUniversityRank() {
        return UniversityRank;
    }

    public void setUniversityRank(int universityRank) {
        UniversityRank = universityRank;
    }
}
