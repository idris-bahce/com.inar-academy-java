package UdemyTestNG;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Day4 {
    @Test
    public void webloginCarLoan(){
        System.out.println("Webloginhome");
    }
    @Test(groups = {"smoke"})
    public void mobileloginCarLoan(){
        System.out.println("Mobileloginhome");
        Assert.assertTrue(false);
    }
    @Test
    public void loginAPIHomeLoan(){
        System.out.println("APIloginhome");
    }
}
