package Day1;

import org.testng.annotations.Test;

public class _00_Entry {


    // if we are not put priority its be going to run alphabetical priority
    //we need to put inside after openweb( priority=1), logintest(priority=2), closedriver(priority=3)
    @Test
    void openWeb(){
        System.out.println("Opened web site");
    }

    @Test
    void loginTest(){
        System.out.println("Login test");
    }

    @Test
    void closeDriver(){
        System.out.println("Closed to driver and exit");
    }
}
