import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) throws InterruptedException{
        WebDriver driver = initChromedriver();
        driver.get("http://prestashop-automation.qatestlab.com.ua/admin147ajyvk0/");
        WebElement findSearch = driver.findElement(By.id("email"));
        findSearch.sendKeys("webinar.test@gmail.com");

        WebElement findSearchSecond = driver.findElement(By.name("passwd"));
        findSearchSecond.sendKeys("Xcg7299bnSmMuRLp9ITw");

        WebElement button = driver.findElement(By.name("submitLogin"));
        button.click();

        Thread.sleep(2000);
        WebElement button_2 = driver.findElement(By.className("employee_avatar_small"));
        button_2.click();


        WebElement button_exit = driver.findElement(By.id("header_logout"));
        button_exit.click();




        }

        public static WebDriver initChromedriver(){
            System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/drivers/chromedriver");
            ChromeOptions options = new ChromeOptions();
            options.addArguments("--start-maximized");
            return new ChromeDriver(options);
        }

}
