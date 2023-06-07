package day1;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

//import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRMtest {

	public static void main(String[] args) throws InterruptedException {
		
		 WebDriver driver = new ChromeDriver();
		 driver.get("https://opensource-demo.orangehrmlive.com/");
		 driver.manage().window().maximize();
		 Thread.sleep(5000);
		 driver.findElement(By.name("username")).sendKeys("Admin");
		 driver.findElement(By.name("password")).sendKeys("admin123");
		 driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
		 Thread.sleep(5000);
		 
		 String act_label="";
		try {
		 act_label = driver.findElement(By.xpath("//*[@id=\'app\']/div[1]/div[1]/header/div[1]/div[1]/span/h6")).getText();
	
		 
		}
		catch(NotFoundException e) {
			System.out.println("login test failed");
		}
		
		
		 String exp_label = "Dashboard";
		 if(act_label.equals(exp_label)) {
			 System.out.println("PageNametest passed");
		 }else {
			 System.out.println("PageName test failed");
			 
		 }
		Thread.sleep(5000);
		driver.close();
		}
	}

//System.setProperty("webdriver.chrome.driver", "/home/pc/Desktop/Gunay/java_Udemy_documents/Selenium/chromedriver_linux64");
		//WebDriverManager.chromedriver().setup();
		
		//1) Launch browser
		 //ChromeDriver driver = new ChromeDriver();
/*String act_title = driver.getTitle();
String Exp_title = "OrangeHRM";
if(act_title.equals(Exp_title)) {
	 System.out.println("test passed");
}else {
	 System.out.println("test failed");
	 
}
Thread.sleep(5000);
//driver.close();
driver.quit();*/
