package exe;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import genericUtility.CommonData;

public class Navukaritest {
	@Test
	public void job() throws Exception {
		WebDriver driver= new EdgeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.naukri.com/");
		driver.findElement(By.xpath("//a[text()='Login']")).click();
		driver.findElement(By.xpath("//input[@placeholder='Enter your active Email ID / Username']")).sendKeys(CommonData.mail,Keys.TAB,CommonData.navakri_password,Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='View']")).click();
		
		driver.findElement(By.xpath("//em[text()='editOneTheme']")).click();
		
		
		WebElement ele= driver.findElement(By.xpath("//input[@id='name']"));
//		Actions act=new Actions(driver);
//		act.click(ele).perform();
		//driver.findElement(By.xpath("//label[text()='Experienced']")).click();
		ele.click();
		Robot rob= new Robot();
		rob.keyPress(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_A);
		rob.keyRelease(KeyEvent.VK_CONTROL);
		rob.keyPress(KeyEvent.VK_BACK_SPACE);
		rob.keyRelease(KeyEvent.VK_BACK_SPACE);
		
		
		ele.sendKeys(CommonData.name);
		driver.findElement(By.xpath("//button[text()='Save']")).click();
		WebElement upload= driver.findElement(By.xpath("//input[@type='file' and @id='attachCV']"));
		upload.sendKeys(CommonData.resumePath);
		driver.close();
		
	}

}
