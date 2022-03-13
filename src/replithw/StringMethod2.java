package hw;

import java.util.Scanner;

public class StringMethod2 {
    public static void main(String[] args) {
        //1. Go to Main class
        //2. Create a Scanner object inside the main method
        //3. Ask the user to enter a random word
        //4. Then ask the user to input the number of letters that word consists
        //5. Your code should print true if the user entered a right number of letters in the word, false if the wrong number is entered.
        //6. Then the code should ask to enter a letter that the user wants to find an index of.
        //7. Your code should print the index of the entered letter, if the word doesn’t contain the letter then the code should print -1
        //8. Please look at two Examples below to understand how your code should work.
        //
        //Enter a random word
        //Techtorial -> this line represents user's input
        //Enter number of letter that word consists
        //10 -> this line represents user's input
        //true
        //Enter a letter that you want to find an index
        //a -> this line represents user's input
        //8
        //
        //Second Example
        //
        //Enter a random word
        //Java
        //Enter number of letter that word consists
        //6
        //false
        //Enter a letter that you want to find an index
        //v
        //2

        Scanner input= new Scanner(System.in);

        System.out.println("Enter a random word");
        String ranWord=input.nextLine();



        System.out.println("Enter number of letter that word consists");
        int numLetter=input.nextInt();
        int code=ranWord.length();

        boolean res=numLetter==code;
        System.out.println(res);


        System.out.println("Enter a letter that you want to find an index");
        String letInt=input.next();

    }
}
