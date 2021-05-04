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
public class test {
    
    WebDriver driver;
    
    public void LaunchBrowser() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://www.google.com");
    }    
        public void search() throws InterruptedException {
            driver.findElement(By.id("zV9nZe")).click();
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[1]/div/div[2]/input")).sendKeys("Software Testing");
            Thread.sleep(3000);
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/form/div[1]/div[1]/div[2]/div[2]/div[2]/center/input[1]")).click();
            Thread.sleep(3000);
        }
        
        //Close the browser
        public void closeBrowser() {
        driver.quit(); 

        }
        public static void main(String[] args) throws InterruptedException {
        test obj = new test();
        obj.LaunchBrowser();
        obj.search();
        obj.closeBrowser();
    }
}
