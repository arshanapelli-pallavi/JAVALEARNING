package CONDITIONALANDLOOPS;

import java.util.Scanner;

public class DistanceBwTwoPoints {
    static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter x1:");
        double x1=sc.nextDouble();
        System.out.print("enter x2:");
        double x2=sc.nextDouble();
        System.out.print("enter y1:");
        double y1=sc.nextDouble();
        System.out.print("enter y2:");
        double y2=sc.nextDouble();
        double distance=Math.sqrt(((x1-x2)*(x1-x2))+((y1-y2)*(y1-y2)));
        System.out.println("Total Distance:" +distance);
    }
}
