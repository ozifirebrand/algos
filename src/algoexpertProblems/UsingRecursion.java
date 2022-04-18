package algoexpertProblems;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsingRecursion {
    public static int factorial(int n){
        if ( n < 2 ) return 1;
        return n * factorial(n - 1);
    }

    public static int exponential( int x, int n){
        int newX = 1;
        newX *= x;
       if ( x == 1 ) return 1;
       if ( n ==1  ) return newX;
       return newX * exponential(x, n -1);
    }
    public static int exponentialIteration(int x, int n){
        int newX = 1;
        for ( int i = n; i >= 1; i --){
            newX *= x;
        }
        return newX;
    }

    public static int[] reverseStack(int[] array, int first, int last){
        if ( first > last ){
            return array;
        }
        int saved = array[first];
        array[first] = array[last];
        array[last] = saved;
        first ++;
        last --;
        reverseStack(array, first, last);
        return array;
    }

    public static int sumElement(int [] array, int index){
        int sum = 0;
        if ( array.length == index ) return sum;
        sum += array[index];
        index ++;
        return sum + sumElement(array, index );
    }

    public static int maximumElement(int [] array, int index, int currentMaxNumber){
        if ( index > array.length-1 ) return currentMaxNumber;
        if ( array[index] > currentMaxNumber ){
            currentMaxNumber = array[index];
        }
        index++;
        return maximumElement(array, index, currentMaxNumber);
    }

    public static List<Integer> towerOfHanoi
            (int index, List<Integer> source, List<Integer> spare, List<Integer> dest) {
        /*
        transfer top of source to spare
        remove transferred element from source
        transfer other parts to spare and delete them from source
        if source contains no element, remove elements from spare
        transfer elements from spare to dest
        remove transferred elements from spare
        if source or spare remain one element, send it to dest
        if source and spare are empty, return dest
        */
        return towerOfHanoi( index, source, spare, dest );
    }



    public static void main(String[] args) {
        int maxElement = Integer.MIN_VALUE;
        System.out.println("Factorial of 5 is: "+factorial(5));
        System.out.println();
        System.out.println("Using recursion to find exponential of 2^13 is: "+exponential(2, 13));
        System.out.println();
        System.out.println("Using for loop to find exponential of 12^13 is: "+exponentialIteration(12, 13));
        int [] normalArray = new int[]{4, 222, 2, 0, 4, 22, 14, 1, 8, 9};
        System.out.println();
        System.out.println("Reversed form of "+ Arrays.toString(normalArray) +" is: "+Arrays.toString(reverseStack(normalArray, 0, normalArray.length-1)));
        System.out.println();
        System.out.println("Sum of elements in "+ Arrays.toString(normalArray) +" is: "+sumElement(normalArray, 0));
        System.out.println();
        System.out.println("Maximum element in "+ Arrays.toString(normalArray) +" is: "+maximumElement(normalArray, 0, maxElement));
        System.out.println();
        List<Integer> source = new ArrayList<>();
        source.add(4);
        source.add(5);
        source.add(8);
        source.add(14);
        source.add(31);
        source.add(32);
        List<Integer> spare = new ArrayList<>();
        List<Integer> dest = new ArrayList<>();
        int index = source.size() -1;
        System.out.print("Stacking the tower of numbers: " +source);
        System.out.println("\nInto "+ towerOfHanoi(index, source, spare, dest));
    }
}
