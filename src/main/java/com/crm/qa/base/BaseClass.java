package com.crm.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;

import com.crm.qa.util.UtilClass;

public class BaseClass {
	// here we write code to launch browser and other common actions

	// defining global variables 
	
	static WebDriver driver;
	static Properties prop;
// creating a constructor
	
	public BaseClass() {
		
		try{
			
			prop=new Properties();
		
		
		FileInputStream finp =new FileInputStream("C:\\Users\\s_sri\\Desktop\\padmaworkspace\\Free_CRM_Automation\\src\\main\\java\\com\\crm\\qa\\config\\config.properties");
		} catch (FileNotFoundException e){
			e.printStackTrace();
		}catch (IOException e){
			e.printStackTrace();
}
	}
	
	// creating initalisation method
	
	public static void browserInitialization(){
		
		String browserName= prop.getProperty("browser");
		
		if (browserName.equals("chrome")){
			
			System.setProperty("webdriver.chrome.driver", "C:\\Users\\s_sri\\Desktop\\AutomationPack\\chromedriver.exe");
			driver =new ChromeDriver();
			
		}else if (browserName.equals("FF")){
			

			System.setProperty("webdriver.gecko.driver", "C:\\Users\\s_sri\\Desktop\\AutomationPack\\geckodriver.exe");
			driver =new FirefoxDriver();
		}
			
			driver.manage().window().maximize();
			driver.manage().deleteAllCookies();
			driver.manage().timeouts().implicitlyWait(UtilClass.IMPLICT_WAIT,TimeUnit.SECONDS);
			driver.manage().timeouts().pageLoadTimeout(UtilClass.PAGELOAD_TIMEOUT, TimeUnit.SECONDS);
			driver.get(prop.getProperty("url"));
			
			
			
		}
		
		
		
	}

