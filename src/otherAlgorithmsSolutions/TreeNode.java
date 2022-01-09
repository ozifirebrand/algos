package otherAlgorithmsSolutions;

public class TreeNode<E> {
    private E element;
    TreeNode<E> left;
    TreeNode<E> right;

    public TreeNode(E element){
        this.element = element;
    }
    public boolean search(Integer element){
        TreeNode<Integer> root = new TreeNode<>(5);
        root.left = new TreeNode<>(55);
        root.right = new TreeNode<>(100);

        TreeNode<Integer> current = root;
        while (current != null){
            if (element < current.element) current = root.left;
            else if ( element > current.element ) current = root.right;
            else return true;
        }

        return false;
    }

    public boolean insert( Integer element){
        TreeNode<Integer>  what = new TreeNode<Integer> (0);

        if ( what.element == 0  ) return true;

//faulty algorithm. To be right back

        return false;
    }

    public static void main(String[] args) {


    }


}
