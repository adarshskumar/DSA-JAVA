package LinkedList;

// import java.util.LinkedList;

public class DLL {

    private Node head;

    public void insertFirst(int val){
        Node node = new Node(val);
        node.next = head;
        node.prev = null;
        if(head!=null){
            head.prev=node;
        }
        head=node;
    }

    public void insertLast(int val){
        Node last = head;
        Node node = new Node(val);
        if(head==null){
            head=node;
            node.prev=null;
            return;
        }
        while(last.next!=null){
            last=last.next;
        }
        
        node.next=null;
        last.next=node;
        node.prev=last;

    }

    public void insertAfter(int after, int val){
        Node p = find(after);
        if(p==null){
            System.out.println("does not exist");
            return;
        }
        Node node = new Node(val);
        node.next=p.next;
        p.next = node;
        node.prev=p;
        if(node.next!=null){
            node.next.prev = node;
        }
    }

    public Node find(int value){
        Node node =head;
        while(node!=null){
            if(node.val==value) {
                return node;
            }
            node=node.next;
        }
        return null;
    }

    public void display(){
        Node node = head;
        Node last = null;
        while(node!=null){
            System.out.print(node.val + " -> ");
            last=node;
            node= node.next;
        }
        System.out.println("END");

        System.out.println("\nPrint in Reverse");
        while(last!=null){
            System.out.print(last.val + " -> ");
            last = last.prev;
        }
        System.out.println("START");
    }

    private class Node{
        int val;
        Node next;
        Node prev;

        public Node(int val){
            this.val= val;
        }

        public Node(int val,Node next, Node prev){
            this.val=val;
            this.next= next;
            this.prev= prev;
        }
    }


    public static void main(String[] args) {

        // LinkedList ll = new LinkedList();

        // ll.add("A");
        // ll.add("B");
        // ll.addLast("c");

        // System.out.println(ll);



        DLL list = new DLL();
        list.insertFirst(3);
        list.insertFirst(2);
        list.insertFirst(8);
        list.insertFirst(17);

        list.display();

        list.insertLast(99);
        list.display();

        list.insertAfter(2, 200);
        list.display();

    }
}
