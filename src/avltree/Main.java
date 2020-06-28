package avltree;

public class Main {
  public static void main(String[] args) {
    AvlTree tree = new AvlTree();

    tree.setRoot(new Node("a"));
    tree.setRoot(tree.insert(tree.getRoot(), new Node("b")));
    tree.setRoot(tree.insert(tree.getRoot(), new Node("c")));
    tree.setRoot(tree.insert(tree.getRoot(), new Node("d")));

    tree.print(tree.getRoot(), "Root");
  }

}
