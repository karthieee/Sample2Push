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

		WebDriver b = new ChromeDriver();
		b.get("http://greenstech.in/selenium-course-content.html");
		b.manage().window().maximize();

		Actions a = new Actions(b);

		WebElement btncourses = b.findElement(By.xpath("//div[@class='header-browse-greens']"));
		a.moveToElement(btncourses).perform();
		WebElement btnsoftware = b.findElement(By.xpath("//span[text()='Software Testing (12)']"));
		a.moveToElement(btnsoftware).perform();

		WebElement btnselenium = b.findElement(By.xpath("//span[text()='Selenium Certification Training']"));
		btnselenium.click();

	}

}
