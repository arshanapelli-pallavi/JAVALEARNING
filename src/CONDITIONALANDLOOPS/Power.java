package CONDITIONALANDLOOPS;

import java.util.Scanner;

public class Power {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int  num=sc.nextInt();
        System.out.print("Enter The Power:");
        int power=sc.nextInt();
        double result=Math.pow(num,power);
        System.out.println("Power Of Number:"+ result);
    }
}
