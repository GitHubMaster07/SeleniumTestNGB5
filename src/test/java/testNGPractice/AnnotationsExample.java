package testNGPractice;

import org.testng.annotations.*;

public class AnnotationsExample {

    @BeforeSuite
    public void beforeSuite() {
        System.out.println("Setting up the suite environment.");
    }

    @BeforeTest
    public void beforeTest() {
        System.out.println("Configuring test environment.");
    }

    @BeforeClass
    public void beforeClass() {
        System.out.println("Loading class resources.");
    }

    @BeforeMethod
    public void beforeMethod() {
        System.out.println("Initializing test method setup.");
    }

    @Test
    public void testMethod1() {
        System.out.println("Executing test method 1");
        // Add your test assertions or actions here
    }

    @Test
    public void testMethod2() {
        System.out.println("Executing test method 2");
        // Add your test assertions or actions here
    }

    @Test
    public void testMethod3() {
        System.out.println("Executing test method 3");
        // Add your test assertions or actions here
    }

    @AfterMethod
    public void afterMethod() {
        System.out.println("Cleaning up after test method.");
    }

    @AfterClass
    public void afterClass() {
        System.out.println("Releasing class resources.");
    }

    @AfterTest
    public void afterTest() {
        System.out.println("Tearing down test environment.");
    }

    @AfterSuite
    public void afterSuite() {
        System.out.println("Cleaning up the suite environment.");
    }
}

