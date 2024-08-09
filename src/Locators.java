//import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.NoSuchElementException;

public class Locators {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//String name = null;
		//driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.findElement(By.id("inputUsername")).sendKeys("nagi");
		driver.findElement(By.name("inputPassword")).sendKeys("123456");
		driver.findElement(By.className("signInBtn")).click();
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
 		driver.findElement(By.linkText("Forgot your password?")).click();
 		driver.findElement(By.xpath("//input[@placeholder=\"Name\"]")).sendKeys("lakshmi");
		driver.findElement(By.xpath("//input[@placeholder=\"Email\"]")).sendKeys("lakshmi.g@gmail.com");
		driver.findElement(By.xpath("//input[@placeholder='Phone Number']")).sendKeys("9848189751");
		driver.findElement(By.xpath("//button[@class='reset-pwd-btn']")).click();
		//System.out.println(driver.findElement(By.xpath("//p[@class='infoMsg']")).getText());
		//String passwordarray=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//String[] passwordarray1=passwordarray.split("'");
		//String[] passwordarray2=passwordarray1[1].split("'");
		//System.out.println(passwordarray2);
		
	}
}