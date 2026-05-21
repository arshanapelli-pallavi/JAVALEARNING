package CONDITIONALANDLOOPS;

import java.util.Scanner;

public class factorial {
    static void main() {
        int fact=1;
        int i=1;
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        while(i<=n){
            fact=fact*i;
            i++;
        }
        System.out.println("Factorial:" + fact);
    }
}
