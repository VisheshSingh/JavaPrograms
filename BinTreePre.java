import java.util.Stack;

public class BinTreePre {
	
	public static class TreeNode
	{
		int data;
		TreeNode left; TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public void preOrder(TreeNode root)
	{
		if(root!=null)
		{
			System.out.printf("%d ",root.data);
			preOrder(root.left);
			preOrder(root.right);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTreePre bi = new BinTreePre();
		TreeNode rootNode = createBinaryTree();
		
		System.out.println("Pre-order traversal soluion: ");
		
		bi.preOrder(rootNode);
		System.out.println();
	}
	
	public static TreeNode createBinaryTree()
	{
		TreeNode rootNode = new TreeNode(40);
		TreeNode node20 = new TreeNode(20);
		TreeNode node10 = new TreeNode(10);
		TreeNode node30 = new TreeNode(30);
		TreeNode node60 = new TreeNode(60);
		TreeNode node50 = new TreeNode(50);
		TreeNode node70 = new TreeNode(70);
		
		rootNode.left = node20;
		rootNode.right = node60;
		
		rootNode.left.left = node10;
		node20.right = node30;
		
		node60.left = node50;
		rootNode.right.right = node70;
		
		return rootNode;
		
	}
}	
