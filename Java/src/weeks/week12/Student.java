package weeks.week12;

public class Student {
    private String name;
    private String surName;
    private int id;
    private String eMail;

    Student() {
        this("", "", 0, "");
    }

    Student(String name, String surName, int id, String eMail) {
        this.name = name;
        this.surName = surName;
        this.id = id;
        this.eMail = eMail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurName() {
        return surName;
    }

    public void setSurName(String surName) {
        this.surName = surName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String geteMail() {
        return eMail;
    }

    public void seteMail(String eMail) {
        this.eMail = eMail;
    }

    public void print() {
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surName);
        System.out.println("ID: " + id);
        System.out.println("e-Mail: " + eMail);
    }
}
