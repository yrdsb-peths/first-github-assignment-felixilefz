public class Student {
    private String firstName;
    private String lastName;
    private int gradeLevel;
    private double gpa;

    public Student(String fName, String lName, int grade) {
        firstName = fName;
        lastName = lName;
        gradeLevel = grade;
    }
    
    public String getFirstName() {
        return firstName;
    }
    
    public String getLastName() {
        return lastName;
    }
    
    public int getGradeLevel() {
        return gradeLevel;
    }
    
    public double getGPA() {
        return gpa;
    }
    
    public void setGPA(double theGPA) {
        gpa = theGPA;
    }

    public String toString() {
        return firstName + " " + lastName + " is in grade: " + gradeLevel;
    }
}