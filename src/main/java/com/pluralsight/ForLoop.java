package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException {
        //Using for to count down from 10 and print launch after it hits 1
        int i;
        for (i = 10; i >= 1; i--){
            System.out.println(i + "!");
            Thread.sleep(1000);

        }
        System.out.println("Launch!");
    }
}
