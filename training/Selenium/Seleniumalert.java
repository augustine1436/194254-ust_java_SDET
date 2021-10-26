import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Seleniumalert {
		public static void main(String[] args) throws NoAlertPresentException,InterruptedException  {									
			System.setProperty("webdriver.chrome.driver","C:\\Users\\91994\\Desktop\\Training_Contents\\selenium\\chromedriver_win32\\chromedriver.exe");
			WebDriver driver = new ChromeDriver();
	        driver.get("http://demo.guru99.com/test/delete_customer.php");                                  		
	     	      	
	        driver.findElement(By.name("cusid")).sendKeys("53920");					
	        driver.findElement(By.name("submit")).submit();	       
	        Alert alert = driver.switchTo().alert();
	        String alertMessage= driver.switchTo().alert().getText();	
	        System.out.println(alertMessage);	
	        Thread.sleep(5000);	
	        alert.accept();		
	    }	

	}


