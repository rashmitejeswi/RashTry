package MavenApp.com;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
public class App 
{
    public static void main( String[] args )
    {
    	  try {
        WebDriver driver = new FirefoxDriver();
        driver.get("http://gmail.com");
        driver.manage().window().maximize();
        driver.findElement(By.id("Email")).sendKeys("helo");
        driver.findElement(By.id("next")).click();
        driver.findElement(By.id("Passwd")).sendKeys("hi");
        driver.findElement(By.id("signIn")).click();
      
			driver.wait(2000);
			driver.close();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        
        
        
    }
}
