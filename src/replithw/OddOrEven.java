package hw;

import java.util.Scanner;

public class OddOrEven {
    public static void main(String[] args) {
        //Using scanner ask user to enter one string value.
        //If this string length is odd number print middle 3 string from given value.
        //If the string length is even number print string without first letter.
        // (You need to use if statement for this task)
        //Example 1:
        //Please enter the String value:
        //test
        //The output is:
        //est
        //
        //Example 2:
        //Please enter the String value: Chicago
        //The output is:
        //ica
        System.out.println("Please enter a string value");

        Scanner str = new Scanner(System.in);
        String value = str.nextLine();
        int middle = value.length() / 2;


        if (value.length() % 2 == 0) {
            System.out.println(value.substring(1));
        } else {
            System.out.println(value.substring(middle - 1, middle + 2));
        }
    }}
