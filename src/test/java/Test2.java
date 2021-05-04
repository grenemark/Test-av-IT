/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 *
 * @author boffe
 */
public class Test2 {
    WebDriver driver;

        public void LaunchBrowser() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.actitime.com/");
    }    
        public void createUser() throws InterruptedException {
            driver.findElement(By.xpath("//*[@id=\"HeaderVue\"]/header/div/div/div[2]")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("//*[@id=\"HeaderVue\"]/header/div/div/div[2]/div/a")).click();
            Thread.sleep(3000);
            driver.findElement(By.id("first-name")).sendKeys("Kristoffer");
            Thread.sleep(3000);
            driver.findElement(By.id("last-name")).sendKeys("Grenemark");
            Thread.sleep(3000);
            driver.findElement(By.id("email")).sendKeys("kirger-0@student.ltu.se");
            Thread.sleep(3000);
        }
        
        //Close the browser
        public void closeBrowser() {
        driver.quit(); 

        }
        public static void main(String[] args) throws InterruptedException {
        Test2 obj = new Test2();
        obj.LaunchBrowser();
        obj.createUser();
        obj.closeBrowser();
    }  
}
    

