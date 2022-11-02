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

    public void addStudent(String student) {
        if (!isCourseFull(students)) {
            students[numberOfStudents] = student;
            numberOfStudents++;
        } else {
            System.out.println("Course is full." + student + " can not attain this course.");
        }
    }

    private boolean isCourseFull(String[] students) {
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null) {
                return false;
            }
        }
        return true;
    }

    public void dropStudent(String student) {
        int indexOfDroppedStudent = 0;
        for (int i = 0; i < students.length; i++) {
            if (students[i] == null){
                continue;
            }
            if (students[i].equalsIgnoreCase(student)) {
                students[i] = null;
                indexOfDroppedStudent = i;
                numberOfStudents--;
            }
        }
        for (int i = indexOfDroppedStudent; i < students.length - 1; i++) {//shift the empty index left
            students[indexOfDroppedStudent] = students[i + 1];
            indexOfDroppedStudent++;
        }
    }

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
