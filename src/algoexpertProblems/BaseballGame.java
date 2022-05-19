package algoexpertProblems;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Integer.parseInt;

public class BaseballGame {

    public static int calPoints(String [] ops){

        /*
        Question
        A list of string characters. The first string is an integer, add it to a list of record
        For subsequent string characters, if it is a number, add it to the record
        If it is a character, perform an operation using the symbol of the character,
            compute the values of the last value of the record and the previous value of the input list.
        Add this computation to the record
        Return a sum of the values in record


        Create a record
        For each value in input array, if it is an int, add it to the record
        Else, perform an operation
        if you see any character, turn it to int or character
        if it is an int, add it to the record
        if it is a symbol, based on the function, compute with the symbol.
         */
        List<Integer> record = new ArrayList<>();
        int sum =0;
        for (int index=0; index<ops.length; index++){
            String op= ops[index];
            char character = op.charAt(0);
            if ( isDigit(character) ){
                int value = parseInt(op);
                record.add(value);

            }
            if ( isLetter(character) ){
                char symbol = op.charAt(0);
                int lastRecordValue = record.get(record.size()-1);
                System.out.println(record);
                int value = compute(parseInt(ops[index-1]), lastRecordValue, symbol);
                record.add(value);
                System.out.println(record);
            }
        }
        for (int value:record){
            sum+=value;
        }
        return sum;
    }

    private static int compute(int value1, int value2, char symbol){
        int computation = 0;
        if ( symbol == '+' ) computation= value1 + value2;
        else if ( symbol == '*' ) computation= value1 * value2;
        else if ( symbol == '-' ) computation= value1 - value2;
        else if ( symbol == '/' ) computation= value1 / value2;
        return computation;
    }

    public static void main(String[] args) {
        String [] ops = {"3", "*", "4"};
        System.out.println(calPoints(ops));
    }
}
