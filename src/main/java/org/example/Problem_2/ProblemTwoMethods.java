package org.example.Problem_2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class ProblemTwoMethods {

    public int countHTMLtags(String url){
        WebDriver driver = new ChromeDriver();
        driver.get(url);

        List<WebElement> tags = driver.findElements(By.tagName("a"));

        driver.quit();

        return tags.size();
    }
}
