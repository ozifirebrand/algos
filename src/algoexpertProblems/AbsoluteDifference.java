package algoexpertProblems;

import java.util.Arrays;

public class AbsoluteDifference {
    public static int[] smallestDifference(int[] arrayOne, int[] arrayTwo) {
        // Write your code here.
        int [] arrayOfDifference = new int[2];
        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);
        int indexOne = 0;
        int indexTwo = 0 ;
        int smallest = Integer.MAX_VALUE;
        int current ;
        while(  indexOne < arrayOne.length && indexTwo < arrayTwo.length){
            int firstValue = arrayOne[indexOne];
            int secondValue = arrayTwo[indexTwo];
            if ( firstValue < secondValue){
                current = Math.abs(firstValue- secondValue);
                indexOne ++;
            }
            else if(firstValue> secondValue) {
                current = Math.abs(firstValue - secondValue);
                indexTwo ++;
            }
            else{
                arrayOfDifference [0] = firstValue;
                arrayOfDifference [1] = secondValue;
                return arrayOfDifference;
            }
            if( smallest > current) {
                smallest = current;
                arrayOfDifference [0] = firstValue;
                arrayOfDifference [1] = secondValue;
            }
        }
        return arrayOfDifference;
    }

    public static void main(String[] args) {
        int [] arrayOne = {-1, 5, 10, 20, 28, 3};
        int [] arrayTwo = {26, 134, 135, 15, 17};

        System.out.println(Arrays.toString(smallestDifference(arrayOne, arrayTwo)));
    }
}
