package com.juaracoding.DwiFebrianRamadhan;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Selenium {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver.exe");

        // Instantiate a ChromeDriver class.
        WebDriver driver=new ChromeDriver();


        //Maximize the browser
        driver.manage().window().maximize();

        String url= "https://formy-project.herokuapp.com/form";

        driver.get(url);

        JavascriptExecutor js = (JavascriptExecutor) driver;

        WebElement userName =
                driver.findElement(By.xpath("//*[@id='first-name']"));
        userName.sendKeys("Dwi Febrian");
        System.out.println("input first name");

        driver.findElement(By.id("last-name")).sendKeys("Ramadhan");
        System.out.println("input last name");
        driver.findElement(By.id("job-title")).sendKeys("Software Quality Assurance");
        System.out.println("input job title");



        WebElement radiobutton1 = driver.findElement(By.id("radio-button-1"));

        js.executeScript("arguments[0].click();", radiobutton1);
        System.out.println("Yes Radio Clicked use JavascriptExecutor");


        WebElement checkbox1 =
        driver.findElement(By.xpath("//*[@id=checkbox-1"));
        System.out.println("Male");




        WebElement elementSelect = driver.findElement(By.id("select-menu"));
        Select oldSelectMenu = new Select(elementSelect);
        oldSelectMenu.selectByIndex(2);



        driver.findElement(By.id("submit")).click();
        System.out.println("button submit clicked");

        driver.quit();
    }

    }