package algoexpertProblems;

import java.util.*;

public class ThreeSum {
    public static List<Integer[]> threeNumberSum(int[] array, int targetSum) {
        // Write your code here.
        //"array": [12, 3, 1, 2, -6, 5, -8, 6],
        // "targetSum": 0
        Arrays.sort(array);
        List <Integer[]> triplets = new ArrayList<Integer[]>();
        for(int index = 0; index < array.length; index ++){
            int right = array.length -1;
            int left = index + 1;
            while ( left < right ){
                int currentSum = array[index] + array[left] + array[right];
                if( currentSum == targetSum){
                    Integer [] arrayOfSums = {array[index] , array[left], array[right]};
                    triplets.add(arrayOfSums);
                    System.out.println(Arrays.toString(arrayOfSums));
                    right--;
                    left++;
                }
                else if(currentSum < targetSum){
                    left++;
                }
                else {
                    right--;
                }
            }
        }

        return triplets;
    }

    public static void main(String[] args) {
        int [] anArray = {12, 3, 1, 2, -6, 5, -8, 6};
        System.out.println(threeNumberSum(anArray, 13));
    }
}