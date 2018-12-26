package TestDemo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.TestNG;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class MySeleniumTest1 {



        @Test
        public void testcase1() {
            // 指定Chromedriver的位置
            System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "/src/tools/chromedriver");
            WebDriver driver = new ChromeDriver();
            driver.get("http://www.baidu.com/");
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
            driver.close();
            Assert.assertTrue(true);
        }


        @Test
        public void testcase2() {
            Assert.assertTrue(true);
            System.out.println("testcase02");
        }


    @Test
    public void test03(){
        Assert.assertTrue(10==11);
        System.out.println("test03");
    }

    @Test(dependsOnMethods = "test05", alwaysRun = true)
    public void test04(){
        System.out.println("test04");
    }

    @Test
    public void test05(){
        Assert.assertTrue(12==13);
        System.out.println("test05");
    }

    @AfterMethod
    public void rerunFailedCases(){

    }

    }