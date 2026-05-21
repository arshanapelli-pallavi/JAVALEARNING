package JAVAPROBLEMS;

import java.util.Scanner;

public class AvgOfNum {
    static void main() {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int sum=0;
        int count=0;
        for(int i=1;i<=n;i++){
            sum=sum+i;
            count++;
        }
        float avg=sum/count;
        System.out.println(avg);
    }
}
