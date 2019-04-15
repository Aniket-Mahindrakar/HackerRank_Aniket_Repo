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

	/* 
    
    class Node 
    	int data;
    	Node left;
    	Node right;
	*/
	public static void levelOrder(Node root) {

        for(int d=1; d<=height(root)+1; d++){
          printGivenLevel(root, d);
        }      

    }

    public static void printGivenLevel(Node root, int l){
        if(l == 1){
            System.out.print(root.data + " ");
        }
        else if(l>=1){
            if(root.left != null){
                printGivenLevel(root.left, l-1);
            }
            if(root.right != null){
                printGivenLevel(root.right, l-1);
            }
        }
    }

    public static int height(Node root) {
        int hl = -1, hr = -1;
        if(root.left == null && root.right == null){
            return 0;
        }
        if(root.left != null){
            hl = height(root.left);
            hl++;
        }
        if(root.right != null){
            hr = height(root.right);
            hr++;
        }
          
        if(hl >= hr){
            return hl;
        } else {
            return hr;
        }
    }


	public static Node insert(Node root, int data) {