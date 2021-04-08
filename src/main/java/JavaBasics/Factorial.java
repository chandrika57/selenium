package JavaBasics;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        int f=1,i;
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();//It is the number to calculate factorial
        for (i=1;i<=n;i++){
            f=f*i;
        }
        System.out.println("Factorial of " +n+"  is :" +f);
    }
}
