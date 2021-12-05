package algoexpertProblems;

import java.util.Arrays;
import java.util.stream.IntStream;

public class SortedSquareArray {
    public static int[] sortAndSquare(int [] array){
        int [] squaredArray = new int[array.length];
        int indexOfSquaredArray = 0;
        for (int value: array){
            squaredArray[indexOfSquaredArray] = value * value;
            indexOfSquaredArray ++;
        }
        Arrays.sort(squaredArray);
        return squaredArray;
    }

    public static void main(String[] args) {
        int [] array = {-2, -1};

        System.out.println(Arrays.toString(sortAndSquare(array)));
    }
}
