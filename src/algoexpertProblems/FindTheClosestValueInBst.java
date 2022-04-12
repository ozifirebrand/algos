package algoexpertProblems;

public class FindTheClosestValueInBst {
    public static int findTheClosestValue(BST tree, int target){
        return findTheClosestValue(tree, target, tree.value);
    }
    //method overloading
    public static int findTheClosestValue(BST tree, int target, int closestValue){
        BST currentTree = tree;
        while (currentTree != null){
            if ( Math.abs(closestValue - target )> Math.abs(currentTree.value - target)  ){
                closestValue = currentTree.value;
            }

            if ( target > currentTree.value && currentTree.right != null ){
                currentTree = currentTree.right;
            }
            else if ( target < currentTree.value && currentTree.left != null ){
                currentTree = currentTree.left;
            }
            else break;
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
