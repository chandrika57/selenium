package JavaBasics;

import java.util.Random;

public class GenerateRandomnumbers {
    public static void main(String[] args) {
        Random r = new Random();
        for (int i=0;i<5;i++){
            int a = r.nextInt(100);
            System.out.println(a);
        }
    }
}
