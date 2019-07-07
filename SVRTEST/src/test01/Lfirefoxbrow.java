package test01;


import org.openqa.selenium.firefox.FirefoxDriver;


public class Lfirefoxbrow {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	System.setProperty("webdriver.gecko.driver",
 "F:\\01 Eclipse & Workspace Selenium\\02 FireFoxDrivers\\New gecko 0 24\\geckodriver.exe");
	FirefoxDriver driver  = new FirefoxDriver();
	driver.get("https://www.facebook.com");
	driver.manage().window().maximize();
	Thread.sleep(5000);
	driver.close();
	

	}

}
