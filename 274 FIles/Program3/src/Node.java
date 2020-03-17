public class Node {
    /*
Rowland Sanders
CECS 274-05
Project 3: LinkedList
3/17/2020
 */
    String value;
    Node next;

    public Node(String x){
        value = x;
        next = null;
    }

    public void display(){
        System.out.print(value + "  ");
    }

    public Node getNext(){
        return next;
    }

    public void setNext(Node n){
        next = n;

    }

    public String getValue(){
        return value;
    }


}
