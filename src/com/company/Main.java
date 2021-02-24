package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        System.out.println(myMethod(getRandomAge(), -11));
        System.out.println(myMethod(getRandomAge(), 28));
        System.out.println(myMethod(getRandomAge(), 20));
        System.out.println(myMethod(getRandomAge(), 5));
        System.out.println(myMethod(getRandomAge(), 55));

    }
    public static String myMethod(int age, int temperature) {
        if (age >= 20 && age <= 45 && temperature >= -10 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature <= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature > -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайся дома");
        }
        return "Возраст = " + age + " Температура на улице = " + temperature + "C";
    }

    public static int getRandomAge() {
        int maxAge = 71;
        Random random = new Random();
        return random.nextInt(maxAge);
    }

}

