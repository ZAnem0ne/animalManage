package com.google;

import java.util.ArrayList;
import java.util.Scanner;

public class changeAnimalInformation {
    public static void changeAnimalInformation(ArrayList<Animal> array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入要修改的动物的名字:");
        String name = scanner.nextLine();
        int numberJudgement = -1;
        for (int i = 0; i <array.size() ; i++) {
            Animal animal = array.get(i);
            if (animal.getName().equals(name)){
                numberJudgement = 1;
            }
        }
        if (numberJudgement == -1) {
            System.out.println("没有这只动物噢！");
        }else {
            System.out.println("输入新的动物种类");
            String type = scanner.nextLine();
            System.out.println("输入新的动物性别");
            String gender = scanner.nextLine();
            System.out.println("输入新的动物年龄");
            String age = scanner.nextLine();
            System.out.println("输入新的动物名字");
            String newName = scanner.nextLine();
            Animal animal = new Animal();
            animal.setName(newName);
            animal.setType(type);
            animal.setGender(gender);
            animal.setAge(age);
            for (int i = 0; i <array.size() ; i++) {
                Animal animalJudgement = array.get(i);
                if (animalJudgement.getName().equals(name)){
                    array.set(i,animal);
                    System.out.println("动物信息更改完成!");
                }
            }
        }
    }
}
