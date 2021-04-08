package JavaBasics;

import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value");
        String x = sc.nextLine();
        StringBuilder z= new StringBuilder(x);
        z=z.reverse();
        String y=z.toString();
        System.out.println(y);
    }
    }







