package HWAFTER41;

/*1. Login to https://login.salesforce.com
2. Click on toggle menu button from the left corner
3. Click view All and click Sales from App Launcher
4. Click on Accounts tab 
5. Click on New button
6. Enter 'your name' as account name
7. Select Ownership as Public 
8. Click save and verify Account name*/
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class SeleniumHackathon {
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options=new ChromeOptions();
        options.addArguments("--disable-notifications");
		ChromeDriver driver=new ChromeDriver();
		driver.get("https://login.salesforce.com");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("ashish@testleaf.com");
		driver.findElement(By.id("password")).sendKeys("Profile123#");
		driver.findElement(By.id("Login")).click();
		driver.findElement(By.xpath("//div[@class='slds-icon-waffle']")).click();
		driver.findElement(By.xpath("(//button[@class='slds-button'])[2]")).click();
		driver.findElement(By.xpath("(//input[@type='search'])[3]")).sendKeys("Account");
		
		driver.findElement(By.xpath("//p[@class='slds-truncate']")).click();
		driver.findElement(By.xpath("//div[@title='New']")).click();
		  
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Ashish");
		Thread.sleep(4000);
		
		
	//	driver.findElement(By.xpath("//div[@class='slds-combobox slds-dropdown-trigger slds-dropdown-trigger_click']")).click();
		
		//driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]")).click();
		
		//driver.findElement(By.xpath("(//button[@class='slds-combobox__input slds-input_faux slds-combobox__input-value'])[3]/span")).click();
		//Thread.sleep(1000);	
	
	//driver.findElement(By.xpath("(//button[contains(@class,'slds-combobox__input slds-input_faux')])[3]")).click();
	//	driver.findElement(By.xpath("//button[@data-position-id='lgcp-1000040']//span[1]")).click();
		driver.findElement(By.xpath("(//button[@data-value='--None--']//span)[3]")).click();
		
		Thread.sleep(4000);
		//driver.findElement(By.xpath("(//span[@class='slds-media__body'])[2]")).click();
		//driver.findElement(By.xpath("(//span[@class='slds-media__body'])[6]")).click();
	//driver.findElement(By.xpath("//span[text()='Public']")).click();
		driver.findElement(By.xpath("(//button[@data-value='--None--']//span)[3]")).click();
		driver.findElement(By.xpath("//button[@name='SaveEdit']")).click();
		String text = driver.findElement(By.xpath("//div[@class='testonly-outputNameWithHierarchyIcon slds-grid sfaOutputNameWithHierarchyIcon']/lightning-formatted-text")).getText();
		if(text.equals("Ashish")){
			System.out.println("Account created successfully.............!!!!!!!");
		}
		
		
		driver.close();
		 
		
			
		
	}
	
	
	

}
