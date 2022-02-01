//traversing binary
//in order -> left, root, right
//preorder -> root, left, right
//postorder -> left, right, root


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

class Node{
    Node left, right;
    int data;

    public Node(int data){
        //assign data to the new node, set left and right children to null
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public void insert(Node node, int value){
        if(value < node.data){
            if(node.left == null){
                node.left = new Node(value);
            }else{
                insert(node.left, value);
            }
        }else if(value > node.data){
            if(node.right == null){
                node.right = new Node(value);
            }else{
                insert(node.right, value);
            }
        }

//         if(value <= data){
//             if(left == null){
//                 left = new Node(value);
//             }else{
//                 left.insert(value);
//             }
//         }else{
//             if(right == null){
//                 right = new Node(value);
//             }else{
//                 right.insert(value);
//             }
//
//         }
    }

    public boolean contains(int value){
        if(value == data){
            return true;
        }else if(value < data){
            if(left == null){
                return false;
            }else{
                return left.contains(value);
            }
        }else{
            if(right == null){
                return false;
            }else{
                return right.contains(value);
            }
        }
    }


    public int getMaxHeightLeftNode(Node root){
        int leftHeight = 0;
        int rightHeight = 0;

        if(root == null){
            return 0;
        }

        if(root.left != null){
            leftHeight = 1 + getMaxHeightLeftNode(root.left);

        }

        if(root.right != null){
            rightHeight = 1 + getMaxHeightLeftNode(root.right);

        }

        return rightHeight > leftHeight ? rightHeight : leftHeight;


    }

    public void printInOrder(Node node){
        if(node == null){
            return;
        }

        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
//        if(left != null){
//            left.printInOrder();
//        }
//        System.out.println(data);
//        if(right != null){
//            right.printInOrder();
//        }

    }

}

public class BinaryTrees {
    public static void main (String args[]){
        Node rootNode = new Node(10);

        rootNode.insert(rootNode,5);
        rootNode.insert(rootNode,8);
        rootNode.insert(rootNode,15);
        rootNode.insert(rootNode,4);

        rootNode.printInOrder(rootNode);



        System.out.println(rootNode.getMaxHeightLeftNode(rootNode));



    }
}
