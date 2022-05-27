package buoi02;

public class Student {
    private String id;
    private String fullName;
    private double grades;
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public String getFullName() {
        return fullName;
    }
    public void setFullName(String fullName) {
        this.fullName = fullName;
    }
    public double getGrades() {
        return grades;
    }
    public void setGrades(double grades) {
        this.grades = grades;
    }
    public Student(String id, String fullName, double grades) {
        this.id = id;
        this.fullName = fullName;
        this.grades = grades;
    }
    public Student() {
    }
    @Override
    public String toString() {
        return "Student{" + "id=" + id + ", fullName=" + fullName + ", grades=" + grades + '}';
    }
}
