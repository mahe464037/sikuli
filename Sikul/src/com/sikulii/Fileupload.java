package com.sikulii;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Fileupload {
	public static void main(String[] args) throws FindFailed, InterruptedException {
	
	System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();
	driver.get("file:///C:/Users/mahendra/Desktop/upload.html");
	driver.manage().window().maximize();
	Pattern upload= new Pattern("F:\\Facebookimages\\upload.PNG");
	Screen sc= new Screen();
	Thread.sleep(2000);
	sc.type(upload,"C:\\Users\\mahendra\\Desktop\\upload.txt");
	Pattern open= new Pattern("F:\\Facebookimages\\open.PNG");
	Thread.sleep(2000);
	sc.click(open);

	}
}
