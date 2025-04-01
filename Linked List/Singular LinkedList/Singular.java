class node{
    int value;
    node next;

    //us for insertion at first and last position
    public node(int value){
        this.value=value;
    }

    //only use for insertion at any given position and link the new node with the next node
    public node(int value, node next) {
        this.value = value;
        this.next = next;
    }
}
public class Singular {
   int size;
   node head;
   node tail;
    public Singular() {
        this.size=0;
    }
    void insertFirst(int value){
        node Node=new node(value);
        if(head==null){
            head=Node;
            tail=Node;
        }

        Node.next=head;
        head=Node;
        size++;
        return;
    }
    void insertLast(int value){
        if(tail==null){
            insertFirst(value);
        }
        node Node=new node(value);
        tail.next=Node;
        tail=Node;
        size++;
    }
    void insert(int value, int index) {
        if (index <= 0) {
            insertFirst(value); // If index is 0 or negative, insert at the beginning
        } else if (index >= size) {
            insertLast(value); // If index is greater than or equal to size, insert at the end
        } else {
            node temp = head;
            for (int i = 0; i < index - 1; i++) { // Traverse until the node just before the desired index
                temp = temp.next;
            }
            node newNode = new node(value, temp.next); //Link the new node to the next node
            temp.next = newNode;
            size++;
        }
    }

    public int deleteFirst(){
        int removed=head.value;
        head=head.next;
        if(head==null){
            System.out.println("List is empty");
        }
        size--;
        return removed;
    }

    //To delete from the last or to delete from given index we need to get the index where we need to delete
    public node getIndex(int index){
        node Node=head;
        for(int i=0;i<index;i++){
            Node=Node.next;
        }
        return Node;  //This will return the previous node of the node which we want to delete
    }

    public int deleteLast(){
        if(size<=1){
            return deleteFirst();
        }
        node secondLatNode=getIndex(size-2); //This will point the second last node
        int removed= tail.value;
        tail=secondLatNode;
        tail.next=null;
        size--;
        return removed;
    }

    public int delete(int index){
        if(index==0){
            return deleteFirst();
        }
        if(index==size){
            return deleteLast();
        }
        node prev=getIndex(index-1);
        int removed=prev.next.value;
        prev.next=prev.next.next;
        size--;
        return removed;
    }
    public node searchNode(int value){
        node temp=head;
        while (temp!=null){
            if(temp.value==value){
                System.out.println("Node is found");
                return temp;
            }
            temp=temp.next;
        }
        return null;
    }
    void display(){
        node temp=head;
        System.out.print("START->");
        while(temp!=null){
            System.out.print(temp.value+" ->");
            temp=temp.next;
        }
        System.out.println("END.");
    }
    public static void main(String[] args) {
        Singular ob=new Singular();
        ob.insertFirst(10);
        ob.insertFirst(20);
        ob.insert(2,5);
        ob.insertFirst(50);
        ob.display();
//        ob.deleteFirst();

        ob.delete(2);
        ob.display();
        ob.searchNode(20);
    }
}
