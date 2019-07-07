package dropdown_01;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

public class dropdown {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
	"F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe");
      ChromeDriver driver = new ChromeDriver();
      driver.get("https://www.facebook.com");
      driver.manage().window().maximize();
      driver.findElement(By.id("day"));
      driver.findElement(By.id("day")).sendKeys("22", Keys.ARROW_DOWN);
      Thread.sleep(3000);
      driver.findElement(By.id("month"));
      driver.findElement(By.id("month")).sendKeys("Sept");
      Thread.sleep(2000);
      driver.findElement(By.id("year"));
      driver.findElement(By.id("year")).sendKeys("2010", Keys.ARROW_UP);
      Thread.sleep(5000);
      driver.close();
	}

}