package algoexpertProblems;

import java.util.Arrays;

public class MinimumChange {
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int possibleChange = 0;



        for (int coin : coins){
            if ( coin > possibleChange + 1 ) return possibleChange+1;
            else if ( coin <= possibleChange +1 ){
                possibleChange += coin;
            }
        }

        return possibleChange;
    }

    public static void main(String[] args) {
        int [] coins = { 1, 1, 4};
        System.out.println(nonConstructibleChange(coins));
    }
}