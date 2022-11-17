package chapters.chapter11.exercises.Exercise11_02;

public class Person {
    private String name;
    private String address;
    private String phoneNumber;
    private String eMail;

    public Person(){
    }

    public Person(String name, String address, String eMail, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.eMail = eMail;
        this.phoneNumber = phoneNumber;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String geteMail() {
        return eMail;
    }

    @Override
    public String toString() {
        return "Person's name: " + name +
        "\nPerson's adress: " + address +
        "\nPerson's phone number: " + phoneNumber +
        "\nPerson's e mail: " + eMail;
    }
}
