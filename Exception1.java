package handleDropdown;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Exception1 {

	
		public static void main(String[] args) throws InterruptedException {
			System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
			WebDriver driver = new ChromeDriver();
		    driver.manage().window().maximize();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		    
		    driver.get("file:///C:/Users/Admin/Desktop/webelement/dropdown.html");
		    WebElement dropdownElement = driver.findElement(By.xpath("//select[@name='menu']"));
		    
		    Select sel = new Select(dropdownElement);
		    sel.selectByVisibleText("pav bhaji");
		    
		    Thread.sleep(2000);
		    sel.deselectByVisibleText("pav bhaji");
		    

		}                               //deselectByindexmethod
		                             //pre-define pacakage 
									//java.lang.UnsupportedOperationException: You may only deselect options of a multi-selecct 

	}


