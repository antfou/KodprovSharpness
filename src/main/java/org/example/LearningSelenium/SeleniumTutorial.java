package org.example.LearningSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTutorial {

    public static void main(String[] args) {

        //Make driver
        WebDriver driver = new ChromeDriver();

        //Go to the site you want
        driver.get("http://www.google.com");

        //fetch an element from site
        WebElement tempElement = driver.findElement(By.tagName("a"));

        System.out.println(tempElement.getTagName());

        //End the session/ close the site
        driver.quit();
    }
}
