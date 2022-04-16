package algoexpertProblems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MoveToEnd {

    public static List<Integer> moveElementToEnd(List<Integer> array, int toMove) {
        // Write your code here.
        // initialise two pointers, left and right including an index
        // initialise values to array with pointers as indices
        // while left pointer is lesser than or equal to right pointer plus one
        // for right pointer, if value is equal to to-move value, reduce pointer by one
        // for left pointer if value is equal to move value, and right pointer not equals to move
        // value, swap
        // then increment left pointer by one
        // return array

        int left = 0;
        int right = array.size()- 1;

        while (left < right ){
            if( array.get(right) == toMove){
                right --;
            }
            if ( array.get(left) == toMove && array.get(right) != toMove){
                int saveVal = array.get(left);
                array.set(left, array.get(right));
                array.set(right, saveVal);
                left ++;
            }
            if( array.get(left) != toMove){
                left++;
            }
        }

        return array;
    }

    public static void main(String[] args) {
        List<Integer> array = new ArrayList<>(Arrays.asList(2, 1, 2, 2, 2, 3, 4, 2));
        System.out.println(moveElementToEnd(array, 2));
        System.out.println();
        System.out.println(moveElementToEnd(new ArrayList<>(), 2));
    }
}
