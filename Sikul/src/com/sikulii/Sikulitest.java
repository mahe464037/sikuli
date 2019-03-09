package com.sikulii;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Match;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class Sikulitest {
	public static void main(String[] args) throws FindFailed, InterruptedException {
       
		System.setProperty("webdriver.chrome.driver","F:\\selenium software\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(15, TimeUnit.SECONDS);
		Pattern email=new Pattern("F:\\Facebookimages\\email.PNG");   
		Pattern pass=new Pattern("F:\\Facebookimages\\pass.PNG");
		Pattern login= new Pattern("F:\\Facebookimages\\login.PNG");
		Pattern forgot= new Pattern("F:\\Facebookimages\\forgotacc.PNG");
		Pattern backward= new Pattern("F:\\Facebookimages\\backward.PNG");
		Pattern reset= new Pattern("F:\\Facebookimages\\reset.PNG");
        Pattern firstname= new Pattern("F:\\Facebookimages\\firstname.PNG");

		Screen screen= new Screen();
		Thread.sleep(2000);
		screen.type(email,"464037@gmail.com");
		screen.type(pass,"102443");
		screen.click(login);
		Thread.sleep(5000);
		screen.click(backward);
		Thread.sleep(3000);
		screen.click(forgot);
		boolean res=screen.exists(reset) != null;
		System.out.println(res);
		screen.click(backward);	
		Thread.sleep(2000);
		screen.type(firstname,"mahendra");
	}

}
