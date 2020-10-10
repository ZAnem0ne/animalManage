package com.google;

import java.util.ArrayList;
import java.util.Scanner;

public class delAnimal {
    public static void delAnimal(ArrayList<Animal> array){
        Scanner scanner = new Scanner(System.in);
        System.out.println("输入你要删除动物的名字:");
        String name = scanner.nextLine();
        int numberJudgement = -1;
        for (int i = 0; i <array.size() ; i++) {
            Animal animal = array.get(i);
            if (animal.getName().equals(name)){
                numberJudgement = i;
            }
        }
        if (numberJudgement == -1){
            System.out.println("没有这只动物噢！");
        }else {
            array.remove(numberJudgement);
        }
    }
}
