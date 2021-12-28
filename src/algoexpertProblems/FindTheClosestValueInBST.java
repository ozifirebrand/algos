package algoexpertProblems;

public class FindTheClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target){

        while ( tree.right != null && tree.left != null) {
            int initialNodeValue = tree.value;
            int currentNodeValue;

            int firstValueDifference = Math.abs(initialNodeValue - target);

            if ( target >= initialNodeValue ) currentNodeValue = tree.right.value;

            else tree.value = tree.left.value;

            int secondValueDifference = Math.abs(tree.value - target);

            if ( secondValueDifference > firstValueDifference ) tree.value = initialNodeValue;

        }
        return tree.value;
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
