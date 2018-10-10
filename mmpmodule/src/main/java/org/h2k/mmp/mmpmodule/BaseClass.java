package org.h2k.mmp.mmpmodule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;


public class BaseClass {
protected WebDriver driver=null;
@Parameters({"browserType"})
@BeforeTest

protected void getDriverInstance(String browserType)
{
	System.out.println("in getDriverInstance");
	if(browserType.equals("IE"))
		
	{
		driver=new InternetExplorerDriver();
	}
		else if(browserType.equals("CH"))
		{
			driver=new ChromeDriver();
		}
		else
		{
			System.setProperty("webdriver.gecko.driver","geckodriver.exe");
			
			driver= new FirefoxDriver();
			//driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");
	
		}
}
//driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/");

}

	


