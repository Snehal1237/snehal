package ExplicitWait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demoUrl2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.actitime.com/login.do");
		driver.findElement(By.id("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		String expectedurl="https://demo.actitime.com/user/submit_tt.do";
		String actualurl=driver.getCurrentUrl();
		if(actualurl.equals(expectedurl))
		{
			System.out.println("true");
		}
		else
		{
			System.out.println("false");
		}
		System.out.println(actualurl);
	}
		}
		

