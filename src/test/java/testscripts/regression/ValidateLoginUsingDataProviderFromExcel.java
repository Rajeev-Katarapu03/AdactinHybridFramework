package testscripts.regression;

import java.util.HashMap;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import base.BaseTest;
import utils.UtilKit;

public class ValidateLoginUsingDataProviderFromExcel extends BaseTest{
	@Test(dataProvider="getTestData")
	public void ValidateLoginTest1(HashMap<String, String> testdataMap) {
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys(testdataMap.get("username"));
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys(testdataMap.get("password"));
		driver.findElement(By.xpath("//input[@name='login']")).click();
		Assert.assertEquals(driver.getTitle(), testdataMap.get("expected Title"));
		
	}
	
	@DataProvider
	public Object[][] getTestData(){
		Object[][] data=new Object[1][1];
		data[0][0]=UtilKit.getTestDataFromExcel("TC-102");
		return data;

}
}
