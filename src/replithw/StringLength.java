package hw;

import java.util.Scanner;

public class StringLength {
    public static void main(String[] args) {
        //Using scanner ask user to enter one String value.
        //If string length is bigger than or equals to 3 print the
        //string without first and last char. If the length is smaller
        //than 3 print print as it is. (For this task you need to use if statement).
        //Example 1:
        //Please enter the String value:
        //test
        //The output is:
        //es
        //Example 2:
        //Please enter the String value:
        //Hello
        //The output is:
        //ell
        System.out.println("Please enter a string value");
        Scanner sc=new Scanner(System.in);
        String value=sc.nextLine();
        if(value.length() >=3){
            System.out.println(value.substring(1,value.length()-1));
        }
        if(value.length()<3){
            System.out.println(value);
        }

    }
}
