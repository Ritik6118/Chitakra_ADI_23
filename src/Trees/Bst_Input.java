package Trees;

public class Bst_Input {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr= {1,2,3,4,5,6,7,8,9,10};
		TreeNode root= CreateTree(0,arr.length-1,arr);
		preorder(root);
		System.out.println();
		inorder(root);
	}
	private static void inorder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		inorder(root.left);
		System.out.print(root.val+" ");
		inorder(root.right);
	}
	private static void preorder(TreeNode root) {
		// TODO Auto-generated method stub
		if(root==null) {
			return ;
		}
		System.out.print(root.val+" ");
		preorder(root.left);
		preorder(root.right);
	}
	public static TreeNode CreateTree(int si,int ei,int[] arr) {
		if(si>ei) {
			return null;
		}
		int mid=ei+si/2;
		TreeNode nn=new TreeNode();
		nn.val=arr[mid];
		nn.left=CreateTree(si,mid-1,arr);
		nn.right=CreateTree(mid+1,ei,arr);
		return nn;
		
	}
	
}
