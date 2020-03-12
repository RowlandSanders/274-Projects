public class LinkedList {
    private Node head;

    public LinkedList() {
        head = null;
    }

    public void display(){
        Node temp = head;
        int count = 1;
        while(temp!=null){
            temp.display();
            if(count%11==0){
                System.out.println();
            }
            temp=temp.getNext();
            count++;
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
            System.out.print(curr.getValue()+" was removed from location "+ count);

        }
    }

    public int getSize(){
        int count = 1;
        Node temp = head;
        while(temp!=null){
            count++;
            temp = temp.getNext();
        }
        return count;
    }

    public void add(String x) {
        Node temp = new Node(x);
        int count = 1;
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
                count++;

            }if(z!=null){
                temp.setNext(z);
            }
            y.setNext(temp);
            }
        else{
        temp.setNext(head);
        head = temp;

        }
        System.out.println();
        System.out.println(x+" was added at location " +count);

    }

    public boolean find(String s, LinkedList myList) {
        Node temp = head;
        int counter = 1;
        while (temp != null) {
            if (s.compareTo(temp.getValue()) == 0) {
                myList.display();
                System.out.println();
                System.out.println(s +" was found at location "+counter);
                return true;
            } else {
                temp = temp.getNext();
                counter++;
            }
        }
        return false;
    }
}
