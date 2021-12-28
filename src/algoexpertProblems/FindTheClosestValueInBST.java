package algoexpertProblems;

public class FindTheClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target){

        int nodeValue = tree.value;

        int firstValueDifference = Math.abs(nodeValue - target);

        if ( tree.right != null && target >= nodeValue ) tree.value = tree.right.value;

        else if ( tree.left != null && target < nodeValue ) tree.value = tree.left.value;

        int secondValueDifference = Math.abs(tree.value - target);
        if ( firstValueDifference > secondValueDifference ) return tree.value;


        return nodeValue;
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
