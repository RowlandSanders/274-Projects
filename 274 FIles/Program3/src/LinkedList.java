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
            prev.setNext(curr.getNext()); //pointing to a new node (skips chosen node)
        }
    }

    public int getSize(){
        int count = 0;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void add(String x) {
        Node temp = new Node(x);
        if (head == null) {
            head = temp;
        }
        else if (temp.getValue().compareTo(head.getValue())<=0){
            temp.setNext(head);
            head = temp;
        }
        else if (temp.getValue().compareTo(head.getValue())>0){
            Node y = head;
            Node z = head;

            while(temp.getValue().compareTo(z.getValue())>0){
                y = z;
                z = z.getNext();
                if(z==null){
                    temp.setNext(y.getNext());
                    break;
                }

            }if(z!=null){
                temp.setNext(z);
            }
            y.setNext(temp);
            }
        else{
        temp.setNext(head);
        head = temp;

        }
    }

    public boolean find(String s) {
        Node temp = head;
        while (temp != null) {
            if (temp.getValue() == s) {
                return true;
            } else {
                temp = temp.getNext();
            }
        }
        return false;
    }
}
