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

    public void delete(int del) {     //delete node pointer
        Node prev = head;
        Node curr = head;
        int count = 0;
        if(del==1){
            head = head.getNext();
        }else{
            while (count<del) {
                prev = curr;
                curr = curr.getNext();
                count++;
            }
            
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
