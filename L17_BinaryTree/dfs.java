package L17_BinaryTree;

import java.util.*;

class TreeNode{
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode(int val){
            this.val = val;
            this.left = null;
            this.right = null;
        }
}

public class dfs {

    static void preorder(TreeNode root, List<Integer> ls){
        if(root == null){
            return;
        }
        ls.add(root.val);
        preorder(root.left, ls);
        preorder(root.right, ls);
    }

    static void inorder(TreeNode root, List<Integer> ls){
        if(root == null){
            return;
        }
        inorder(root.left, ls);
        ls.add(root.val);
        inorder(root.right, ls);
    }

    static void postorder(TreeNode root, List<Integer> ls){
        if(root == null){
            return;
        }
        postorder(root.left, ls);
        postorder(root.right, ls);
        ls.add(root.val);
    }

    public static void main(String[] args){
        int[] arr = {1, 2, -1, 4, 5, 6};

        

    }
}
