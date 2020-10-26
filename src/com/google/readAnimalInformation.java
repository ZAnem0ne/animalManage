package com.google;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class readAnimalInformation {
    public static void readAnimalInformation(ArrayList<Animal> array) throws IOException{
        BufferedReader br = new BufferedReader(new FileReader("animalInformation.txt"));
        //读取数据，每次读取一行数据
        Animal line1 = new Animal();
        String line2;
        while((line2=br.readLine())!=null){
            array.add(line1);
        }

        //释放资源
        br.close();

    }
}
