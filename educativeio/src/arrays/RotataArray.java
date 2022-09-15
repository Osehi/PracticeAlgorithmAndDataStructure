package arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RotataArray {
//    println("Here is my rotated list: ${list}")
    // here is the output: => [6, 7, 1, 2, 3, 4, 5]
    public static void main(String[] args) {
//        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7); // 0,1,2,3,4,5,6
        System.out.println(rotateFromRight2(new int[]{1, 2, 3, 4, 5, 6, 7}, 9));
        // 3 4 5 6 7 1 2

    }

    public static List<Integer> rotateFromRight(int[] arr, int k) {
        int rem = k % arr.length;
        int pos = arr.length - rem;
        List<Integer> list = new ArrayList<>();
        for (int i = pos; i < arr.length; i++) {
            list.add(arr[i]);
        }
        for (int i = 0; i < pos; i++) {
            list.add(arr[i]);
        }
        return list;
    }

    public static List<Integer> rotateFromRight2(int[] arr, int k) {
        int len = arr.length;
        int pos = arr.length - k % len;
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int i = pos;
        while (count < len) {
            list.add(arr[i % len]);
            count += 1;
            if (count == len) {
                break;
            }
            i++;
        }
        return list;
    }
}
