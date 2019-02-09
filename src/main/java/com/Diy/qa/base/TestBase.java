package com.Diy.qa.base;

import com.Diy.qa.util.TestUtil;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

   public static WebDriver driver;
   public static Properties prop;


    public TestBase() {

        try {
            prop = new Properties();
                FileInputStream ip = new FileInputStream("C:\\Users\\tithi\\IdeaProjects\\DiyTest\\src" +
                        "\\main\\java\\com\\Diy\\qa\\config\\config.properties");

                prop.load(ip);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static void initialisation(){
       String browserName = prop.getProperty("browser");
       if(browserName.equals("chrome")){
           System.setProperty("webdriver.chrome.driver", "C:\\Users\\tithi\\Desktop\\RS1\\tools\\chromedriver.exe\\");
           driver = new ChromeDriver();
       }
       else if (browserName.equals("Firefox")){
           System.setProperty("webdriver.Firefox.driver", "C:\\Users\\tithi\\Desktop\\RS1\\tools\\gechodriver.exe\\");
           driver = new FirefoxDriver();
       }
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);
        driver.get(prop.getProperty("url"));


    }
}





