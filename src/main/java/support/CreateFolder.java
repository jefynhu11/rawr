package support;

import java.io.File;

public class CreateFolder {

    public static void createFolder(String caminho) {
        File directory = new File(caminho);
        if (!directory.exists()) {
            directory.mkdir();
        }
    }

}
