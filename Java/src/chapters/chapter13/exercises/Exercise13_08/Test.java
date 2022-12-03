package chapters.chapter13.exercises.Exercise13_08;

public class Test {
    public static void main(String[] args) throws CloneNotSupportedException {

        MyStack myStack = new MyStack();
        myStack.push(310);
        myStack.push(1410);
        myStack.push(1101);
        myStack.push(1907);

        MyStack myStack1 = (MyStack) myStack.clone();
        System.out.println("Is it shallow copy? " + (myStack1 == myStack));
        System.out.println("Cloned " + myStack1);
        System.out.println("Original " + myStack);
    }
}
