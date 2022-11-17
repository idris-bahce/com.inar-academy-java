package chapters.chapter11.exercises.Exercise11_02;

import chapters.chapter10.exercises.Exercise10_14.MyDate;

public class Employee extends Person{
    private MyDate dateOfHire;
    private boolean hasAnOffice;
    private int salary;


    public Employee(String name, String address, String eMail, String phoneNumber, MyDate dateOfHire, boolean hasAnOffice, int salary) {
        super(name, address, eMail, phoneNumber);
        this.dateOfHire = dateOfHire;
        this.hasAnOffice = hasAnOffice;
        this.salary = salary;
    }

    public MyDate getDateOfHire() {
        return dateOfHire;
    }

    public boolean isHasAnOffice() {
        return hasAnOffice;
    }

    public int getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDate of hire: " + dateOfHire
                + "\nHas employee has an office: " + hasAnOffice
                + "Salary of the employee: " + salary;
    }
}
