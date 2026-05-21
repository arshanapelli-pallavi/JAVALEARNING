package JAVAPROBLEMS;

import java.util.Scanner;

public class AreaOfRhombus {
    public static void main() {
        Scanner sc =new Scanner(System.in);
        int diag1=sc.nextInt();
        int diag2=sc.nextInt();
        float area=(diag1*diag2)/2;
        System.out.println(area);


    }
}
