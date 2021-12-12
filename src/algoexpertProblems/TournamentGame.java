package algoexpertProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*Add teams to the hash table
Go through the results table and update each team's score
Find the highest scoring team and return
 */
public class TournamentGame {
    public static void playGame(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results){
        int key=0;
        Map<String, Integer> playersMap = new HashMap<>();
        for (int index = 0; index< competitions.size(); index++){
            if ( results.get(index)== 0 ){
                key+=3;
                playersMap.put(competitions.get(index).get(1), key);
            }else if ( results.get(index)== 1 ){
                key+=3;
                playersMap.put(competitions.get(index).get(0), key);
            }
        }
        String winner = getWinner(playersMap);
    }

    public static String getWinner(Map<String, Integer> players){
        int maxValue=0;
        String maxKey = "";
        for (String key : players.keySet()){
            if ( players.get(key) > maxValue ){
                maxValue = players.get(key);
                maxKey= key;
            }
        }
        return maxKey;

    }
}