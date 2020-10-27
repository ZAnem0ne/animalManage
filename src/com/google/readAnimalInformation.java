package com.google;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readAnimalInformation {
    public static void readAnimalInformation(ArrayList<Animal> array) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("animalInformation.txt"));
        //读取数据，每次读取一行数据
        String line = br.readLine();
        while (line != null) {
            Animal animal = new Animal();
            animal.setType(line);
            line = br.readLine();
            animal.setGender(line);
            line = br.readLine();
            animal.setAge(line);
            line = br.readLine();
            animal.setName(line);
            line = br.readLine();
            array.add(animal);
        }
        br.close();

    }
}
