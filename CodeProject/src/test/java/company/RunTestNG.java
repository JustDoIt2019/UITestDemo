package company;

import org.testng.TestNG;

import java.util.ArrayList;
import java.util.List;

public class RunTestNG {

    public static void main(String args[]) {

        TestNG testNG = new TestNG();
        List<String> suites = new ArrayList<String>();
        suites.add("./testng.xml");
        //suites.add(".\\test-output\\testng-failed.xml");
        testNG.setTestSuites(suites);
        testNG.run();

        int count = 2;
        TestNG testNG1 = new TestNG();
        for (int i = 0; i < count; i++) {
            // 等待执行结束，然后去执行失败用例

            List<String> suites1 = new ArrayList<String>();
            suites1.add("./test-output/testng-failed.xml");
            testNG1.setTestSuites(suites1);
            testNG1.run();
        }


    }
}
