package ex1student;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * BinaryTree models a binary tree.
 */
public class BinaryTree<E> {
    private Node root;

    /**
     * Create an empty binary tree.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Create a binary tree with one node.
     */
    public BinaryTree(E rootData) {
        root = new Node(rootData);
    }

    /**
     * Create a BinaryTree with a root node, and
     * 'left' as left subtree and 'right' as right subtree.
     * Pre: 'left' != 'right'.
     * Note: 'left' and 'right' are nullable.
     */
    public BinaryTree(E rootData, BinaryTree<E> left, BinaryTree<E> right) {
        root = new Node(rootData);
        if (left != null) {
            root.left = left.root;
        }
        if (right != null) {
            root.right = right.root;
        }
    }

    //-------------------------------------------------------------------------

    /**
     * Return true if this tree is empty.
     */
    public boolean isEmpty() {
        return (root == null);
    }

    /**
     * Return the data at the root of this tree.
     * Pre: The tree is not empty.
     */
    public E rootData() {
        if (root != null){
            return root.data;
        }
        return null;
    }

    /**
     * Return a reference to the left subtree of this tree.
     * Pre: The tree is not empty.
     * Note: Nullable return value.
     */
    public BinaryTree<E> left() {
        BinaryTree<E> tree = new BinaryTree<>();
        tree.root = root.left;
        return null;
    }

    /**
     * Return a reference to the right subtree of this tree.
     * Pre: The tree is not empty.
     * Note: Nullable return value.
     */
    public BinaryTree<E> right() {
        BinaryTree<E> tree = new BinaryTree<>();
        tree.root = root.right;
        return null;
    }

    public Node getRoot() {
        return root;
    }

    /**
     * Recursive helper method for getHeight method.
     * Takes a tree as parameter, which will be the measuring point for the height
     */
    private int height(Node n){
        if (n == null){
            return 0;
        }
        else return 1 + Math.max(height(n.left), height(n.right));
    }

    /**
     * Returns height of tree with help from
     */
    public int getHeight(){
        return height(this.getRoot());
    }

    /**
     * Returns the size of tree given as parameter
     */
    public int size(Node n){
        int size = 0;
        if (n == null){
            return 0;
        }
        size += size(n.left) + size(n.right) + 1;
        return size;
    }

    public int leafCount(Node n){
        if (n == null){
            return 0;
        }

        if (n.left == null && n.right == null){
            return 1;
        }

        return leafCount(n.left) + leafCount(n.right);
    }

    /**
     * Prints tree in preorder
     */

    public void preorderPrint(){
        if (root == null){
            System.out.println("Empty tree");
            return;
        }
        this.printPreorder(root);
    }
    private void printPreorder(Node n){
        if (n == null){
            return;
        }
        System.out.println(n.data);
        printPreorder(n.left);
        printPreorder(n.right);
    }

    /**
     * Prints tree in postOrder
     *
     * @return
     */

    public void postOrderPrint(){
        if (root == null){
            System.out.println("List empty");
            return;
        }
        this.printPostOrder(root);
    }
    private void printPostOrder(Node n){
        if (n == null){
            return;
        }
        printPostOrder(n.left);
        printPostOrder(n.right);
        System.out.println(n.data);
    }

    /**
     * Prints a tree using inorder
     */
    public void inOrderPrint(){
        if (root == null){
            System.out.println("List empty");
            return;
        }
        this.printInOrder(root);
    }

    private void printInOrder(Node n){
        if (n == null){
            return;
        }
        printInOrder(n.left);
        System.out.println(n.data);
        printInOrder(n.right);
    }

    public void printLevelOrder(){
        int h = height(root);
        for (int i = 0; i <= h; i++) {
            printGivenLevel(root,i);
        }
    }


    private void printGivenLevel(Node n,int level){
        if (n == null){
            return;
        }
        if (level == 1){
            System.out.println(n.data);
        } else if (level > 1){
            printGivenLevel(n.left,level-1);
            printGivenLevel(n.right, level-1);
        }
    }

    public void listPrint(){
        printInList(root,new ArrayList<>());
    }
    private List<E> printInList(Node n, List<E> list){
        if (n == null){
            return null;
        }

        printInList(n.left,list);
        System.out.println("Element added: " + n.data);
        list.add(n.data);
        printInList(n.right,list);
        return list;
    }

    //-------------------------------------------------------------------------

    private class Node {
        private E data;
        private Node left;
        private Node right;

        public Node(E data) {
            this.data = data;
            left = null;
            right = null;
        }
    }
}
