package driver;

import util.*;
import java.util.*;

public class PartII {
	public static void swapChildren(BinaryNode root) {
		if(root==null || (root.left==null && root.right==null)){
	        return;
	    }
		else {
			BinaryNode<Integer> temp = root.left;
			
			root.left = root.right;
			root.right = temp;

			swapChildren(root.left);
			swapChildren(root.right);
		}
	}
	public static BinaryNode removeLeaves(BinaryNode root) {
	    if(root==null || (root.left==null && root.right==null)){
	        return null;
	    }
	    else{
	        root.left = removeLeaves(root.left);
	        root.right = removeLeaves(root.right);
	        return root;
	    }
	}
	public static void main(String[] args) {
		BinaryNode<Integer> root1  = 
			new BinaryNode<Integer>(1,//root
			new BinaryNode<Integer>(2,//left subtree's root
			new BinaryNode<Integer>(4, new BinaryNode<Integer>(6, null,null),new BinaryNode<Integer>(7)),
				null
			),
			new BinaryNode<Integer>(3, null,//right subtree
			new BinaryNode<Integer>(5, null,
			new BinaryNode<Integer>(8, new BinaryNode<Integer>(9, null, null),
					null 
			)
		)));
		
		BinaryNode<Integer> root2  = 
				new BinaryNode<Integer>(1,//root
				new BinaryNode<Integer>(2,//left subtree's root
				new BinaryNode<Integer>(4, new BinaryNode<Integer>(6, null,null),new BinaryNode<Integer>(7)),
					null
				),
				new BinaryNode<Integer>(3, null,//right subtree
				new BinaryNode<Integer>(5, null,
				new BinaryNode<Integer>(8, new BinaryNode<Integer>(9, null, null),
					null 
				)
			)));		
		
		System.out.print("=======================Original Tree=======================" + "\n");
		System.out.println(root1);
		System.out.print("=======================Swap Children Called=======================" + "\n");
		swapChildren(root1);
		System.out.println(root1);
		System.out.print("=======================Original Tree=======================" + "\n");
		System.out.println(root2);
		System.out.print("=======================Remove Leaves Called=======================" + "\n");
		removeLeaves(root2);
		System.out.println(root2);
	}
}
