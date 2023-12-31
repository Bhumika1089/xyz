// Generated by Selenium IDE
import org.junit.Test;
import org.junit.Before;
import org.junit.After;
import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.core.IsNot.not;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Alert;
import org.openqa.selenium.Keys;
import java.util.*;
import java.net.MalformedURLException;
import java.net.URL;
public class GoogleTest {


  private WebDriver driver;
  private Map<String, Object> vars;
  JavascriptExecutor js;



  
  @Before
  public void setUp() {
    driver = new ChromeDriver();
    js = (JavascriptExecutor) driver;
    vars = new HashMap<String, Object>();
  }
  @After
  public void tearDown() {
    driver.quit();
  }
  @Test
  public void google() {
    // Test name: google
    // Step # | name | target | value
    // 1 | open | https://www.google.com/ | 
    driver.get("https://www.google.com/");
    // 2 | setWindowSize | 1024x728 | 
    driver.manage().window().setSize(new Dimension(1024, 728));
    // 3 | click | id=APjFqb | 
    driver.findElement(By.id("APjFqb")).click();
    // 4 | runScript | window.scrollTo(0,1.600000023841858) | 
    js.executeScript("window.scrollTo(0,1.600000023841858)");
    // 5 | type | id=APjFqb | knowit
    driver.findElement(By.id("APjFqb")).sendKeys("knowit");
    // 6 | click | css=#jZ2SBf > .wM6W7d > span | 
    driver.findElement(By.cssSelector("#jZ2SBf > .wM6W7d > span")).click();
    // 7 | click | css=.eKjLze .LC20lb | 
    driver.findElement(By.cssSelector(".eKjLze .LC20lb")).click();
    // 8 | click | linkText=PLACEMENT | 
    driver.findElement(By.linkText("PLACEMENT")).click();
    // 9 | click | linkText=LOGIN | 
    driver.findElement(By.linkText("LOGIN")).click();
    // 10 | click | name=username | 
    driver.findElement(By.name("username")).click();
    // 11 | type | name=username | ravi.tambade@transflower.in
    driver.findElement(By.name("username")).sendKeys("ravi.tambade@transflower.in");
    // 12 | click | name=password | 
    driver.findElement(By.name("password")).click();
    // 13 | type | name=password | tambade
    driver.findElement(By.name("password")).sendKeys("tambade");
    // 14 | click | css=.btn-default | 
    driver.findElement(By.cssSelector(".btn-default")).click();
  }
}
