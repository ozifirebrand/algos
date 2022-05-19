package algoexpertProblems;

import java.util.*;

public class SortFrequency {
    public static void mapThings(List<Integer> arr){
        Map<Integer, Integer> map = new HashMap<>();
        for (Integer arrayValue : arr) {
            if ( map.containsKey(arrayValue) ) {
                map.put(arrayValue, map.get(arrayValue) + 1);
            } else {
                map.put(arrayValue, 1);
            }
        }
        System.out.println(map);

    }


    public static List<List<Integer>> groupSort(List<Integer> arr) {
    /*
    for each value you encounter, if it exists in any index 0 of the parent array list,
    then add one to its index 1, else, create a new by 2 array list and add 1 to its index 1
    */

        List<List<Integer>> realList = new ArrayList<>();
        for (int aIndex = 0; aIndex < arr.size(); aIndex++){
            int arrValue = findElement(arr, aIndex);
            int rlIndex = 0;
            if ( realList.size() > 0 ) {
                while (rlIndex < realList.size()) {
                    List<Integer> inList = findLElemt(realList, rlIndex);
                    if ( findElement(inList, 0) == arrValue ) {
                        int freq = realList.get(rlIndex).get(1);
                        realList.get(rlIndex).set(1, ++freq );
                    }
                    rlIndex ++;
                }
            }else {
                List<Integer> listInt = new ArrayList<>();
                listInt.add(arrValue);
                listInt.add(1);
                realList.add(listInt);
            }
        }
        return realList;
    }
    private static List<Integer> changeListValue(List<Integer> myArr, int index, int changeVal){
        myArr.set(index, changeVal);
        return myArr;
    }

    private static int findElement (List<Integer> myArr, int index){
        return myArr.get(index);
    }
    private static List<Integer> findLElemt (List<List<Integer>> myArr, int index){
        return myArr.get(index);
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
