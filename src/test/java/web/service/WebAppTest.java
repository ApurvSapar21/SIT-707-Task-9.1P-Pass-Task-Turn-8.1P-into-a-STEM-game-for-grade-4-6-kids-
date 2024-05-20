package web.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class WebAppTest {

    private WebDriver driver;

    @BeforeEach
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", 
        		"C:/chromedriver-win64/chromedriver-win64/chromedriver-win64/chromedriver.exe");
        driver = new ChromeDriver();
    }

    @AfterEach
    public void tearDown() {
        driver.quit();
    }

    @Test
    public void testLogin() throws InterruptedException {
        driver.get("http://127.0.0.1:8824/login");

        WebElement usernameField = driver.findElement(By.name("username"));
        WebElement passwordField = driver.findElement(By.name("passwd"));
        WebElement dobField = driver.findElement(By.name("dob"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        usernameField.sendKeys("ahsan");
        passwordField.sendKeys("ahsan_pass");
        dobField.sendKeys("20-05-2024");
        submitButton.click();

        Thread.sleep(2000); // Wait for 2 seconds
        assertEquals("http://127.0.0.1:8824/q1", driver.getCurrentUrl());
    }

    @Test
    public void testQ1() throws InterruptedException {
        driver.get("http://127.0.0.1:8824/q1");

        WebElement number1Field = driver.findElement(By.name("number1"));
        WebElement number2Field = driver.findElement(By.name("number2"));
        WebElement resultField = driver.findElement(By.name("result"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        number1Field.sendKeys("2");
        number2Field.sendKeys("3");
        resultField.sendKeys("5");
        submitButton.click();

        Thread.sleep(2000); // Wait for 2 seconds
        assertEquals("http://127.0.0.1:8824/q2", driver.getCurrentUrl());
    }

    @Test
    public void testQ2() throws InterruptedException {
        driver.get("http://127.0.0.1:8824/q2");

        WebElement number1Field = driver.findElement(By.name("number1"));
        WebElement number2Field = driver.findElement(By.name("number2"));
        WebElement resultField = driver.findElement(By.name("result"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        number1Field.sendKeys("5");
        number2Field.sendKeys("3");
        resultField.sendKeys("2");
        submitButton.click();

        Thread.sleep(2000); // Wait for 2 seconds
        assertEquals("http://127.0.0.1:8824/q3", driver.getCurrentUrl());
    }

    @Test
    public void testQ3() throws InterruptedException {
        driver.get("http://127.0.0.1:8824/q3");

        WebElement number1Field = driver.findElement(By.name("number1"));
        WebElement number2Field = driver.findElement(By.name("number2"));
        WebElement resultField = driver.findElement(By.name("result"));
        WebElement submitButton = driver.findElement(By.xpath("//input[@type='submit']"));

        number1Field.sendKeys("2");
        number2Field.sendKeys("3");
        resultField.sendKeys("6");
        submitButton.click();

        Thread.sleep(2000); // Wait for 2 seconds
        assertEquals("http://127.0.0.1:8824/success", driver.getCurrentUrl());
    }
}
