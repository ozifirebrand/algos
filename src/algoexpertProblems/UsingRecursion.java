package algoexpertProblems;


import java.util.Arrays;

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
         int maxElement = Integer.MIN_VALUE;
        if ( index > array.length-1 ) return currentMaxNumber;
        if ( array[index] > currentMaxNumber ){ maxElement = array[index];
        currentMaxNumber = maxElement;}
        index++;
        return maximumElement(array, index, currentMaxNumber);
    }


    public static void main(String[] args) {
        int maxElemt = Integer.MIN_VALUE;
        System.out.println(factorial(5));
        System.out.println(exponential(2, 13));
        System.out.println(exponentialIteration(12, 13));
        int [] normalArray = new int[]{4, 2, 0, 4, 22, 14, 1, 8, 9};
        System.out.println(Arrays.toString(reverseStack(normalArray, 0, normalArray.length-1)));
        System.out.println(sumElement(normalArray, 0));
        System.out.println(maximumElement(normalArray, 0, maxElemt));
    }
}
