package array;

import java.util.Arrays;

/**
 * Wednesday, 23-Feb-2022
 */
public class OneDArray {
    public static void main(String[] args) {
        int myArray1[];
        int[] myArray2;

        // initialization
        // to assign a value
        myArray2 = new int[4];
        for(int i = 0; i < myArray2.length; i++){
            System.out.println(myArray2[i]);
            // TBC
        }
        // adding elements in the array
        myArray2[0] = 10;
        myArray2[1] = 20;
        myArray2[2] = 30;
        myArray2[3] = 40;
        // accessing the elements in the array
        for(int i = 0; i < myArray2.length; i++){
            System.out.println(myArray2[i]);
        }
        // update index 3
        myArray2[3] = 500;
        // print out the updated
        for(int i = 0; i < myArray2.length; i++){
            System.out.println(myArray2[i]);
        }

        anotherWayToInitializeArray();

    }
    // another way to initialize array
    static void anotherWayToInitializeArray(){
        int[] list = {1, 3, 5, 7, 9};
        for (int i = 0; i < list.length; i++){
            System.out.println(list[i]);
        }
    }
}


