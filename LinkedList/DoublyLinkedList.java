package LinkedList;

public class DoublyLinkedList {
    class Node{
        int data;
        Node next;
        Node prev;

        Node(int data){
            this.data = data;
        }
    }

    public Node head;
    public Node tail;

    //add node fn
    public void addNode(int data){
        Node newNode = new Node(data);

        if(head==null) {
            head=newNode;
        } else {
            tail.next = newNode;
            newNode.prev = tail;
        }
        tail = newNode;
    }

    //print fn
    public void display(){
        //forward iteration
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next; 
        }
    }

    //backward iteration
    public void displayReverse(){

        Node temp=tail;
        while(temp!=null){
            System.out.println(temp.data);
            temp= temp.prev;
        }
    }

    //delete node 
    public void delete(int target){
        Node temp=head, preValue=null;
        if(temp!=null && temp.data ==target) {
            head = temp.next;
            return;
        }

        while(temp!=null && temp.data!=target){
            preValue=temp;
            temp= temp.next;
        }

        if(temp==null){return;}

        if(temp==tail){
            tail=preValue;
            tail.next=null;
            return;
        }

        preValue.next = temp.next;
    } 

    //insert after
    public void insertAfter(int nextTo, int data){
        Node newNode = new Node(data);
        Node temp= head;

        while(temp!=null && temp.data!=nextTo){
            temp=temp.next;
        }

        if(temp==null){
            return;
        }

        if(temp==tail){
            tail.next = newNode;
            tail= newNode;
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode; 

    }

    //insert before
    public void insertBefore(int before, int data){
        Node newNode = new Node(data);
        Node temp= head;

        while(temp!=null && temp.data!=before){
            temp=temp.next;
        }

        if(temp==null){
            return;
        }

        if(temp==tail){
            tail.next = newNode;
            tail= newNode;
            return;
        }

        newNode.next = temp.next;
        temp.next = newNode; 

    }


    //remove duplicates
    public void removeDuplicates() {
        Node current=head;
        while(current!=null){
            Node nextE = current.next;
            while(nextE!=null && nextE.data == current.data){
                nextE=nextE.next;
            }
            current.next = nextE; //making connection between previous node and next node 
            if(nextE==tail && current.data == nextE.data){ //checking for last element
                tail=current;
                tail.next=null;
            }
            current=nextE; //upadting current element current++ (iterating current)
        }
    }
    


    public static void main(String[] args) {
        DoublyLinkedList list = new DoublyLinkedList();

        list.addNode(1);
        list.addNode(2);
        list.addNode(2);
        list.addNode(2);
        list.addNode(3);
        list.addNode(3);
        list.addNode(3);
        list.addNode(3);
        list.addNode(4);

        list.display();

        // list.displayReverse();
        // list.delete(3);

        // System.out.println("\nAfter Adding");
        // list.insertAfter(4,40);
        // list.insertAfter(40,100);
        // list.insertAfter(2,20);

        System.out.println("\nRemoved Duplicates");
        list.removeDuplicates();
        list.display();
    }


}
