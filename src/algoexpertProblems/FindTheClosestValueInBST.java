package algoexpertProblems;

public class FindTheClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target){
        int whatever = Math.abs(tree.value - target);
        if ( tree.value == whatever);

        return -1;
    }
    static class BST{
        public int value;
        public BST left;
        public BST right;

        public BST(int value){
            this.value = value;
        }

    }
}
