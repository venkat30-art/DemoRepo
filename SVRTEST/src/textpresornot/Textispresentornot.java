package textpresornot;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

public class Textispresentornot {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.guru99.com/java-date.html");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        
        String pagesrc = driver.getPageSource();
        String texttocheck = "Date in Java";
        boolean istextpresent = pagesrc.contains(texttocheck);
        System.out.println("result  :"  + istextpresent);
        
        Thread.sleep(3000);
        driver.close();
        		

	}

}
