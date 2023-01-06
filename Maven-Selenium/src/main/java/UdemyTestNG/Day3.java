package UdemyTestNG;

import org.testng.annotations.*;

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
    @Test(dataProvider = "getData")
    public void mobileSignin(String username, String password){
        System.out.println("sign in");
        System.out.println(username);
        System.out.println(password);
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
    @DataProvider
    public Object getData(){
        Object[][] data = new Object[3][2];

        data[0][0] = "firstusername";
        data[0][1] = "firstpassword";

        data[1][0] = "secondusername";
        data[1][1] = "secondpassword";

        data[2][0] = "thirdusername";
        data[2][1] = "thirdpassword";
        return data;
    }
}
