//Class to create objects of type FCITSocNetBST. You will only make ONE object of this class.
// This is the class for the BST.
import java.util.Collection;
import java.util.LinkedList;
import java.util.*;
//ID : 1946122
//Name: تسون تينج فلان تشان
//Section: XXA CPCS-204

    public class FCITSocNetBST {

        public FCITSocNetBST() {  }
        private FCITstudent root;

        int value;
        FCITSocNetBST left;
        FCITSocNetBST right;

        FCITSocNetBST(int value) {
            this.value = value;
            right = null;
            left = null;
        }
    }

/*

            /*public static <BST> void main(String[] args) {
                // Create a BST
                BST<String> tree = new BST<>();
                tree.insert("George");
                tree.insert("Michael");
                tree.insert("Tom");
                tree.insert("Adam");
                tree.insert("Jones");
                tree.insert("Peter"); // Insert Peter to the tree
                tree.insert("Daniel");

                // Traverse tree
                System.out.print("Inorder (sorted): ");
                tree.inorder();
                System.out.print("\nPostorder: ");
                tree.postorder();
                System.out.print("\nPreorder: ");
                tree.preorder();
                System.out.print("\nThe number of nodes is " + tree.getSize());

                // Search for an element
                System.out.print("\nIs Peter in the tree? " +
                        tree.search("Peter"));

                // Get a path from the root to Peter
                System.out.print("\nA path from the root to Peter is: ");
                java.util.ArrayList<BST.TreeNode<String>> path
                        = tree.path("Peter");
                for (int i = 0; path != null && i < path.size(); i++)
                    System.out.print(path.get(i).element + " ");

                Integer[] numbers = {2, 4, 3, 1, 8, 5, 6, 7};
                BST<Integer> intTree = new BST<>(numbers);
                System.out.print("\nInorder (sorted): ");
                intTree.inorder();
            }

class TreeNode<E> {
protected E element;
protected TreeNode<E> left;
protected TreeNode<E> right;
public TreeNode(E e) {
element = e;
}
}

// Create the root node
TreeNode<Integer> root = new TreeNode<>(60);
// Create the left child node
root.left = new TreeNode<>(55);
// Create the right child node
root.right = new TreeNode<>(100);
 */