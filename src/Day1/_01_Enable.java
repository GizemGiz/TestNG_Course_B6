package Day1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;


public class _01_Enable {


    @Test
    void test1(){
        System.out.println("test 1");
    }

    @Test(enabled = false)
    void test2(){
        System.out.println("test 2");
    }

    @Test
    void test3(){
        System.out.println("test 3");
    }

    @BeforeClass
    void startNames(){
        System.out.println("Driver start ...");
    }


    @AfterClass
    void finishNames(){
        System.out.println("Driver stop ...");
    }
}
