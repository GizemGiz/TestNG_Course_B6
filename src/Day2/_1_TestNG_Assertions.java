package Day2;

import org.testng.Assert;
import org.testng.annotations.Test;

public class _1_TestNG_Assertions {

    @Test
    public void assertEquals() {

        String expected = "Hello";
        String actual = "Hello";

        Assert.assertEquals(actual, expected);
    }

    @Test
    public void assertEquals2() {

        String expected = "Hello";
        String actual = "hello";

        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result");
        //result will be fail.
        // because actual result start 'h' not 'H'.
        // Letter sensitive

    }

    @Test
    public void assertEquals3(){

        String[] expected = {"Hello", "Twenty"};
        String[] actual = {"Hello", "Twenty"};

        Assert.assertEquals(actual, expected, "Actual result should be equal to Expected result");
    }

}
