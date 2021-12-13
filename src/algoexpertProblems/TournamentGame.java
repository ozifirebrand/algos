package algoexpertProblems;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*Add teams to the hash table
Go through the results table and update each team's score
Find the highest scoring team and return
 */
public class TournamentGame {
    public static String playGame(ArrayList<ArrayList<String>> competitions, ArrayList<Integer> results){
        int points;
        int maxValue=0;
        String maxKey = "";
        int awayPlayerIndex = 1;
        int homePlayerIndex = 0;
        int additionalPoint = 3;


        Map<String, Integer> playersMap = new HashMap<>();

        for (int index = 0; index< competitions.size(); index++){

            int scorePerRound = results.get(index);
            ArrayList <String> playersPerRound = competitions.get(index);

            if ( scorePerRound == 0 ){
                String player = playersPerRound.get(awayPlayerIndex);
                if ( playersMap.containsKey(player) ){
                    points= playersMap.get(player);
                    playersMap.put(player, points+additionalPoint);
                }else playersMap.put(player, additionalPoint);
            }

            if ( scorePerRound == 1 ){
                String player = playersPerRound.get(homePlayerIndex);
                if ( playersMap.containsKey(player) ){
                    points= playersMap.get(player);
                    playersMap.put(player, points+additionalPoint);
                }else playersMap.put(player, additionalPoint);
            }
        }

        for (String key : playersMap.keySet()){
            if ( playersMap.get(key) > maxValue ){
                maxValue = playersMap.get(key);
                maxKey= key;
            }
        }
        return maxKey;
    }

//    public static String getWinner(Map<String, Integer> playersMap){
//        int maxValue=0;
//        String maxKey = "";
//        for (String key : playersMap.keySet()){
//            if ( playersMap.get(key) > maxValue ){
//                maxValue = playersMap.get(key);
//                maxKey= key;
//            }
//        }
//        return maxKey;
//
//    }
}