package selenium_salesforce;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Selenium_JIRA {
	public static void main(String[] args) throws InterruptedException {
		

	ChromeDriver driver=new ChromeDriver();
	driver.get("https://api-training.atlassian.net/");
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.manage().window().maximize();
	driver.findElement(By.id("username")).sendKeys("hari.radhakrishnan@testleaf.com");
	driver.findElement(By.xpath("//span[text()='Continue']")).click();
	driver.findElement(By.xpath("//input[@name='password']")).sendKeys("India@123");
	driver.findElement(By.xpath("//span[text()='Log in']")).click();
	//Step4: Select SDET-5 project
	Thread.sleep(1000);
	driver.findElement(By.xpath("(//p[text()='Company-managed software'])[1]")).click();
	//Step6: Click on Create button
	driver.findElement(By.xpath("//span[text()='Create']")).click();
	
	//Step7: Enter Summary which is mandatory
	driver.findElement(By.xpath("//input[@name='summary']")).sendKeys("MY ACCOUNT ASHISH");
	
	//Step8: Click on Create button
	driver.findElement(By.xpath("(//span[text()='Create'])[2]")).click();
	
	//Step9: Click on Backlog on the left panel
	driver.findElement(By.xpath("//span[text()='Backlog']")).click();
	
	//Step10:Search for the story we created in the search field and verify the newly created story
	
	driver.findElement(By.xpath("//input[@name='search']")).sendKeys("MY ACCOUNT ASHISH");

	driver.close();
}
}