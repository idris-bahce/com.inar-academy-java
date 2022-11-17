package chapters.chapter11.exercises.Exercise11_02;

import chapters.chapter10.exercises.Exercise10_14.MyDate;

public class Staff extends Employee{
    private String title;

    public Staff(String name, String address, String eMail, String phoneNumber,
                 MyDate dateOfHire, boolean hasAnOffice, int salary, String title) {
        super(name, address, eMail, phoneNumber, dateOfHire, hasAnOffice, salary);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return super.toString() + "\nTitle of the staff: " + title;
    }
}
