package xpathcssselector;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpathcssselector {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
				"F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		WebElement first = driver.findElement(By.xpath("//input[@name='firstname']"));
		first.clear();
		first.sendKeys("venkat");
		Thread.sleep(3000);
	  File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		 FileUtils.copyFile(src, new File("screens\\image1.png"));
		 
     
		
		
		Thread.sleep(3000);
		int width = first.getSize().getWidth();
		int hight = first.getSize().getHeight();
		System.out.println(width);
	    System.out.println(hight);
		
		driver.close();
		
	}

}
