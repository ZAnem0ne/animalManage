package com.google;

import org.apache.commons.io.FileUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

public class saveAnimalInformation {
    //储存animal信息
    public static void saveAnimalInformation(ArrayList<Animal> array) throws IOException {
/*        File file = new File("animalInformation.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileUtils.writeLines(file, Collections.singleton(array.toString()));*/
        BufferedWriter bw = new BufferedWriter(new FileWriter("animalInformation.txt"));
        for (Animal ani : array) {
          bw.write(ani.getType()+"\n"+ani.getGender()+"\n"+ani.getAge()+"\n"+ ani.getName());
          bw.newLine();
          bw.flush();
        }
        bw.close();
    }
}
