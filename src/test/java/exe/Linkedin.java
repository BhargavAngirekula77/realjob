package exe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import genericUtility.CommonData;

public class Linkedin {
	
	@Test
	public void in() throws Exception {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.linkedin.com/");
		driver.findElement(By.xpath("//input[@autocomplete='username']")).sendKeys(CommonData.mail,Keys.TAB,CommonData.navakri_password,Keys.ENTER);
		driver.findElement(By.xpath("//div[@class='t-16 t-black t-bold']")).click();
		driver.findElement(By.xpath("//button[@aria-label='Edit intro']")).click();
		WebElement ele=driver.findElement(By.xpath("//label[text()='First name']/following-sibling::input[@class=' artdeco-text-input--input']"));
				ele.click();
				Robot rob= new Robot();
				rob.keyPress(KeyEvent.VK_CONTROL);
				rob.keyPress(KeyEvent.VK_A);
				rob.keyRelease(KeyEvent.VK_A);
				rob.keyRelease(KeyEvent.VK_CONTROL);
				rob.keyPress(KeyEvent.VK_BACK_SPACE);
				rob.keyRelease(KeyEvent.VK_BACK_SPACE);
			ele.sendKeys(CommonData.fristName,Keys.TAB,CommonData.lastName);
		driver.findElement(By.xpath("//span[text()='Save']")).click();
		driver.close();
		
		
	}

}
