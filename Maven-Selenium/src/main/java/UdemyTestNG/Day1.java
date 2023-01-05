package UdemyTestNG;

import org.testng.annotations.AfterTest;
import org.testng.annotations.Test;

public class Day1 {
    @Test
    public void demo(){
        System.out.println("hello");
    }
    @Test
    public void test2(){
        System.out.println("bye");
    }
    @AfterTest
    public void lastExecution(){
        System.out.println("This will be executed last after the 'test' tag.");
    }
}
