package week5.day1;

import org.openqa.selenium.By;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class EditLead extends ProjectSpecificMethods{
	@Test(dataProvider = "editData")

	public void runEditLead(String uname,String pwd,String pno,String cname) throws InterruptedException{
	
		driver.findElement(By.id("username")).sendKeys(uname);
		driver.findElement(By.id("password")).sendKeys(pwd);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys(pno);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys(cname);
		driver.findElement(By.name("submitButton")).click();
		
}
	@DataProvider
	public String[][] editData(){
		String[][] array= new String[2][4];
		
		array[0][0]="DemoSalesManager";
		array[0][1]="crmsfa";
		array[0][2]="99";
		array[0][3]="TCS";
		
		
		array[1][0]="DemoCSR";
		array[1][1]="crmsfa";
		array[1][2]="99";
		array[1][3]="CTS";
		
		
		return array;
		
	}
}








