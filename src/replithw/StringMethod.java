package hw;

import java.util.Scanner;

public class StringMethod {
    public static void main(String[] args) {
        //Using Scanner ask the user to enter one of the song names and make sure you are using nextLine()
        // method to instantiate string. 1. Print first char of given song name 2. Print last char
        // of given song name 3. Print length of the given song name 4. Print the index number of
        // "k" in this song name 5. Print char from an index number of 3 6. Print song name upper case 7.
        // Print song name lower case
        //
        //Please do all printing in order.

        System.out.println("Enter song name");

        Scanner scanner= new Scanner(System.in);
        String song=scanner.nextLine();
        System.out.println(song.charAt(0));
        System.out.println(song.charAt(song.length()-1));
        System.out.println(song.length());
        System.out.println(song.indexOf("k"));
        System.out.println(song.charAt(3));
        System.out.println(song.toUpperCase());
        System.out.println(song.toLowerCase());







    }
}
