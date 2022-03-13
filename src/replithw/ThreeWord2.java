package hw;

import java.util.Scanner;

public class ThreeWord2 {
    public static void main(String[] args) {
        //Using Scanner ask user to enter one string value with three
        // words 1- Print first letter of each word together 2- Print
        // last letter of each word together 3- Print length of each word
        // (First print first word's length then print second word's length
        // lastly print last word's length) Example: Please enter value:
        // "Java String Test" Output: JST agt 4 6 4
        System.out.println("Please enter string with three words");
        Scanner input=new Scanner(System.in);

        String word1=input.next();
        String word2=input.next();
        String word3=input.next();

        System.out.println(word1.charAt(0)+""+word2.charAt(0)+""+word3.charAt(0));

        System.out.println(word1.charAt(word1.length()-1)+""+ word2.charAt(word2.length()-1)+""+word3.charAt(word3.length()-1));

        System.out.println(word1.length());
        System.out.println(word2.length());
        System.out.println(word3.length());
    }
}
