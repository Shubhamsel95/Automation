package qsp;

import org.openqa.selenium.chrome.ChromeDriver;

public class DelayChrome {
	static
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver var=new ChromeDriver();
		Thread.sleep(10000);
		var.close();

	}

}
