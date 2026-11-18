public class Traversal {
  public static void main(String[] args) {
    
    TreeNode root = new TreeNode(10);
    root.left = new TreeNode(9);
    root.left.left = new TreeNode(5);
    root.left.right = new TreeNode(2);

    root.right = new TreeNode(15);
    root.right.left = new TreeNode(-3);
    root.right.right = new TreeNode(5);
    root.right.right.right = new TreeNode(22);
    
   // printPreOrder(root);
   //printPostOrder(root);
  //  printInOrder(root);
   // printUnderThresold(root, 7);    
  }
  public static void printPreOrder(TreeNode current) {
    if (current == null) return;
    System.out.println(current.value);
    printPreOrder(current.left);
    printPreOrder(current.right);
    
  }
  public static void printPostOrder(TreeNode current) {
    if (current == null) return;
    printPostOrder(current.left);
    printPostOrder(current.right);
    System.out.println(current.value);
  }
  public static void printInOrder(TreeNode current) {
    if (current == null) return;
    printInOrder(current.left);
    System.out.println(current.value);
    printInOrder(current.right);
  }
  // p
  public static void printUnderThresold(TreeNode current, int threshold) {
    if (current == null) return;
    if (current.value < threshold){
      System.out.println(current.value);
    }
    printUnderThresold(current.left, threshold);
    printUnderThresold(current.right, threshold);
      
  }
  public static int countNodes(TreeNode current){
   if ( current == null){ return 0;}
   int leftCount = countNodes(current.left);
   int rightCount = countNodes(current.right);
   int totalCount = leftCount + rightCount + 1;
   return totalCount;
  }
}
