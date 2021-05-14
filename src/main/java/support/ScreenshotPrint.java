package support;

import com.aventstack.extentreports.MediaEntityBuilder;
import com.aventstack.extentreports.MediaEntityModelProvider;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import java.io.File;
import java.io.IOException;

public class ScreenshotPrint {

    public static final String CAMINHO_FOTO = System.getProperty("user.dir") + File.separator + "Report" + File.separator + "Foto";

    public static MediaEntityModelProvider screenshot(WebDriver driver) throws IOException {
        CreateFolder.createFolder(CAMINHO_FOTO);

        File foto = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        String caminho = CAMINHO_FOTO + File.separator + foto.getName();

        FileUtils.copyDirectory(foto, new File(caminho));
        return MediaEntityBuilder.createScreenCaptureFromPath(caminho).build();
    }

    public static MediaEntityModelProvider screenshotBase64(WebDriver driver) {
        try {
            CreateFolder.createFolder(CAMINHO_FOTO);
            return MediaEntityBuilder.createScreenCaptureFromBase64String(((TakesScreenshot)driver).getScreenshotAs(OutputType.BASE64)).build();
        } catch (Exception e) {

        }
        return null;
    }


}
