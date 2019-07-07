package test01;


import static org.testng.Assert.assertTrue;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBr_01 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		"F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		driver.findElement(By.id("email")).clear();
		driver.findElement(By.id("email")).sendKeys("venkat@gmail.com", Keys.ENTER);
		driver.findElement(By.id("pass")).clear();
		driver.findElement(By.id("pass")).sendKeys("singam1234");
		Thread.sleep(2000);
		
		String title = driver.getTitle();{
			System.out.println(title);
		}
		
		boolean displayed = driver.findElement(By.id("email")).isSelected();{
			System.out.println(displayed);
		}
		Assert.assertTrue("the title of window is true", driver.getTitle().equals(title));
		Thread.sleep(3000);
		
		File srcFile = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(srcFile, new File("C:\\Users\\svr\\Desktop\\Screenshot.png"));
		
       driver.close();
	}

	
}
