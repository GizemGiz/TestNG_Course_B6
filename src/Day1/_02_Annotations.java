package Day1;

import org.testng.annotations.*;

public class _02_Annotations {

    /*
       @BeforeClass -->
          @BeforeMethod
              @Test
              @Test
          @BeforeMethod
       @BeforeClass
     */

    @BeforeClass
    void beforeClass(){
        System.out.println("Working before all class: before class");}

    @BeforeMethod
    void beforeMethod(){
        System.out.println("Will work before method: before method");}


    @Test
    void test1(){
        System.out.println("Test 1 is worked");}
    @Test
    void test2(){
        System.out.println("Test2 is worked");}


    @AfterMethod
    void afterMethod(){
        System.out.println("Will work after method: after method");}

    @AfterClass
    void afterClass(){
        System.out.println("Will work after class: after class");}
}
