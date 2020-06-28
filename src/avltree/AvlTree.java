package avltree;

public class AvlTree {
  private Node root;

  public Node getRoot() {
    return root;
  }

  public void setRoot(Node root) {
    this.root = root;
  }

  private Node rightRotate(Node node) {
    Node leftChild = node.getChildren()[0];
    Node rightGrandChild = leftChild.getChildren()[1];
    leftChild.setChildren(new Node[] {leftChild.getChildren()[0], node});
    node.setChildren(new Node[] {rightGrandChild, node.getChildren()[1]});

    increaseHeight(node);
    increaseHeight(leftChild);

    return leftChild;
  }

  private Node leftRotate(Node node) {
    Node rightChild = node.getChildren()[1];
    Node leftGrandChild = rightChild.getChildren()[0];
    rightChild.setChildren(new Node[] {node, rightChild.getChildren()[1]});
    node.setChildren(new Node[] {node.getChildren()[0], leftGrandChild});

    increaseHeight(node);
    increaseHeight(rightChild);

    return rightChild;
  }

  private void increaseHeight(Node node) {
    node.setHeight(max(height(node.getChildren()[0]), height(node.getChildren()[1])) + 1);
  }

  private int height(Node node) {
    if (node == null)
      return 0;

    return node.getHeight();
  }

  private int max(int a, int b) {
    return (a > b) ? a : b;
  }

  private int getBalance(Node node) {
    if (node == null) {
      return 0;
    }

    return height(node.getChildren()[0]) - height(node.getChildren()[1]);
  }

  public void print(Node node, String parent) {
    if (node != null) {
      System.out.println(parent + ": " + node.getValue());
      print(node.getChildren()[0], node.getValue());
      print(node.getChildren()[1], node.getValue());
    }
  }

  public Node insert(Node parentNode, Node newNode) {
    if (parentNode == null) {
      return newNode;
    }

    Node leftChild = parentNode.getChildren()[0];
    Node rightChild = parentNode.getChildren()[1];

    if (newNode.getValue().compareTo(parentNode.getValue()) < 0) {
      parentNode.setChildren(new Node[] {insert(leftChild, newNode), rightChild});
    } else if (newNode.getValue().compareTo(parentNode.getValue()) > 0) {
      parentNode.setChildren(new Node[] {leftChild, insert(rightChild, newNode)});
    } else {
      return parentNode;
    }

    increaseHeight(parentNode);

    int balance = getBalance(parentNode);

    if (balance > 1 && newNode.getValue().compareTo(leftChild.getValue()) < 0)
      return rightRotate(parentNode);

    if (balance < -1 && newNode.getValue().compareTo(rightChild.getValue()) > 0)
      return leftRotate(parentNode);

    if (balance > 1 && newNode.getValue().compareTo(leftChild.getValue()) > 0) {
      parentNode.setChildren(new Node[] {leftRotate(leftChild), rightChild});
      return rightRotate(parentNode);
    }

    if (balance < -1 && newNode.getValue().compareTo(rightChild.getValue()) < 0) {
      parentNode.setChildren(new Node[] {leftChild, rightRotate(rightChild)});
      return leftRotate(parentNode);
    }

    return parentNode;
  }

}
