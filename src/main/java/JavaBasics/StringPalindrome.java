package JavaBasics;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        String x = sc.nextLine();


        StringBuilder z= new StringBuilder(x);
        z=z.reverse();
         String y=z.toString();
        //short cut to reserve and string convert
         //y = new StringBuilder(y).reverse().toString();
         System.out.println(y);
         if(y.equals(x))
             System.out.println("Palindrome ");
         else
             System.out.println("Not  palindrome");
    }
}
