package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import support.Wait;

public class IndexAppObject {

    private WebDriver driver;

    private Wait wait;

    public IndexAppObject(WebDriver driver){
        this.driver = driver;
        wait = new Wait(driver);
    }

    public WebElement getMeuProjetoTextLabel(){
        wait.waitVisibilityElement(By.id("n4Zm4G"));
        return driver.findElement(By.id("n4Zm4G"));
//        return driver.findElement(By.cssSelector(".vuUMZ1 .ozvZZI h3"));
    }

    public WebElement getAdicionarProjetoButton(){
        return driver.findElement(By.id("gADqMF"));
    }
}
