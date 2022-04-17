package algoexpertProblems;


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

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(exponential(2, 13));
    }
}
