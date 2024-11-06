package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLogin extends BaseTest{
	@Test
	public void ValidateLoginTest1() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0806");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Search Hotel");
		
	}
	@Test
	public void ValidateLoginTest2() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz0806");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz122");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
	}
	@Test
	public void ValidateLoginTest3() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz08678");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
	}
	@Test
	public void ValidateLoginTest4() {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("reyaz08090");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("reyaz123443");
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), "Adactin.com - Hotel Reservation System");
		
	}

}
