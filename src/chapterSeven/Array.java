package chapterSeven;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int [] array = new int[11];
        int [] response = {1,2,3,4,5,6,7,8,9,10};
        for (int i = 1; i <= response.length; i++) {
            ++array[response[i]];
        }
        System.out.println(Arrays.toString(array));
    }
}
