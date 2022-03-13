import java.util.Scanner;

public class HWorkThreeTask4 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please enter six digit number"); //53876 , 97352
        int number= sc.nextInt();
        int n1=number%10; //6
        int n2=number/10; // 5387
        int n3=n2%10; // 7
        int n4=n2/10; //538
        int n5=n4%10; //8
        int n6=n4/10;//53
        int n7=n6%10;//3
        int n8=n6/10;//5
        System.out.println(n1+""+n3+""+n5+""+n7+""+n8);
    }
}
