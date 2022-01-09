package algoexpertProblems;

public class FindTheClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target) {

        // Write your code here.
        BST currentTree = tree;
        int firstValueDifference;
        int secondValueDifference;
        int closestValue = 0;
        while (currentTree != null) {

            if ( target < currentTree.value && currentTree.left != null ) {

                currentTree = currentTree.left;
                firstValueDifference = Math.abs(currentTree.value - target);

            }
            else if ( target > currentTree.value && currentTree.right != null ) {

                currentTree = currentTree.right;
                firstValueDifference = Math.abs(currentTree.value - target);

            }

            else return currentTree.value;

            secondValueDifference = Math.abs(closestValue - target);

            if ( firstValueDifference < secondValueDifference ) closestValue = currentTree.value;


//            else if ( firstValueDifference > secondValueDifference ){

//            }

        }
        return closestValue;
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
