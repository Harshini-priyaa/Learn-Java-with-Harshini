//      6
//   7     8
// 11        12
//tree structure --> o/p --> 6 7 11 8 12

//Types of traversal
//Pre order Traversa - Root Left Right
//Post order Traverseral -> Left Right Root
//In order -> left root right
//Level order -> level wise (use ds -> queue)

import java.util.LinkedList;
import java.util.Queue; 

class TreeNode{
    public int data;
    public TreeNode left;
    public TreeNode right;

    TreeNode(int value){
        this.data = value;

        //at start they are always null so need to mention
        // this.left = null;
        // this.right = null;
    }

}

class TreeExample{

    //recursive function to traverse all the nodes of the tree
    static void traverse(TreeNode root){
        if(root == null){
            return;
        }
        System.out.println(root.data);
        traverse(root.left);
        traverse(root.right);
    }

    static void post_order_traverse(TreeNode root){
        if(root == null){
            return;
        }
  
        post_order_traverse(root.left);
        post_order_traverse(root.right);
        System.out.println(root.data);
    }

    static void levelorder(TreeNode root){
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()){
            TreeNode n = queue.poll();
            System.out.println(n.data);
            if(n.left != null) queue.offer(n.left);
            if(n.right != null) queue.offer(n.right);
        }
    }
    public static void main(String[] args) {

        TreeNode six = new TreeNode(6);
        TreeNode seven = new TreeNode(7);
        TreeNode eight = new TreeNode(8);
        //assigning right and left
        six.left = seven;
        six.right = eight;

        TreeNode eleven = new TreeNode(11);
        TreeNode twelve = new TreeNode(12);

        seven.left = eleven;
        eight.right = twelve;

        TreeNode root = six;
        
        //traverse(root);
        //post_order_traverse(root);
        levelorder(root);
    }

}