package com.company;
import java.util.Scanner;
import java.util.Random
public class main {
    public static void(public static void main(String[]args) {
        System.out.println("jai shree Ram");

//        First project stone paper sicssor game
        System.out.println("Enter number 0 for stone , 1 for paper , 2 for sicssor");
        Scanner sc=new Scanner (System.in);
        int userInput=sc.nextInt();

        Random ra=new Random ();
        int computerInput= ra.nextInt(3);

        if (userInput==computerInput){
            System.out.println("Draw");
        } else if ( userInput==0&&computerInput==1 || userInput==1&&computerInput==2 ||userInput==2&&computerInput==0) {
            System.out.println("computer Win");
        }
        else {
            System.out.println("you win");
        }
        System.out.println("Computer chooise  " +computerInput);

    }
}