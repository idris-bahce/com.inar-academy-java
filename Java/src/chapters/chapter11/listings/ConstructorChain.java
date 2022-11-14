package chapters.chapter11.listings;

public class ConstructorChain {
    public static void main(String[] args) {
        new Professor();
    }
}
class Professor extends Employee{
    public Professor(){
        System.out.println("Professor constructor is processed.");
    }
}
class Employee extends Human{
    public Employee(){
        this("We are calling other constructor of Employee.");
        System.out.println("Employee is processed.");
    }
    public Employee(String s){
        System.out.println(s);
    }
}
class Human{
    public Human(){
        System.out.println("Human constructor is processed.");
    }
}
