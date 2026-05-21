package CONDITIONALANDLOOPS;

import java.util.Scanner;

public class DiscountOfProduct {
    public static void main() {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter The Amount:");
        int Amount=sc.nextInt();
        System.out.print("Enter The Discount:");
        int Discount=sc.nextInt();
        double DiscountAmount=Amount*(Discount/100.0);
        double bill=Amount-DiscountAmount;
        System.out.println("Total Amount:" +bill);
    }
}
