package Common;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

import com.google.gson.Gson;

import ObjectPageJson.JsonData;
import io.github.bonigarcia.wdm.ChromeDriverManager;
import io.github.bonigarcia.wdm.FirefoxDriverManager;

public class CommonTestCases {
	WebDriver driver;

	public WebDriver openBrower(String brower, String version, String url) {
		if (brower.equals("chrome")) {
			ChromeDriverManager.getInstance().version(version).setup();
			ChromeOptions options = new ChromeOptions();
			options.addArguments("--disable-notifications");
			driver = new ChromeDriver(options);
		} else if (brower.equals("firefox")) {
			FirefoxDriverManager.getInstance().version(version).setup();
			driver = new FirefoxDriver();
		}
		driver.get(url);
		driver.manage().window().maximize();
		return driver;

	}

	public String randomNumberic() {
		Random ran = new Random();
		return String.valueOf(ran.nextInt(99999999));
		 
	}
	public String convertPricetoNumber(String price) {
		return price.replaceAll("đ", "");
	}

	public void assertEqual(String actual, String expected) {
		Assert.assertEquals(actual, expected);
	}


	public void assertTrue(Boolean condition) {
		Assert.assertTrue(condition);
	}
	

	public void assertFalse(Boolean condition) {
		Assert.assertFalse(condition);
	}

	public void closeBrowser() {
		driver.quit();
	}

	public static String readFile(String filename) {
		String result = "";
		try {
			@SuppressWarnings("resource")
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(filename), "UTF-8"));
			StringBuilder sb = new StringBuilder();
			String line = br.readLine();
			while (line != null) {
				sb.append(line);
				line = br.readLine();
//				System.out.println("value " + line);

			}
			result = sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;

	}

	public static JsonData getDataJson(String JsonFile) {
		String json = readFile(JsonFile);
		return new Gson().fromJson(json, JsonData.class);
	}
}
