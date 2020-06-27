package avltree;

public class AvlTree {
  private Node root;

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  private void rightRotate(Node node) {
    Node leftChild = node.getChildren()[0];
    Node rightGrandChild = leftChild.getChildren()[1];
    leftChild.setChildren(new Node[] {leftChild.getChildren()[0], node});
    node.setChildren(new Node[] {rightGrandChild, node.getChildren()[1]});

    increaseHeight(node);
    increaseHeight(leftChild);
  }

  private void leftRotate(Node node) {
    Node rightChild = node.getChildren()[1];
    Node leftGrandChild = rightChild.getChildren()[0];
    rightChild.setChildren(new Node[] {node, rightChild.getChildren()[0]});
    node.setChildren(new Node[] {node.getChildren()[0], leftGrandChild});

    increaseHeight(node);
    increaseHeight(rightChild);
  }

  private void increaseHeight(Node node) {
    node.setHeight(max(node.getChildren()[0].getHeight(), node.getChildren()[1].getHeight()) + 1);
  }

  private int height(Node node) {
    if (node == null)
      return 0;

    return node.getHeight();
  }

  int max(int a, int b) {
    return (a > b) ? a : b;
  }
}
