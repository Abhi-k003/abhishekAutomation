package fullpractise;

import java.time.Duration;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Practise1Test 
{
	@Test
	public void practise()
	{
		WebDriver driver = new ChromeDriver();
		
		
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.flipkart.com/");
		
		//driver.manage().window().setSize(new Dimension(400, 300));
		Dimension d = new Dimension(300,400);
		driver.manage().window().setSize(d);
		
		//driver.manage().window().setPosition(new Point(500, 600));
		Point  p = new Point(300,600);
		driver.manage().window().setPosition(p);
		
		driver.manage().window().minimize();
		
		driver.manage().window().maximize();
		
		driver.navigate().to("https://www.naukri.com/mnjuser/homepage");
		
		Navigation nav = driver.navigate();
		nav.back();
		nav.forward();
		nav.refresh();
		
		/*driver.navigate().back();
		driver.navigate().forward();
		driver.navigate().refresh();*/
		
		//driver.close();
		
		driver.quit();
		
		
		
		
	}

}
