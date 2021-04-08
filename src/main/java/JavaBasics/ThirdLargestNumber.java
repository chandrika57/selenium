package JavaBasics;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ThirdLargestNumber {
    public static void main(String[] args) {
        int[] arr ={23,44,55,16,33,34};
        int size = arr.length;
        Arrays.sort(arr);
        int max =arr[size-3];
        System.out.println(max);

    }

}
