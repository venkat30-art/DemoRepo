package test01;

import org.openqa.selenium.chrome.ChromeDriver;

public class Lchromebrow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
  System.setProperty("webdriver.chrome.driver",
	"F:\\01 Eclipse & Workspace Selenium\\01 chromedriver_win32\\New chrome 74\\chromedriver.exe");
  ChromeDriver chrome = new ChromeDriver();
  chrome.get("https://www.facebook.com");
  chrome.manage().window().maximize();
  Thread.sleep(5000);
  chrome.close();
	}

}
