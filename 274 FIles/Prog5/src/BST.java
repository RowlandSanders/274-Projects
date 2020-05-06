import java.util.Random;
import java.util.Scanner;

public class BST { //node and BST in the same class
    public static void main(String[] args) { //main

        Scanner in = new Scanner(System.in); //Scanner for inputs
        boolean state = true;

        BST startBST = new BST(); //for making a new BST

        while (state) {

            int input;
            System.out.println(" "); // menu creation based on format
            System.out.printf(
                    "- Main Menu -\n" +
                    "1) Create empty BST\n" +
                    "2) Add a number to the BST\n" +
                    "3) Add 20 random numbers to your BST\n" +
                    "4) Display the BST in sorted order\n" +
                    "5) Show Stats\n");
            System.out.println(" ");
            input = in.nextInt();
            System.out.println(" ");

            if (input == 1) { //making a new BST
                System.out.println("New empty BST created");
                startBST = new BST();

            } else if (input == 2) { //adding a value to the BST
                System.out.print("What value do you want to add to the BST? ");
                int num = in.nextInt();
                startBST.add(num);

            } else if (input == 3) { //adding 20 random ints to the BST
                Random rand = new Random();

                for (int i = 0; i < 20; i++) {
                    startBST.add(1 + rand.nextInt(1000 - 0));
                }

            } else if (input == 4) { //displaying current BST
                startBST.display();
                System.out.println();

            } else if (input == 5) { //showing the stats he gave us
                if (startBST.size() == 0 || startBST.root == null) {
                    System.out.println("There is nothing in the BST");

                } else {
                    double avg = startBST.sum() / startBST.size();
                    System.out.printf("- Stats -\n" +
                            "Root: %d\n" +
                            "Tree height: %d\n" +
                            "Items in the BST: %d\n" +
                            "Min value: %d\n" +
                            "Max value: %d\n" +
                            "Average value: %d\n\n", startBST.root.getValue(), startBST.height(), startBST.size(), startBST.min(), startBST.max(), (int) avg); //stat menu

                }
            }
        }
    }

    class Node { //node class for adding the values / setting the new nodes

        private int value;
        private Node getL;
        private Node getR;

        public Node(int x) {
            getL = null;
            getR = null;
            value = x;
        }

        public int getValue() {
            return value;
        }

        public void setRight(Node n) {
            getR = n;
        }

        public void setLeft(Node n) {
            getL = n;
        }

        public Node getRight() {
            return getR;
        }

        public Node getLeft() {
            return getL;
        }
    }

    public int size() {
        if (root == null) {

            return 0;
        } else {
            return 1 + size(root.getLeft()) + size(root.getRight());
        }
    }

    private int size(Node n) { //node size
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

    private int sum(Node n) { //adding for average
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

    private int height(Node n) { //getting the height for the BST
        if (n == null) {

            return 0;
        } else {
            return 1 + Math.max(height(n.getLeft()), height(n.getRight()));
        }
    }

    public int min() {
        if (root.getL == null) {

            return root.getValue();
        }
        return min(root.getLeft());
    }

    private int min(Node n) {
        if (n.getL == null) {

            return n.getValue();
        }
        return min(n.getLeft());
    }

    public int max() {
        if (root.getR == null) {
            return root.getValue();
        }
        return max(root.getRight());
    }

    private int max(Node n) {
        if (n.getR == null) {
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
            System.out.println("The Tree is Empty"); //if the tree is empty

        } else {
            System.out.println("- Values - "); //stat data
            display(root);
        }
    }

    private void display(Node n) {
        if (n == null) {
            return;
        } else {
            display(n.getL);
            System.out.print(n.getValue() + "  ");
            display(n.getR);
        }
    }

    public void add(int x) { //adding to the adding root node
        if (root == null) {
            root = new Node(x);
            System.out.println("New root value: " + x);

        } else {
            add(root, x);
        }
    }

    private void add(Node n, int x) { //addition functions
        if (x == n.getValue()) {
            System.out.println("This is a duplicate value, value " + x + " will not be added");

        } else {

            if (x < n.getValue()) {
                if (n.getL == null) {
                    n.getL = new Node(x);
                } else {
                    add(n.getL, x);
                }
            } else {

                if (n.getR == null) {

                    n.getR = new Node(x);

                } else {
                    add(n.getR, x);
                }
            }
        }
    }
}
