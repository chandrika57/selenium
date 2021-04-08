package JavaBasics;
import java.util.*;


public class Palindrome {
    public static  void main(String[] args){
 int remainder,reversedInteger=0;
        Scanner sc = new Scanner (System.in);
        System.out.println("enter value");
        int x = sc.nextInt();

        int y=x;
        while( x != 0 )
        {
            remainder = x % 10;  //we  wil take remainder
            reversedInteger = reversedInteger * 10 + remainder;
            x= x/10;    // we will take quotient
        }


        if (  y == reversedInteger)
            System.out.println(y + " is a palindrome.");
        else
            System.out.println(y + " is not a palindrome.");
    }
}



