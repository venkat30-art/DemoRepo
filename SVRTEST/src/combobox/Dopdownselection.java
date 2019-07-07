package combobox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dopdownselection {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver",
		    	"F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe");
		       WebDriver driver = new ChromeDriver();
		       driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
		       driver.manage().window().maximize();
		       Select acount_open = new Select(driver.findElement(By.id("open_account")));
		       acount_open.selectByVisibleText("NRI Account");
		       Thread.sleep(3000);
		       acount_open.selectByVisibleText("Equity Relationship Service Account");
		       driver.close();
		     	}

}
