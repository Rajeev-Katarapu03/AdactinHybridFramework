package testscripts.regression;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;

public class ValidateLoginUsingDataProvider extends BaseTest{
	@Test(dataProvider="getTestData")
	public void ValidateLoginTest1(String username,String password,String expTitle) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(username);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(password);
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), expTitle );
		
	}
	@DataProvider
	public Object[][] getTestData(){
		Object[][]data=new Object[4][3];
		data[0][0]="reyaz0806";
		data[0][1]="reyaz123";
		data[0][2]="Adactin.com - Search Hotel";
		
		data[1][0]="reyaz0806";
		data[1][1]="reyaz12355";
		data[1][2]="Adactin.com - Hotel Reservation System";
		
		data[2][0]="reyaz080677";
		data[2][1]="reyaz123";
		data[2][2]="Adactin.com - Hotel Reservation System";
		
		data[3][0]="reyaz08069";
		data[3][1]="reyaz1234";
		data[3][2]="Adactin.com - Hotel Reservation System";
		
		return data;
		
	}
}
