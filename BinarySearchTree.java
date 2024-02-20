package Git_Series;

import java.util.Scanner;
class BST{
    Node root;
    class Node{
        Node left;
        Node right;
        int value;
        Node(int value){
            this.value = value;
            left = right = null;
        }
    }
    public Node insert(Node root,int value){
        if(root == null){
            return new Node(value);
        }
        else if(root.value > value){
            root.left = insert(root.left,value);
        }
        else if(root.value < value){
            root.right = insert(root.right,value);
        }
        return root;
    }
    public void preorder(Node root){
        if(root == null){
            return;
        }
        System.out.print(root.value+" ");
        preorder(root.left);
        preorder(root.right);
    }
    public void inorder(Node root){
        if(root == null){
            return;
        }
        inorder(root.left);
        System.out.print(root.value+" ");
        inorder(root.right);
    }
    public void postorder(Node root){
        if(root == null){
            return;
        }
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.value+" ");
    }
}
public class BinarySearchTree {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        BST bst = new BST();
        int a = obj.nextInt();
        while(a != -1){
            bst.root = bst.insert(bst.root,a);
            a = obj.nextInt();
        }
        bst.preorder(bst.root);
        bst.inorder(bst.root);
        bst.postorder(bst.root);
    }
}
