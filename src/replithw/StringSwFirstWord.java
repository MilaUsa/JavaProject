package hw;



        import java.util.Scanner;
        class Main {
            public static void main(String[] args) {
                Scanner input=new Scanner(System.in);
                System.out.println("Enter first string value");

                System.out.println("Enter second string value");

                String word1=input.nextLine();
                String word2=input.nextLine();

                String a = word1.substring((word1.length()-2),word1.length()-1);
                String b=word2.substring(0,1);
                boolean res=a.equalsIgnoreCase(b);

                System.out.println(res);









            }
        }


