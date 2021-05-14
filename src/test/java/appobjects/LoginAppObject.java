package appobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginAppObject {

    private WebDriver driver;

    public LoginAppObject(WebDriver driver){
        this.driver = driver;
    }

    public WebElement getEmailTextField(){
        return driver.findElement(By.id("n021kr"));
    }

    public WebElement getSenhaTextField(){
        return driver.findElement(By.id("eO8mXH"));
    }

    public WebElement getEntrarButton(){
        return driver.findElement(By.id("i0JoYz"));
    }
}
