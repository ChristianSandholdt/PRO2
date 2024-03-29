package ex2student;

/**
 * BSTreeSet implements a sorted set, sorted according to the elements' natural ordering.
 * Elements in the set of type E must implement the Comparable<E> interface.
 * Note: Equal elements are not allowed in the set. Equality of two elements is
 * decided by the elements' compareTo() method.
 * Note: Elements must have a compareTo() method that is consistent with equals(),
 * that is, e1.compareTo(e2) == 0 <=> e1.equals(e2) == true.
 */
public class BSTreeSet<E extends Comparable<E>> {
    // BSTreeSet is implemented as a binary search tree.

    private Node root;

    /**
     * Create an empty BSTreeSet.
     */
    public BSTreeSet() {
        root = null;
    }

    //-------------------------------------------------------------------------

    // Return a NodePair consisting of the node
    // containing 'element' and the node's parent.
    // If root contains 'element', node is root, and parent is null.
    // If no node contains 'element', node is null,
    // and parent is the node where 'element' would be added.
    // Pre: The tree is not empty.
    private NodePair findNodeAndParent(E element) {
        Node parent = null;
        Node node = root;
        boolean found = false;
        while (!found && node != null) {
            int d = element.compareTo(node.data);
            if (d == 0) {
                found = true;
            } else {
                parent = node;
                if (d < 0) {
                    node = node.left;
                } else {
                    node = node.right;
                }
            }
        }
        return new NodePair(node, parent);
    }

    private class NodePair {
        private final Node node;
        private final Node parent;

        public NodePair(Node node, Node parent) {
            this.node = node;
            this.parent = parent;
        }
    }

    //-------------------------------------------------------------------------

    /**
     * Add 'element' to the set, if 'element' is not already present.
     * Return true, if 'element' is added.
     */
    public boolean add(E element) {
        NodePair nodePair = findNodeAndParent(element);
        if (nodePair.node != null) {
            return false;
        } else {
            Node newNode = new Node(element);
            if (nodePair.parent == null) {
                root = newNode;
            } else if (element.compareTo(nodePair.parent.data) < 0) {
                nodePair.parent.left = newNode;
            } else {
                nodePair.parent.right = newNode;
            }
            return true;
        }
    }

    /**
     * Return true, if the set contains 'element'.
     */
    public boolean contains(E element) {
        // TODO
        return false;
    }

    /**
     * Remove 'element' from the set, if it is present.
     * Return true, if 'element' is removed.
     */
    public boolean remove(E element) {
        // guard: tree is empty
        if (root == null)
            return false;

        // look for node containing element
        NodePair pair = this.findNodeAndParent(element);
        Node toBeRemoved = pair.node;
        Node parent = pair.parent;

        // guard: element is not in the tree
        if (toBeRemoved == null)
            return false;

        if (toBeRemoved.left == null || toBeRemoved.right == null) {
            // one child is null (or both)

            // child is the not-null child of toBeRemoved (or null if both children are  null)
            Node child = (toBeRemoved.left != null) ? toBeRemoved.left : toBeRemoved.right;

            if (parent == null) {
                // toBeRemoved is the root
                root = child;
            } else if (parent.left == toBeRemoved) {
                parent.left = child;
            } else {
                parent.right = child;
            }
        } else {
            // both children of toBeRemoved are not null

            // find the smallest element of the right subtree
            Node parentOfSmallest = toBeRemoved;
            Node smallest = toBeRemoved.right;
            while (smallest.left != null) {
                parentOfSmallest = smallest;
                smallest = smallest.left;
            }
            // smallest now contains the smallest child in right subtree (and its left child is null)

            // move content of smallest to toBeRemoved, remove smallest
            toBeRemoved.data = smallest.data;
            if (parentOfSmallest == toBeRemoved) {
                parentOfSmallest.right = smallest.right;
            } else {
                parentOfSmallest.left = smallest.right;
            }
        }
        return true;
    }

    /**
     * Return a string containing all elements in sorted order.
     */
    @Override
    public String toString() {
        // TODO
        return null;
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
