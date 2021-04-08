package JavaBasics;

import java.util.Scanner;

public class DuplicateCharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if(charArray[i]==charArray[j]){
                    System.out.println("repeated characters   : "+charArray[i]);


                }

            }
        }

    }
}
