package algoexpertProblems;

import java.util.Arrays;

public class MinimumChange {
    public static int nonConstructibleChange(int[] coins) {
        Arrays.sort(coins);
        int possibleChange = 0;



        for (int coin : coins){
            if ( coin > possibleChange + 1 ) return possibleChange + 1;
            else if ( coin <= possibleChange +1 ){
                possibleChange += coin;
            }
        }

        return possibleChange + 1;
    }

    public static void main(String[] args) {
        int [] coins = { 5, 7, 1, 1, 2, 3, 22};
        int [] coins1 = { 1, 1, 1, 1, 1};
        int [] coins2 = {1, 5, 1, 1, 1, 10, 15, 20, 100};
        System.out.println(nonConstructibleChange(coins));
        System.out.println(nonConstructibleChange(coins1));
        System.out.println(nonConstructibleChange(coins2));
    }
}