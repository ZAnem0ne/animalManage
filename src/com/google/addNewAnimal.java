package com.google;

import java.util.ArrayList;
import java.util.Scanner;

public class addNewAnimal {
    public static void addNewAnimal(ArrayList<Animal> array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入Animal的种类:");
        String type = scanner.nextLine();
        System.out.println("输入Animal的性别:");
        String gender = scanner.nextLine();
        System.out.println("输入Animal的年龄");
        String age = scanner.nextLine();
        System.out.println("输入Animal的名字");
        String name = scanner.nextLine();

        //新建Animal
        Animal animal = new Animal();
        animal.setType(type);
        animal.setGender(gender);
        animal.setAge(age);
        animal.setName(name);
        array.add(animal);
        System.out.println("Animal添加成功!");
        System.out.println(animal.toString());

    }

}
