package tasks;

import appobjects.IndexAppObject;
import appobjects.LoginAppObject;
import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import support.Report;
import support.ScreenshotPrint;
import support.Wait;

import static support.Report.extentTest;

public class LoginTask {

    private static WebDriver driver;
    private static LoginAppObject login;
    private static IndexAppObject index;
    private static Wait wait;

    public LoginTask(WebDriver driver){
        this.driver = driver;
        login = new LoginAppObject(driver);
        index = new IndexAppObject(driver);
        wait = new Wait(driver);
    }

    public void acessarLogin(){
        login.getEmailTextField().sendKeys("teste@teste.com");
        login.getSenhaTextField().sendKeys("teste123");
        login.getEntrarButton().click();
        validarTitulo();
    }

    public void validarTitulo(){
        try {
            wait.waitLoadElement(index.getMeuProjetoTextLabel());
            String text = index.getMeuProjetoTextLabel().getText();
            System.out.println(text);
            Assert.assertEquals(text, "MEUS PROJETOS");
            extentTest.log(Status.PASS, "Está visivel no titulo", ScreenshotPrint.screenshotBase64(driver));
        } catch (Exception e){
            extentTest.log(Status.FAIL, "Não está visivel no titulo", ScreenshotPrint.screenshotBase64(driver));
        }
    }
}
