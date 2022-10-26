package chapters.chapter09.listings;

public class Ogrenci {
    private  int id;
    private String name;
    private java.util.Date dateCreated;

    public Ogrenci(int ssn, String newName){
        id = ssn;
        name = newName;
        dateCreated = new java.util.Date();
    }

    public int getId(){
        return id;
    }

    public String getName(){
        return name;
    }

    public java.util.Date getDateCreated(){
        return dateCreated;
    }
}
