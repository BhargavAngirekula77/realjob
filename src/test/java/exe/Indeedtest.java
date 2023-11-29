package exe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import genericUtility.CommonData;

public class Indeedtest {
	@Test
	public void indeep() {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys(CommonData.mail,Keys.TAB,CommonData.foundItPassword,Keys.ENTER);
		driver.findElement(By.xpath("//button[text()='UPDATE']")).click();
		//driver.findElement(By.xpath("//span[text()=' Fresher']")).click();

	}

}
