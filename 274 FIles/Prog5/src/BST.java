import java.util.Random;
import java.util.Scanner;

public class BST {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        boolean loop = true;
        BST newBST = new BST();
        while (loop) {
            int input;
            System.out.printf("1) Create empty BST\n" +
                    "2) Add a number to the BST\n" +
                    "3) Add 20 random numbers to your BST\n" +
                    "4) Display the BST in sorted order\n" +
                    "5) Show Stats\n");
            input = scan.nextInt();
            if (input == 1) {
                newBST = new BST();
            } else if (input == 2) {
                System.out.println("Add a number to the BST");
                int num = scan.nextInt();
                newBST.add(num);
            } else if (input == 3) {
                Random rand = new Random();
                for (int i = 0; i < 20; i++) {
                    newBST.add(1 + rand.nextInt(999 - 1));
                }
            } else if (input == 4) {
                newBST.display();
                System.out.println();
            } else if (input == 5) {
                if (newBST.size() == 0 || newBST.root == null) {
                    System.out.println("There is nothing in the BST");
                } else {
                    double avg = newBST.sum() / newBST.size();
                    System.out.printf("1) Root: %d\n" +
                            "2) Tree height: %d\n" +
                            "3) Number of items in the tree: %d\n" +
                            "4) Minimum value: %d\n" +
                            "5) Maximum value: %d\n" +
                            "6) Average value: %d\n\n", newBST.root.getValue(), newBST.height(), newBST.size(), newBST.min(), newBST.max(), (int) avg);
                }
            }
        }
    }

    class Node { //node class start
        private int value;
        private Node lc;
        private Node rc;

        public Node(int x) {
            value = x;
            lc = null;
            rc = null;
        }

        public int getValue() {
            return value;
        }

        public void setRight(Node n) {
            rc = n;
        }

        public void setLeft(Node n) {
            lc = n;
        }

        public Node getRight() {
            return rc;
        }

        public Node getLeft() {
            return lc;
        }
    }

    public int size() {   //size of the tree
        if (root == null) {
            return 0;
        } else {
            return 1 + size(root.getLeft()) + size(root.getRight());
        }
    }

    private int size(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + size(n.getLeft()) + size(n.getRight());
        }
    }

    public int sum() {
        if (root == null) {
            return 0;
        } else {
            return root.getValue() + sum(root.getLeft()) + sum(root.getRight());
        }
    }

    private int sum(Node n) {
        if (n == null) {
            return 0;
        } else {
            return n.getValue() + sum(n.getLeft()) + sum(n.getRight());
        }
    }

    public int height() {
        if (root == null) {
            return 0;
        } else {
            return 1 + Math.max(height(root.getLeft()), height(root.getRight()));
        }
    }

    private int height(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
        }
    }

    public int min() {
        if (root.lc == null) {
            return root.getValue();
        }
        return min(root.getLeft());
    }

    private int min(Node n) {
        if (n.lc == null) {
            return n.getValue();
        }
        return min(n.getLeft());
    }

    public int max() {
        if (root.rc == null) {
            return root.getValue();
        }
        return max(root.getRight());
    }

    private int max(Node n) {
        if (n.rc == null) {
            return n.getValue();
        }
        return max(n.getRight());
    }

    private Node root;

    public BST() {
        root = null;
    }

    public void display() {
        if (root == null) {
            System.out.println("Empty Tree");
        } else {
            display(root);
        }
    }

    private void display(Node n) {
        if (n == null) {
            return;
        } else {
            display(n.lc);
            System.out.print(n.getValue() + ", ");
            display(n.rc);
        }
    }

    public void add(int x) {
        if (root == null) {
            root = new Node(x);
            System.out.println("New root: " + x);
        } else {
            System.out.println("\nAdding: " + x);
            add(root, x);
        }
    }

    private void add(Node n, int x) {
        if (x == n.getValue()) {
            System.out.println("Duplicate Value " + x + " will not be added");
        } else {
            System.out.println("Parent: " + n.getValue() + " New Value: " + x);
            if (x < n.getValue()) {
                System.out.println("go left");
                if (n.lc == null) {
                    System.out.println("Left child is empty. Add " + x + " here");
                    n.lc = new Node(x);
                } else {
                    add(n.lc, x);
                }
            } else {
                System.out.println("Go right");
                if (n.rc == null) {
                    System.out.println("Right Child is empty. Add " + x + "here");
                    n.rc = new Node(x);
                } else {
                    add(n.rc, x);
                }
            }
        }
    }
}
