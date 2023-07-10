package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ScreenshotUsingRemoteWebDriver {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	RemoteWebDriver rwd=new ChromeDriver();
	rwd.manage().window().maximize();
	rwd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	rwd.get("https://www.facebook.com/");
	
	File src=rwd.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshots/facebookHome.png");
	Files.copy(src, dest);
}

}
