package CONDITIONALANDLOOPS;

import java.util.Scanner;

public class MaxOfAll {
    public static void main() {
       int max=0;
        Scanner sc=new Scanner(System.in);
        while(true){
            int num = sc.nextInt();
            if(num==0){
                break;
            }
            else if(num>max){
                max=num;
            }
        }
        System.out.println("largest:"+max);

    }
}
