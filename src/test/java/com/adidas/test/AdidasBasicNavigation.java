package com.adidas.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AdidasBasicNavigation {

    public static void main(String[] args)  {

        WebDriverManager.chromedriver().setup();

        WebDriver driver=new ChromeDriver();

        driver.get("https://www.demoblaze.com/index.html");

        WebDriverWait wait=new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.elementToBeClickable())


        String title=driver.getTitle();

        System.out.println(title);

        driver.close();
    }
}
