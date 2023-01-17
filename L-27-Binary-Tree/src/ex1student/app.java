package ex1student;

public class app {
    public static void main(String[] args) {

        //Lowest tier
        BinaryTree<Integer> b15 = new BinaryTree<>(15);
        BinaryTree<Integer> b25 = new BinaryTree<>(25);
        BinaryTree<Integer> b88 = new BinaryTree<>(88);

        //Second lowest tier
        BinaryTree<Integer> b11 = new BinaryTree<>(11,null,b15);
        BinaryTree<Integer> b30 = new BinaryTree<>(30,b25,null);
        BinaryTree<Integer> b90 = new BinaryTree<>(90,b88,null);

        //Third lowest
        BinaryTree<Integer> b22 = new BinaryTree<>(22,b11,b30);
        BinaryTree<Integer> b77 = new BinaryTree<>(77,null,b90);

        //Root
        BinaryTree<Integer> b45 = new BinaryTree<>(45,b22,b77);


        //Height of tree with start in b45.
//        System.out.println(b45.height(b45.getRoot())); // does not work as method is private in other class
        System.out.println(b45.getHeight());

        //Size of tree
        System.out.println(b45.size(b45.getRoot()));

        //Amount of leafs in tree
        System.out.println(b45.leafCount(b45.getRoot()));

        //Print preoder
        System.out.println("Preorder");
        b45.preorderPrint();
        System.out.println();
        //Print postorder
        System.out.println("Postorder");
        b45.postOrderPrint();
        System.out.println();

        //Print inorder
        System.out.println("Inorder");
        b45.inOrderPrint();
        System.out.println();

        //Print in level
        System.out.println("In level");
        b45.printLevelOrder();
        System.out.println();

        //Print from list
        System.out.println();
        b45.listPrint();

    }
}
