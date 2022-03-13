package hw;

import java.util.Scanner;

public class PsitiveNeg {
    public static void main(String[] args) {
        //Write a Java program to get an integer number from the user and
        //print whether it is positive or negative.
        //
        //Example
        //Input number:
        //35
        //Output:
        //positive
        //Input number:
        //-35
        //Output:
        //negative
        System.out.println("Please enter an integer number");
        Scanner scan=new Scanner(System.in);
        int number=scan.nextInt();
        if(number>=0){
            System.out.println("positive");
        }
        if(number<=0){
            System.out.println("negative");
        }
    }
}
