package testcases;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import support.ScreenshotPrint;
import tasks.IndexTask;
import tasks.LoginTask;
import web.BaseTest;

import static support.Report.extentReports;
import static support.Report.extentTest;

public class VerificarAdicionarProjetoTestCase extends BaseTest {

    private static WebDriver driver = getDriver();
    private static LoginTask login = new LoginTask(driver);
    private static IndexTask index = new IndexTask(driver);


    //TESTES

    @Test
    public void adicionarProjetoTest() {
        try {
            extentTest = extentReports.createTest("Adiciona um projeto");
            extentTest.log(Status.INFO, "Abrindo site", ScreenshotPrint.screenshotBase64(driver));
            login.acessarLogin();
            index.adicionarProjeto();
            Thread.sleep(3000);
            extentTest.log(Status.PASS,"Passou teste", ScreenshotPrint.screenshotBase64(driver));
        } catch (Exception e) {
            extentTest.log(Status.ERROR,"não passou teste", ScreenshotPrint.screenshotBase64(driver));
        }
    }

}
