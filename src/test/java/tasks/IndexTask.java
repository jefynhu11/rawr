package tasks;

import appobjects.IndexAppObject;
import org.openqa.selenium.WebDriver;

public class IndexTask {

    private static WebDriver driver;
    private static IndexAppObject index;

    public IndexTask(WebDriver driver){
        this.driver = driver;
        index = new IndexAppObject(driver);
    }

    public void adicionarProjeto(){
        index.getAdicionarProjetoButton().click();
    }
}
