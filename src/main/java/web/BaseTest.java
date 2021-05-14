package web;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import support.Report;

public class BaseTest extends GereneciadorDriver {

    private static WebDriver driver;

    private String URL = "https://www.rawrproject.com.br/";

    public static WebDriver getDriver() {
        driver = getDriver(Drivers.CHROME);
        return driver;
    }

    @BeforeClass
    public void setUp(){
        Report.configurarExtentReport();
        getDriver().get(URL);
    }

    @AfterClass
    public void tearDown(){
        Report.closeReport();
        closeDriver();
    }

}
