package JavaBasics;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = 0, b = 1, i;
        for (i =0; i<n; i++) {
            System.out.println(a);
            int sum=a+b;
            a=b;
            b=sum;
        }
    }
}