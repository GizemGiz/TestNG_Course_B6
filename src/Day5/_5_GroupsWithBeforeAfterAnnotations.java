package Day5;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class _5_GroupsWithBeforeAfterAnnotations {
    @BeforeMethod(alwaysRun = true) //ignore everything but executed this
    public void beforeMethod(){
        System.out.println("before method");
    }

    @AfterMethod(alwaysRun = true)
    public void afterMethod(){
        System.out.println("after method");
    }

    @Test (groups = "Regression")
    public void test1(){
        System.out.println("test1");
    }

    @Test (groups = "SmokeTest")
    public void test2(){
        System.out.println("test2");
    }
}
