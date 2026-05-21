package CONDITIONALANDLOOPS;

import java.util.Scanner;

public class SumOfNaturalNumbers {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number:");
        int num=sc.nextInt();
        int sum=0;
        for(int i=0;i<=num;i++){
            sum=sum+i;
        }
        System.out.println("Total Sum of the n natural numbers:" +sum);

    }
}
