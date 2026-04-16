package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) {
        //Using for to count down from 10 and print launch after it hits 1
        int i;
        for (i = 10; i >= 1; i--){
            System.out.println(i + "!");
        }
        System.out.println("Launch!");
    }
}
