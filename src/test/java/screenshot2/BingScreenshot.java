package screenshot2;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;


public class BingScreenshot {
	
	@Test
	public void TakeScreenshot() throws IOException{
		WebDriverManager.chromedriver().setup();
		WebDriver wd = new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.bing.com/");
		WebElement input=wd.findElement(By.name("q"));
		input.sendKeys("Chennai");
		input.sendKeys(Keys.ENTER);
		
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src, new File("C:\\Users\\Dinesh\\Desktop\\SeleniumTesting\\TestNGGitHubScreenshot\\Folder\\bing.png"));

	}
		
}
