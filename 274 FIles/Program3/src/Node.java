public class Node {
    String value;
    Node next;

    public Node(String x){
        value = x;
        next = null;
    }

    public void display(){
        System.out.println(value + "  ");
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

//    public void setValue(){
//
//    }

}
