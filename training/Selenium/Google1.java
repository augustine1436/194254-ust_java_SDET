import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Google1 {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\91994\\Desktop\\Training_Contents\\selenium\\chromedriver_win32\\chromedriver.exe");
         WebDriver d=new ChromeDriver();
		d.navigate().to("http://www.google.com/");
		String s=d.getTitle();
		System.out.println(s);
		s.equals("Google");
		
	}
	

}
