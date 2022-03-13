package project5;

import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a string");
        String str=sc.nextLine();
        String count="";
        for(int i=str.length()-1;i>=0;i--) {

            count = count + str.charAt(i);

        }
        System.out.println(count.trim());
    }
}
