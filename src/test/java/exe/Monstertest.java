package exe;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import genericUtility.CommonData;

public class Monstertest {
	@Test
	public void monster() throws Exception {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.foundit.in/");
		driver.findElement(By.xpath("//span[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@id='signInName']")).sendKeys(CommonData.mail,Keys.TAB,CommonData.foundItPassword,Keys.ENTER);
		//driver.findElement(By.xpath("//button[text()='UPDATE']")).click();
		driver.findElement(By.xpath("//a[@class='profile-img']/img")).click();
		driver.findElement(By.xpath("//span/i[@class='mqfisrp-edit']")).click();
		WebElement ele=driver.findElement(By.xpath("//input[@id='name']"));
		ele.clear();
		ele.sendKeys(CommonData.name);
		driver.findElement(By.xpath("//button[@class='btn pmedium pTB10 wt-100']")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//a/div/input[@type='file']")).sendKeys(CommonData.resumePath);
		driver.close();

	}

}
