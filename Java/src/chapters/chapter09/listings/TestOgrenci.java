package chapters.chapter09.listings;

public class TestOgrenci {
    public static void main(String[] args) {
        Ogrenci student = new Ogrenci(111223333,"john");
        java.util.Date dateCreated = student.getDateCreated();
        dateCreated.setTime(200000);
    }
}
