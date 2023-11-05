package org.mir;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TestCaseOne {

    @Test
    public void testOne()
    {

        // Set Chrome options for running in headless mode
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--headless");
        options.addArguments("--disable-gpu");
        options.addArguments("--no-sandbox");

        // Initialize the ChromeDriver with the given options
        WebDriver driver = new ChromeDriver(options);
        driver.get("https://google.com");
        System.out.println("===================================================");
        System.out.println("*************FIRST**************Title: " + driver.getTitle()); // Print the page title
        driver.quit();
    }

    @Test
    public void testSecond()
    {


        // Initialize the ChromeDriver with the given options
        WebDriver driver = new ChromeDriver();
        driver.get("https://google.com");
        System.out.println("********SECOND*******************Title: " + driver.getTitle()); // Print the page title
        System.out.println("===================================================");
        driver.quit();
    }

}
