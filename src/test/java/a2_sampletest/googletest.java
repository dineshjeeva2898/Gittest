package a2_sampletest;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class googletest {
	@Test
	public void validring() throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver wd =new ChromeDriver();
		wd.manage().window().maximize();
		wd.get("https://www.google.com/");
		wd.findElement(By.name("q")).sendKeys("chennai");
		File src=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(src,new File("C:\\Users\\Prabhu\\eclipse-workspace\\j1_gitTest\\screenshot\\google.jpeg"));

}
}