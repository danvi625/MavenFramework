import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {

	
	@org.testng.annotations.Test
	public void test()
	{
		WebDriver driver= new ChromeDriver();
		driver.get("http://www.google.com");
		System.out.println(driver.getTitle());
	}
}
