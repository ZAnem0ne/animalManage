package com.google;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class saveAnimalInformation {
    public void saveAnimalInformation() throws IOException {
        File file = new File("animalInformation.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileUtils.writeLines(file,new ArrayList(Collections.singleton("春风很柔，夏风很烈，秋风清爽，东风凛冽，你就是春夏秋冬的风")), true);
    }
}
