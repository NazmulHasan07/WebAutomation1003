package gmail_practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



public class GmailSigninTest {
	
	public static void main(String[] args) throws InterruptedException {
	
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");

		WebDriver Gmailsignin =new ChromeDriver();


		Gmailsignin.manage().window().maximize();

		Gmailsignin.manage().deleteAllCookies();

		Gmailsignin.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		Gmailsignin.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);    

		
		Gmailsignin.get("https://www.google.com/gmail/");
	
		Gmailsignin.findElement(By.xpath("//*[@id='identifierId']")).sendKeys("Bosus2018@gmail.com");
		Gmailsignin.findElement(By.xpath("//*[@id='identifierNext']/content/span")).click();
		Thread.sleep(3000);

		Gmailsignin.findElement(By.xpath("//*[@id=\'password\']/div[1]/div/div[1]/input")).                                                                                           sendKeys("Boston2018");
		Gmailsignin.findElement(By.xpath("//*[@id='passwordNext']/content/span")).click();
		Thread.sleep(3000);
		
		
		Gmailsignin.findElement(By.xpath("//*[@id=':3w']/div/div")).click();
		Gmailsignin.findElement(By.xpath("//*[@id=':8z']")).sendKeys("nhrhandsome@gmail.com");
		Thread.sleep(3000);
		
		Gmailsignin.findElement(By.xpath("//*[@id=':8h']")).sendKeys("Hello");
		Thread.sleep(3000);
		
		Gmailsignin.findElement(By.xpath("//*[@id=':9l']")).sendKeys("How are you? Please reply me if you get my e-mail.");
		Thread.sleep(3000);
		
		Gmailsignin.findElement(By.xpath("//*[@id=':87']")).click();
		Thread.sleep(3000);
		
		Gmailsignin.findElement(By.xpath("//*[@id='gbwa']/div[1]/a")).click();
		Thread.sleep(3000);
		
		Gmailsignin.findElement(By.xpath("//*[@id='gb']/div[1]/div[1]/div[2]/div[5]/div[1]/a/span")).click();
		Thread.sleep(3000);
		
		Gmailsignin.findElement(By.xpath("//*[@id='gb_71']")).click();
		Thread.sleep(3000);
		
		Gmailsignin.close();

	}
}

