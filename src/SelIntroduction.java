import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import org.openqa.selenium.edge.EdgeDriver;

//import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction {
	public static void main(String[] arg)
	{
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\ACER\\Downloads\\chrome-headless-shell-win64.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.udemy.com/course/selenium-real-time-examplesinterview-questions/learn/lecture/29096196#overview");
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
		driver.close();
		driver.quit();
	}

}
