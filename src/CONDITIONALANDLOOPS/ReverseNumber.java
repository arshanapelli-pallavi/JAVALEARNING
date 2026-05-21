package CONDITIONALANDLOOPS;

import java.util.Scanner;

public class ReverseNumber {
    static void main() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number:");
        int n= sc.nextInt();
        int rev=0;
        while(n>0){
            int rem=n%10;
            n=n/10;
            rev=rev*10+rem;
        }
        System.out.println(rev);
    }
}

