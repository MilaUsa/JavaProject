package hw;

import java.util.Scanner;

public class ThreeWords1 {
    public static void main(String[] args) {
        //Please ask user to input three string value
        //1- Print the first char of those three-string together.
        //2- Print the last char of each string together
        //3- Print true if each of the string lengths is equaled to each other.
        //
        //EXAMPLE:
        //Input -1: We
        //Input -2: Love
        //Input -3: Java
        //OUTPUT:
        //WLJ
        //eea
        //false (since each string length is not equals to each other)
        System.out.println("Please enter three string values");

        Scanner input= new Scanner(System.in);
        String str1=input.nextLine();
        String str2=input.nextLine();
        String str3=input.nextLine();
        System.out.println(str1.charAt(0)+""+str2.charAt(0)+""+str3.charAt(0));

        System.out.println(str1.charAt(str1.length()-1)+""+str2.charAt(str2.length()-1)+""+str3.charAt(str3.length()-1));

        int len1=str1.length();
        int len2=str2.length();
        int len3=str3.length();

        boolean res=len1==len2 && len2==len3 && len3==len1;
        System.out.println(res);





    }
}


