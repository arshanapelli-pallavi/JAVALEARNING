package CONDITIONALANDLOOPS;

import java.util.Scanner;

public class NcrAndNpr{
    static void main() {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        int i=1;
        int s=n-r;
        int fact1=1;
        int fact2=1;
        while(i<=n){
            fact1=fact1*i;
            i++;
        }
        int j=1;
        while(j<=s){
            fact2=fact2*j;
            j++;
        }
        double npr=fact1/fact2;
        System.out.println("NPR:" +npr);
        System.out.println("For NCR");
        int k=1;
        int fact3=1;
        while(k<=r){
            fact3=fact3*k;;
            k++;
        }
        double ncr=fact1/(fact3*fact2);
        System.out.println("NCR: " +ncr);

    }
}
