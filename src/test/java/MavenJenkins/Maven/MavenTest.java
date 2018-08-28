package MavenJenkins.Maven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MavenTest {
  @Test
  public void f() {
	  System.setProperty("webdriver.chrome.driver","C:\\Selenium\\chromedriver.exe");
  WebDriver driver = new ChromeDriver();
  driver.get("http://google.com");
		  
  
  }
}
