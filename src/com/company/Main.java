package com.company;

import java.util.Random;

public class Main {


    public static void main(String[] args) {
        System.out.println(info(generateRandomAge(),20));
        System.out.println(info(generateRandomAge(),16));
        System.out.println(info(generateRandomAge(),19));
        System.out.println(info(generateRandomAge(),39));
        System.out.println(info(generateRandomAge(),25));
    }
    public static String info(int age, int temperature) {
        if (age > 20 && age < 45 && temperature > -20 && temperature < 30) {
            return "go for a walk 1";
        }
        else if (age < 20 && temperature > 0 && temperature < 28) {
            return "go for a walk 2";
        }
        else if (age > 45 && temperature > -10 && temperature < 25) {
            return "go for a walk 3";
        }
        else {
            return "stay home ";
        }
    }

    public static int generateRandomAge() {
        Random random= new Random();
        int age=random.nextInt(70);
        return  age;
    }


}
