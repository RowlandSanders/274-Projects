public class Node {
    private String value;
    private Node next;

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
