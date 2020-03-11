import java.util.Random;

public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void display(){
        Node temp = head;
        while(temp!=null){
            temp.display();
            temp=temp.getNext();
        }
    }

    public void delete(Node Nodep, LinkedList myList){     //delete node pointer
        Random rand = new Random();
        Node temp = Nodep.getNext();
        Nodep.value = temp.getValue();
        Nodep.next = temp.rand;
        temp = null;

    }

    }

    public int getSize(){
        return size;
    }

    public void add(String x) {
        Node temp = new Node(x);
        if (head == null) {

        } else if (temp.getNodeValue() <= head.getNodeValue()) {


        }
    }
}
