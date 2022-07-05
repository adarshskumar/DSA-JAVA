package LinkedList;

public class SinglyLinkedList {

    //node class
    class Node{
        int data;
        Node next;

        Node(int data){ //constructor
            this.data=data;
        }
    }

    public Node head =null;
    public Node tail = null;


    //add node
    public void addNode(int data){
        Node newNode=new Node(data); //obj1

        if(head == null){ //head is null or we are going to add first element
            head= newNode;
        } else{
            tail.next= newNode; //tail of first node(contains address pointing to next node)
        }
        tail = newNode; //last added node = tail

        System.out.println("new node added");
    }


    //print fn
    public void display(){
        if(head==null){
            System.out.println("empty");
            return;
        } 

        Node temp=head; //head mattiyal linkelist kolam aakum. so save it!!!

        while(temp!=null){
            System.out.println(temp.data);
            temp=temp.next; //navigating temp++
        }

    }

    //delete fn
    public void delete(int target){ //here parameter "target" is the value we are going to delete.
        Node temp = head, prev=null; // for traversing through the linked list .Assign head to a temporary variabvle "temp" and using it traverse throught the Li
        if(temp!=null &&temp.data==target){ //checking for head (if data==head) or case 1:first element
            head = temp.next;
            return;
        }

        while(temp!=null && temp.data!=target){//deleting in-between element
            prev = temp;
            temp = temp.next;
        }

        if(temp==null){
            return;
        }
        if(temp == tail){ //deleting tail element
            tail=prev; 
            tail.next = null;
            return;
        }

        prev.next = temp.next; //switching tail to previous value

    }


    public void insertAfter(int nextTo, int data){
        Node newNode = new Node(data);
        Node temp= head;

        while(temp!=null && temp.data!=nextTo){ //iterating through the Linkedlist
            temp=temp.next;
        }

        if(temp==null){ 
            return;
        }

        if(temp==tail){ //if nextto in tail
            tail.next = newNode; //making newNode to current tails's next
            tail= newNode; //making the new node as Tail
            return; 
        }
        //nextTo in between
        newNode.next = temp.next;
        temp.next = newNode; 

    }

    public static void main(String[] args) {
        SinglyLinkedList list = new SinglyLinkedList();
        list.display();

        list.addNode(10);
        list.addNode(20);
        list.addNode(50);
        list.delete(20);
        list.insertAfter(10, 100);


        list.display();
    }
    

}
