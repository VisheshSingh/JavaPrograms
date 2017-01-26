import java.util.Stack;

public class BinTreePost {
	
	public static class TreeNode
	{
		int data;
		TreeNode left; TreeNode right;
		TreeNode(int data)
		{
			this.data=data;
		}
	}
	
	public void postOrder(TreeNode root)
	{
		if(root!=null)
		{
			
			postOrder(root.left);
			postOrder(root.right);
			System.out.printf("%d ",root.data);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BinTreePost bi = new BinTreePost();
		TreeNode rootNode = createBinaryTree();
		
		System.out.println("Post-order traversal soluion: ");
		
		bi.postOrder(rootNode);
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
