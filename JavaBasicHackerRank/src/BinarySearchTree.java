
public class BinarySearchTree {

    Node root;

    public BinarySearchTree(int key) {
        root = new Node(key);
    }

    public void insertNode(int key) {
        insertRec(root, key);
    }

    public Node insertRec(Node root, int key) {

        if (root == null) {
            root = new Node(key);
            return root;
        } else if (key < root.getKey()) {
            root.setLeft(insertRec(root.getLeft(), key));
        } else if (key > root.getKey()) {
            root.setRight(insertRec(root.getRight(), key));
        }

        return root;
    }

    public void printNode(Node root) {
        if (root == null) {
            return;
        }

        printNode(root.left);
        System.out.println(root.key);
        printNode(root.right);

    }

    public void inOrderRec(){
        printNode(root);
    }


    public static void main(String args[]) {
        BinarySearchTree binarySearchTree = new BinarySearchTree(50);
        binarySearchTree.insertNode(20);
        binarySearchTree.insertNode(10);
        binarySearchTree.insertNode(30);
        binarySearchTree.insertNode(60);
        binarySearchTree.insertNode(55);
        binarySearchTree.insertNode(70);

        binarySearchTree.inOrderRec();

    }

    class Node {
        int key;
        Node left;
        Node right;

        public Node(int key) {
            this.key = key;
            this.left = null;
            this.right = null;
        }

        public int getKey() {
            return key;
        }

        public void setKey(int key) {
            this.key = key;
        }

        public Node getLeft() {
            return left;
        }

        public void setLeft(Node left) {
            this.left = left;
        }

        public Node getRight() {
            return right;
        }

        public void setRight(Node right) {
            this.right = right;
        }
    }

}
