package JavaBasics;

import java.util.Scanner;

public class CountOfDuplicateChar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
         int count=0;
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (charArray[i] == charArray[j]) {
                    System.out.println("repeated characters   : " + charArray[i]);
                        count++;
                }

            }
        }
        System.out.println("count value : "+count);
    }
}