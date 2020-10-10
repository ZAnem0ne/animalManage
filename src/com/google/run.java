package com.google;

import java.util.ArrayList;
import java.util.Scanner;

public class run {
    public static void run() {
        ArrayList<Animal> array = new ArrayList<Animal>();
        while (true) {
            System.out.println("======================欢迎来到animalManage系统======================");
            System.out.println("1 添加新动物\n2 修改动物信息\n3 删除动物\n4 显示所有动物\n5 按照动物年龄排序显示动物\n6 退出程序\n输入进行程序的序号:");
            Scanner scanner = new Scanner(System.in);
            String numberIn = scanner.nextLine();
            switch (numberIn) {
                case "1":
                    addNewAnimal.addNewAnimal(array);
                    break;
                case "2":
                    changeAnimalInformation.changeAnimalInformation(array);
                    break;
                case "3":
                    delAnimal.delAnimal(array);
                    break;
                case "4":
                    showAnimal.showAnimal(array);
                    break;
                case "5":
                    compositorAnimalAge.compositorAnimalAge(array);
                    break;
                case "6":
                    System.out.println("谢谢使用，再见!");
                    System.exit(0);
            }
        }
    }
}
