/*
File name: DuplicateArray.java
Author: Nathan Legg

Description: Take an unsorted integer array, sort the array, then compare each element to the others
             and determine if the element is unique. If the element is unique add it to a list, then
             output the list after all checks have been complete
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DuplicateArray {

    public static void main(String[] args) {

        //set up an unsorted array
        int[] numArray = new int[]{7, 0, 1, 2, 2, 1, 3, 5, 4, 6, 6};
        //create list
        List<Integer> list = new ArrayList<Integer>();

        //print out the original list array
        System.out.print("Original unsorted array: ");
        for (int aNumArray : numArray) {
            System.out.print(" " + aNumArray);
        }

        Arrays.sort(numArray);

        //nested for loop to compare each element to the others in array
        for (int i = 0; i < numArray.length; i++) {

            boolean isUnique = true;

            for (int j = i + 1; j < numArray.length; j++) {

                //compare element i against all elements j
                if (numArray[i] == numArray[j]) {
                    isUnique = false;
                }

            }

            if (isUnique) {
                list.add(numArray[i]);
            }

        }

        //print out the sorted list
        System.out.print("\nNew sorted array: ");
        for (Integer aList : list) {
            System.out.print(" " + aList);
        }

    }

}
