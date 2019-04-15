import java.util.*;
import java.io.*;

class Node {
    Node left;
    Node right;
    int data;
    
    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class Solution {

/* you only have to complete the function given below.  
Node is defined as  

class Node {
    int data;
    Node left;
    Node right;
}

*/

    public static void postOrder(Node root) {
        if(root.left != null){
            postOrder(root.left);
        }

        if(root.right != null){
            postOrder(root.right);
        }

        System.out.print(root.data + " ");
    }

	public static Node insert(Node root, int data) {