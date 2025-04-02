class Node{
    int value;
    Node next;
    Node prev;
    public Node(int value){
        this.value=value;
    }
    public Node(int value,Node prev,Node next){
        this.value=value;
        this.prev=prev;
        this.next=next;
    }
}
public class Doubly {
    int size;
    Node head;
    Node tail;
    public Doubly(){
        size=0;
    }
    public void insertFirst(int value) {
        Node node = new Node(value);

        if (head == null) {
            // If the list is empty, both head and tail point to the new node
            head = node;
            tail = node;
        } else {
            // If the list is not empty, update the head's previous reference
            node.next = head;
            head.prev = node;
            node.prev = null;  // The new node will be the first, so its prev is null
            head = node; // Move head to the new node
        }
    }


    public void insertLast(int value){
        Node node=new Node(value);

        //To insert at last with tail pointer
//        node.prev=tail;
//        node.next=null;
//        tail=node;

        //To insert at last without tail pointer
        Node last=head;
        node.next=null;
        //if list is empty
        if(head==null){
            node.prev=null;
            head=node;
        }
        while(last.next!=null){
            last=last.next;
        }

        node.prev=last;
        last.next=node;
    }
    public void insert(int value,int index){
        Node temp=head;
        for(int i=0;i<index-1;i++){
            temp=temp.next;
        }
        Node newNode=new Node(value,temp.prev,temp.next);
        temp.next=newNode;
    }
    public int deleteFirst(){
        if(head==null){
            System.out.println("No item to delete");
            return -1;
        }
        int removed=head.value;
        head=head.next;
        size--;
        return  removed;
    }
    public int deleteLast() {
        if (head == null) {
            System.out.println("No item to delete");
            return -1;
        }

        int removed;
        if (head.next == null) { // If there's only one node in the list
            removed = head.value;
            head = null;
            tail = null;
        } else {
            Node last = tail;
            removed = last.value;
            tail = last.prev; // Update tail to the previous node
            tail.next = null; // Set next of new tail to null
        }
        size--;
        return removed;
    }
    public Node get(int index){
        Node temp=head;
        for(int i=0;i<index;i++){
            temp=temp.next;
        }
        return temp;
    }
    
    public int deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            System.out.println("Invalid index");
            return -1;
        }

        int removed;
        if (index == 0) { // If deleting the first node
            removed = head.value;
            head = head.next;
            if (head != null) {
                head.prev = null; // Set prev of new head to null
            } else {
                tail = null; // If the list becomes empty after deletion
            }
        } else if (index == size - 1) { // If deleting the last node
            removed = tail.value;
            tail = tail.prev;
            tail.next = null; // Set next of new tail to null
        } else { // If deleting a node in the middle
            Node nodeToDelete = get(index);
            removed = nodeToDelete.value;
            nodeToDelete.prev.next = nodeToDelete.next;
            nodeToDelete.next.prev = nodeToDelete.prev;
        }
        size--;
        return removed;
    }

    public void display(){
        Node temp=head;
        System.out.print("START->");
        while (temp!=null){
            System.out.print(temp.value+" ->");
            temp=temp.next;
        }
        System.out.println("END.");
    }
    public void displayReverse(){
        Node last=tail;
        System.out.print("START->");
        while (last!=null){
            System.out.print(last.value+" ->");
            last=last.prev;
        }
        System.out.print("END.");
    }
    public static void main(String[] args) {
        Doubly ob=new Doubly();
        ob.insertFirst(10);
        ob.insertFirst(5);
        ob.insertLast(20);
        ob.display();
//        ob.displayReverse();
        ob.insert(80,2);
        ob.display();
        ob.deleteFirst();
        ob.display();
        ob.deleteAtIndex(1);
        ob.display();
    }
}

