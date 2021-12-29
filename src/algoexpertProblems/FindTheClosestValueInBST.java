package algoexpertProblems;

public class FindTheClosestValueInBST {
    public static int findClosestValueInBst(BST tree, int target){
        BST initialNode = tree;
        BST currentNode ;

        while ( initialNode.right != null && initialNode.left != null) {

            int firstValueDifference = Math.abs(initialNode.value - target);

            if ( target >= initialNode.value ) currentNode= tree.right;

            else currentNode = tree.left;

            int secondValueDifference = Math.abs(currentNode.value - target);

            if ( secondValueDifference < firstValueDifference ) tree = currentNode;

            else tree = initialNode;
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
