package day2;

import org.openqa.selenium.By;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Nopcommerce {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://admin-demo.nopcommerce.com/login?ReturnUrl=%2Fadmin%2F");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		
		
		driver.findElement(By.name("Email")).clear();
		driver.findElement(By.name("Password")).clear();
		
		driver.findElement(By.name("Email")).sendKeys("admin@yourstore.com");
	    driver.findElement(By.name("Password")).sendKeys("admin");
	    driver.findElement(By.xpath("/html/body/div[6]/div/div/div/div/div[2]/div[1]/div/form/div[3]/button")).click();
		Thread.sleep(4000);
		try{
		String actTitle = driver.getTitle();
		String expTitle = "Dashboard / nopCommerce administration";
		String actLabel =driver.findElement(By.xpath("/html/body/div[3]/div[1]/div[1]/h1")).getText();
		String ExpLabel = "Dashboard";
		
		if(actTitle.equals(expTitle)) {
			 System.out.println("title test passed");
		}else {
			System.out.println("title test Failed");
		}
		
		String resultLabel = (actLabel.equals(ExpLabel)) ? "pageName test passed" : "pageName test failed";
		System.out.println(resultLabel);  
		
		}
		catch(NotFoundException e){
			System.out.println("login test failed");
		}
			
	}
		
	


}
