package com.company;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        myMethod(getRandomAge(), 28);
        myMethod(getRandomAge(), -11);
        myMethod(getRandomAge(), 20);
        myMethod(getRandomAge(), 5);
        myMethod(getRandomAge(), 55);

    }

    public static boolean myMethod(int age, int temperature) {
        String result = "Возраст = " + age + " Температура на улице = " + temperature + "C";
        System.out.println(result);
        if (age >= 20 && age <= 45 && temperature >= -10 && temperature <= 30) {
            System.out.println("Можно идти гулять");
        } else if (age < 20 && temperature <= 0 && temperature <= 28) {
            System.out.println("Можно идти гулять");
        } else if (age > 45 && temperature > -10 && temperature <= 25) {
            System.out.println("Можно идти гулять");
        } else {
            System.out.println("Оставайся дома");
        }
        return true;
    }

    public static int getRandomAge() {
        int maxAge = 71;
        Random random = new Random();
        return random.nextInt(maxAge);
    }

}

