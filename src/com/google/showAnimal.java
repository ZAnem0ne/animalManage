package com.google;

import java.util.ArrayList;
import java.util.Iterator;

public class showAnimal {
    public static void showAnimal(ArrayList<Animal> array){
//        使用fori遍历输出集合
//        for (int i = 0; i <array.size() ; i++) {
//            Animal animal = new Animal();
//            animal = array.get(i);
//            System.out.println(animal.toString());
//        }
        //使用迭代器进行输出集合
        Iterator iterator = array.iterator();
        while (iterator.hasNext()){
            Object value = iterator.next();
            System.out.println(value);
        }
    }
}
