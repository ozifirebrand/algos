package algoexpertProblems;

import java.util.*;

import static java.lang.Integer.parseInt;

public class SortFrequency {
    public static void mapThings(List<Integer> arr){
        Map<Integer, Integer> map = new HashMap<>();
        for(int index = 0; index< arr.size(); index ++){
            Integer arrayValue = arr.get(index);
            if( map.containsKey(arrayValue)){
                map.put(arrayValue, map.get(arrayValue)+1);
            }
            else {map.put(arrayValue, 1);
            }
        }
        System.out.println(map);

    }


    public static List<List<Integer>> groupSort(List<Integer> arr) {
        // Write your code here
    /*

    create a List to house the 1-D arrays
    while array length is not exhausted,
    for each value, count how many of it are in the array
        how?
        by updating values in a hashmap
        if value exists, update, if not, create and add 1 to its value

    or

    for each value you encounter, if it exists in any index 0 of the parent array list,
    then add one to its index 1, else, create a new by 2 array list and add 1 to its index 1

    */
        List<List<Integer>> realList = new ArrayList<>();

        for (int index = 0; index < arr.size(); index ++) {
            int arrayValue = arr.get(index);
            int realListIndex = 0;
            if ( realList.size() > 0 ) {
                while (index < arr.size() && realListIndex < realList.size()) {
                    List<Integer> innerListIntegers = realList.get(realListIndex);
                    if ( innerListIntegers.size() > 0 ) {
                        int firstInteger = innerListIntegers.get(0);
                        if ( firstInteger == arrayValue ) {
                            Integer secondInteger = innerListIntegers.get(1);
                            innerListIntegers.set(1, ++secondInteger);
                            realList.set(realListIndex, innerListIntegers);
                            System.out.println("Real list if inner list already exists: "+realList);
                        }
                    }
                    else {
                        innerListIntegers.add(arrayValue);
                        innerListIntegers.add(1);
                        realList.add(innerListIntegers);
                        System.out.println("Real list if inner list does not exist: "+realList);
                    }
                    realListIndex ++;
                }
            }
            else{
                 List<Integer> innerListIntegers = new ArrayList<>();
                 realList.add(innerListIntegers);
                System.out.println("Real list if no inner list exists: "+realList);

            }
        }

        return realList;
    }


    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>();
        arr.add(2);
        arr.add(3);
        arr.add(1);
        arr.add(2);
        arr.add(4);
        arr.add(4);
        arr.add(9);
        arr.add(5);
        arr.add(9);


        mapThings(arr);
        System.out.println(groupSort(arr));
    }
}
