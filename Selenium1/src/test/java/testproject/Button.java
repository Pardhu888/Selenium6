package testproject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Button {
	@Test
	public void openbutton() throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91832\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver d1;
	    d1= new ChromeDriver();
	    d1.get("http://leafground.com/");
	    Thread.sleep(3000);
	    d1.findElement(By.linkText("Button")).click();
		d1.findElement(By.id("position")).click();
		d1.findElement(By.id("home")).click();
		d1.findElement(By.linkText("Button")).click();
		d1.findElement(By.id("color")).click();
		d1.findElement(By.id("home")).click();
		d1.findElement(By.linkText("Button")).click();
		d1.findElement(By.id("home")).click();
		d1.findElement(By.linkText("Button")).click();
		d1.findElement(By.id("size")).click();
		d1.findElement(By.id("home")).click();
		d1.close();
       }
}
