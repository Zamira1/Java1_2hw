package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(myMethod(generateRandomAge(), -11));
        System.out.println(myMethod(generateRandomAge(), 28));
        System.out.println(myMethod(generateRandomAge(), 20));
        System.out.println(myMethod(generateRandomAge(), 5));
        System.out.println(myMethod(generateRandomAge(), 55));

    }

    public static String myMethod(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -10 && temperature <= 30) {
            return "Можно идти гулять";
        } else if (age < 20 && temperature <= 0 && temperature <= 28) {
            return "Можно идти гулять";
        } else if (age > 45 && temperature > -10 && temperature <= 25) {
            return "Можно идти гулять";
        } else {
            return "Оставайся дома";
        }
    }

    public static int generateRandomAge() {
        int maxAge = 71;
        Random random = new Random();
        return random.nextInt(maxAge);
    }

}

