package ru.netology.web;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CallbackTest {

    private WebDriver driver;

    @BeforeAll
    static void setUpDriver(){
        System.setProperty("webdriver.chrome.driver","draver/mac/chromedriver");
    }

    @BeforeEach
    void setUp(){
        driver = new ChromeDriver();
    }

    @AfterEach
    void takeDown(){
        driver.quit();
        driver=null;
    }
}
