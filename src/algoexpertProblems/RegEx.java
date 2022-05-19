package algoexpertProblems;

public class RegEx {

    public static boolean whatever(String word){
        return word.matches("([a-zA-Z]+[.-][A-z]+\\s[A-z]+)");
    }
    public static void main(String[] args) {
        System.out.println(whatever("WAHALA-wa opo"));
    }
}
