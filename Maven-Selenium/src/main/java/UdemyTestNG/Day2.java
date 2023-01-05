package UdemyTestNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Day2 {
    @Test(groups = {"smoke"})
    public void ploan(){
        System.out.println("good");
    }
    @BeforeTest
    public void prerequised(){
        System.out.println("This will be executed before 'test' tag.");
    }
}
