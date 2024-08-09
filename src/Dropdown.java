import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/#search.aspx?mode=search");
		WebElement n=driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		Select drop=new Select(n);
//		Thread.sleep(2000);
		drop.selectByIndex(3);
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByValue("INR");
		System.out.println(drop.getFirstSelectedOption().getText());
		drop.selectByVisibleText("AED");
		System.out.println(drop.getFirstSelectedOption().getText());
		driver.findElement(By.id("divpaxinfo")).click();
//		Thread.sleep(2000);
		for(int i=1;i<5;i++)
		{
			driver.findElement(By.id("hrefIncAdt")).click();
//			Thread.sleep(1000);
		}
		
		System.out.println(driver.findElement(By.id("divpaxinfo")).getText());
	}

}
