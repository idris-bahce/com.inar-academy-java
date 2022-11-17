package chapters.chapter11.exercises.Exercise11_02;

import chapters.chapter10.exercises.Exercise10_14.MyDate;

public class Faculty extends Employee{
    private String officeHours;
    private String rank;

    public Faculty(String name, String address, String eMail, String phoneNumber,
                   MyDate dateOfHire, boolean hasAnOffice, int salary, String officeHours, String rank) {
        super(name, address, eMail, phoneNumber, dateOfHire, hasAnOffice, salary);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public String getRank() {
        return rank;
    }

    @Override
    public String toString() {
        return super.toString() + "\nOffice hour of the faculty member: " + officeHours
                + "\nRank of the faculty member: " + rank;
    }
}
