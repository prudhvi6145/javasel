import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;

public class NewTest {
	WebDriver driver;
	
	
  @Test
  public void opengoogle() {
	  
	  driver.get("https://www.google.com");
	  System.out.println("Title: " + driver.getTitle());
  }
  @BeforeClass
  public void beforeClass() {
	  
	  driver =new EdgeDriver();
	  System.setProperty("Webdriver.chrome.driver", "path/to/chromedriver");  }

  @AfterClass
  public void afterClass() throws InterruptedException {
	  Thread.sleep(3000);
	  driver.quit();
  }

}
