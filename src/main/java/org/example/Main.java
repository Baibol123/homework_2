package org.example;
import java.util.Random;
public class Main {
    public static String weather(int age, double temp){
        if (age >= 20 && age <=40 && temp >=-20 && temp <=30){
            return "Можно идти гулять";
        }
        else if (age <= 20 && temp >= 0 && temp <=28) {
            return "Можно идти гулять";
        }
        else {
            return "Оставайтесь дома";
        }
//        System.out.println("result" + (age + temp));
    }

    public static void main(String[] args) {
        System.out.println(weather(22, 15.0));
        System.out.println(weather(15, 27.0));
        System.out.println(weather(50, 18.0));
        System.out.println(weather(30, -5.0));
        System.out.println(weather(14, 22.0));

    }
    

}