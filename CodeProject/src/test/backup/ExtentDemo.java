package TestDemo;

import javafx.animation.Animation;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class ExtentDemo {
    @Test
    public void test1(){
        Assert.assertTrue(false);
    }

    @Test
    public void test2(){
        Assert.assertTrue(true);
    }

    @Test
    public void logDemo(){
        Reporter.log("this is our log");
        throw new RuntimeException("our own exception");
    }
}
