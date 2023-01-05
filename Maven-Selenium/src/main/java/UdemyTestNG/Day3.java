package UdemyTestNG;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Day3 {
    @Parameters({"URL","usrname"})
    @Test
    public void webloginCarLoan(String URLName,String username){
        System.out.println("weblogincar");
        System.out.println(URLName);
        System.out.println(username);
    }
    @Test(groups = {"smoke"})
    public void mobileloginCarLoan(){
        System.out.println("mobilelogincar");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("This will be printed before 'suite' tag");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("This will be printed after 'suite' tag");
    }
    @Test
    public void loginAPICarLoan(){
        System.out.println("APIlogincar");
    }
}
