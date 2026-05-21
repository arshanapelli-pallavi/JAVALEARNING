package JAVAPROBLEMS;
import java.util.Scanner;
 class AreaTriangle {
     public static void main() {
         Scanner sc = new Scanner(System.in);
         int base = sc.nextInt();
         int height = sc.nextInt();
         double area = 0.5 * base * height;
         System.out.println("Area Of Triangle:" + area);
     }
 }
