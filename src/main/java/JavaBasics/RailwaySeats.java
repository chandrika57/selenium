package JavaBasics;

import java.util.Scanner;

public class RailwaySeats {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter seat number");
        int s= sc.nextInt();
        if(s%8==1||s%8==4){
            System.out.println("Lower berth");
        }
        else if (s%8==2||s%8==5){
            System.out.println("middle berth");
        }
        else if(s%8==3||s%8==6){
            System.out.println("upper berth");
        }
        else if (s%8==7){
            System.out.println("side lower berth");
        }
        else {
            System.out.println("side upper berth");
        }
    }

}
