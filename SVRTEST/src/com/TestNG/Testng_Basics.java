package com.TestNG;

import org.junit.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class Testng_Basics {

	@BeforeSuite
	public void setup() {
		System.out.println("setup");
	}
	
	@BeforeClass
	public void launchbrowser() {
		System.out.println("launchbrowser");
		
	}
	
	@BeforeMethod
	public void url() {
		System.out.println("systemurl");
	}
	
	@Test(priority=2)
	public void test_01() {
		System.out.println("Priority:02  test_01");
	}
	
	@Test(priority=1)
	public void test_02() {
		System.out.println("Priority:01  test_02");
	}
	

	@AfterMethod
	public void logout() {
		System.out.println("logout");
	}
	@AfterClass
	public void quit() {
		System.out.println("quit");
	}
	@AfterTest
	public void deleteallcookies () {
		System.out.println("delete all cookies");
	}
}
