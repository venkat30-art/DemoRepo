package combobox;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multipleselection {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       System.setProperty("webdriver.chrome.driver",
    	"F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe");
       WebDriver driver = new ChromeDriver();
       driver.get("http://content.icicidirect.com/idirectcontent/Home/Home.aspx");
       driver.manage().window().maximize();
       //target dropdown 
       WebElement Acount_open = driver.findElement(By.id("open_account"));
       Select Acount_type = new Select (Acount_open);
       // verify dropdown allow multiple operation selection
       Boolean flag = Acount_type.isMultiple();
       System.out.println("multiple selection type is -->"+ flag);
       if (flag = true)
    	   System.out.println("Dropdown allow multiple option selection");
       else
    	   System.out.println("Dopdown allow single selection option");
       
       driver.getCurrentUrl();
       driver.manage().deleteAllCookies();
       
	}

}
