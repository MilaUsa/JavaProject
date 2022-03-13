package project5;

import java.util.Scanner;

public class Task7SeperateEachWord {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter a sentence");
        String str=sc.nextLine();
        String sentence="";
        for(int i=0;i<=str.length();i++){
           char  ch=str.charAt(i);
           if(i!=0 && Character.isUpperCase(ch)){
               sentence+=" "+ch;

           } else {
               sentence+=ch;
           }

        }
        System.out.println(sentence);

    }
}
