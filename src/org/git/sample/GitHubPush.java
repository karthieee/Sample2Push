package org.git.sample;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class GitHubPush {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\hp\\eclipse-workspace\\GitHubSample\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.google.co.in/webhp");
		driver.manage().window().maximize();

		WebElement btngmail = driver.findElement(By.xpath("//a[text()='Gmail']"));
		Actions a = new Actions(driver);
		a.contextClick(btngmail).perform();

		Robot r = new Robot();

		for (int i = 1; i <= 6; i++) {

			r.keyPress(KeyEvent.VK_DOWN);

		}
		r.keyPress(KeyEvent.VK_ENTER);

	}

}
