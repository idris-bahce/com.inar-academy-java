package chapters.chapter11.exercises.Exercise11_02;

public class Student extends Person{
    private int classStatus;
    public static final int FRESHMAN = 0;
    public static final int SOPHOMORE = 1;
    public static final int JUNIOR = 2;
    public static final int SENIOR = 3;

    public Student(String name, String address, String eMail, String phoneNumber, int classStatus) {
        super(name, address, eMail, phoneNumber);
        this.classStatus = classStatus;
    }

    public int getClassStatus() {
        return classStatus;
    }
    public String toString(){
        String status = "";
        if (classStatus == FRESHMAN){
            status = "Freshman";
        } else if (classStatus == SOPHOMORE) {
            status = "Sophomore";
        } else if (classStatus == JUNIOR) {
            status = "Junior";
        }else {
            status = "Senior";
        }
        return super.toString() + "\nStudent's status: " + status;
    }
}
