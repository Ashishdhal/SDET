package HWAFTER41;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
	public static void main(String[] args) {
		
	
	//open my browser
    //ChromeDriver driver=new ChromeDriver();
    
    ChromeDriver driver=new ChromeDriver();
    
    //window max
    driver.manage().window().maximize();
    
    //wait
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    
    //load URL
    driver.get("https://login.salesforce.com/");
    
    //sendkeys() method pass values in textbox
    driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@qeagle.com");
    driver.findElement(By.id("password")).sendKeys("Leaf$1234");
    driver.findElement(By.id("Login")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("(//button[@type='button'])[7]")).click();
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
    driver.findElement(By.xpath("//button[@aria-label='View All Applications']")).click();
    
    WebElement account = driver.findElement(By.xpath("//span[text()='Accounts']"));
    driver.executeScript("arguments[0].click();", account);
    

}
}
