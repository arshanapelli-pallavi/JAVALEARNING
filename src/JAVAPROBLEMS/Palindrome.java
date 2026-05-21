package JAVAPROBLEMS;

import java.util.Scanner;

public class Palindrome {
    static void main() {
        Scanner sc = new Scanner(System.in);
        String name=sc.nextLine();
        String rev=new StringBuilder(name).reverse().toString();
        if(name.equals(rev)){
            System.out.println("it is a palindrome");
        }
        else{
            System.out.println("not a palindrome");
        }

    }
}
