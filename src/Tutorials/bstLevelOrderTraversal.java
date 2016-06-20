
class bstLevelOrderTraversal {
//Start Code
  static void levelOrder(Node root) {
    Queue<Node> queue = new LinkedList<>();
    
    if(root!=null) {
      queue.add(root);
    }
    
    while(!queue.isEmpty()) {
      Node node = queue.remove();
		  System.out.print(node.data + " ");
      
      if (node.left!=null) {
		    queue.add(node.left);
      }
        
      if (node.right!=null) {
        queue.add(node.right);
      }
    
    }

  }
//End Code
}
