package hw;

import java.util.Scanner;

public class Concat {


        public static void main(String[] args) {
            /*Using the scanner ask the user to enter a String value and if both string length
is same concatenatethem together then print the result. If both String
length is not same then omit last chars from the longer string so it is the same
length as the shorter string. After making both strings the same length then
concatenate them and print the result.
NOTE:!!!!! Please use scanner next() method and do not use nextLine() for this task.!!!!!!!!!!!!
EXAMPLE-1:
String 1: "Cell"
String 2: "Phone"
Output: "CellPhon"
EXAMPLE-2:
String 1: "Cable"
String 2: "Mic"
Output: "CabMic"*/



            System.out.println("Enter string 1");
            //cell phone

            System.out.println("Enter string 2");
            Scanner sc = new Scanner(System.in);
            String string1 = sc.next();
            String string2 = sc.next();
            if (string1.length() == string2.length()) {
                System.out.println(string1.concat(string2));
            } else if (string1.length() < string2.length()) {
                String str2Updated = string2.substring(0, string1.length());
                // System.out.println(str2Updated);//phon
                System.out.println(string1.concat(str2Updated));
            } else if (string1.length() > string2.length()) {
                String str1Updated = string1.substring(0, string2.length());
               // System.out.println(str1Updated);
                System.out.println(str1Updated.concat(string2));
            }


        }


        }













