package chapters.chapter11.exercises.Exercise11_10;

import java.util.ArrayList;

public class MyStack1 extends ArrayList {
    public int getSize(){
        return size();
    }
    public Object peek(){
        return get(size() - 1);
    }
    public Object pop(){
        Object o = peek();
        remove(peek());
        return o;
    }
    public void push(Object o){
        add(o);
    }
}
