package JavaBasics;

import java.util.Scanner;

public class RailwaySeatLimit {
    public static void main(String[] args) {
        int  availableseats = 20;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter how many seats you want ");
        int x= sc.nextInt();
        if (x<=availableseats) {
            System.out.println("ok you will procced to book");
        }
        else {
            System.out.println("beyond seat limt");

        }
    }
}
