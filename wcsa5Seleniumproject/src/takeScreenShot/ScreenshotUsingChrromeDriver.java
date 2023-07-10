package takeScreenShot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ScreenshotUsingChrromeDriver {
public static void main(String[] args) throws IOException {
	System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
	ChromeDriver cmd=new ChromeDriver();
	cmd.manage().window().maximize();
	cmd.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
	cmd.get("https://www.snapchat.com");
	
	File src=cmd.getScreenshotAs(OutputType.FILE);
	File dest=new File("./Screenshots/snapchat.png");
	Files.copy(src, dest);
	cmd.quit();
}
}
