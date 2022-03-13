package hw;

import java.util.Scanner;

public class UpperCaseToLower {
    public static void main(String[] args) {
        //Ask user to enter a password
        //
        //1 - > If the string doesn't have any upper case
        //      letter or any lower case letter print
        //      "Your password is not acceptable"
        //
        //2 - > If the first character of the password is upper case letter and
        //      last character of the password is not letter print
        //      "Your password is strong".
        //
        //3 - > If first character of the password is lower case letter and
        //      last character of the string is upper case print
        //      "Your password should be improved"
        //
        //4 - > For all other conditions print
        //      "Your password is not valid"
        //
        //For this task you should use if else statement.
        //
        //This is the hardest task in this week's homework and
        //I will send solution for this task on Monday.
        //
        //Good Luck !
        Scanner input=new Scanner(System.in);
        String password= input.next();
        String upperCase= password.toUpperCase();
        String lowerCase=password.toLowerCase();
        int lastIndexofPassword= (password.length()-1);
        if(upperCase.equals(password)|| lowerCase.equals(password)){
            System.out.println("Your password is not acceptable");}
        else if( upperCase.charAt(0)== password.charAt(0) && lowerCase.charAt(0)!= password.charAt(0) &&
                upperCase.charAt(lastIndexofPassword) == lowerCase.charAt(lastIndexofPassword)){
            System.out.println("Your password is strong");
        }else if(lowerCase.charAt(0)== password.charAt(0)
                && upperCase.charAt(0)!= password.charAt(0) && upperCase.charAt(lastIndexofPassword) ==
                password.charAt(lastIndexofPassword)){
            System.out.println("Your password should be improved");
        }else {
            System.out.println("Your password is not valid");
        }

        }
    }






