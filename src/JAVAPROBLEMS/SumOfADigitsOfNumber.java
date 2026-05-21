package JAVAPROBLEMS;

import java.util.Scanner;

public class SumOfADigitsOfNumber {
    static void main() {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the number:");
        int n=sc.nextInt();
        int sum=0;
        while(n>0){
            int rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.println("Sum Of Digits Of a Number"+ sum);
    }
}
