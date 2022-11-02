package chapters.chapter10.listings;

public class Course {
    private String courseName;
    private String[] students = new String[10];
    private int numberOfStudents;

    public Course() {
    }

    public Course(String courseName) {
        this.courseName = courseName;
    }
    public void addStudent(String student){
        students[numberOfStudents]=student;
        numberOfStudents++;
    }
    public void dropStudent(String student){}
    public String getCourseName() {
        return courseName;
    }

    public String[] getStudents() {
        return students;
    }

    public int getNumberOfStudents() {
        return numberOfStudents;
    }

}
