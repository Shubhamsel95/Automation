package qsp;

import org.openqa.selenium.firefox.FirefoxDriver;

public class DelayFirefox {
	static
	{
		System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver.exe");
	}

	public static void main(String[] args) throws InterruptedException
	{
		FirefoxDriver var=new FirefoxDriver();
		Thread.sleep(10000);
		var.close();
		

	}

}
