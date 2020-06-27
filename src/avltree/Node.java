package avltree;

public class Node {
  private String value;
//  private Node parent;
  private Node[] children;
  private int height;

  public Node(String value) {
    this.value = value;
//    this.parent = parent;
    this.children = new Node[2];
    this.height = 1;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

//  public Node getParent() {
//    return parent;
//  }
//
//  public void setParent(Node parent) {
//    this.parent = parent;
//  }

  public Node[] getChildren() {
    return children;
  }

  public void setChildren(Node[] children) {
    this.children = children;
  }

  public int getHeight() {
    return height;
  }

  public void setHeight(int height) {
    this.height = height;
  }
}
