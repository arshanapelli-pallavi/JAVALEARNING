package JAVAPROBLEMS;

import java.util.Scanner;

public class VowelConsonant {
    static void main() {
        Scanner sc=new Scanner(System.in);
        char ch=sc.next().charAt(0);
        ch= Character.toLowerCase(ch);
        if(ch == 'a' || ch=='e'|| ch=='i'|| ch=='o' || ch=='u'){
            System.out.println("It Is A vowel");
        }
        else{
            System.out.println("consonant");
        }
    }
}
