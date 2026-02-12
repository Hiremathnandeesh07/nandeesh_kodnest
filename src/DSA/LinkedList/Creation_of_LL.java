package DSA.LinkedList;

class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    private Node head;   // ❗ NOT static

    // insert at beginning
    public void insertAtFirst(int x) {
        Node newNode = new Node(x);
        newNode.next = head;
        head = newNode;
    }

    // insert at last
    public void insertAtLast(int x) {
        Node newNode = new Node(x);

        if (head == null) {
            head = newNode;
            return;
        }

        Node curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }
        curr.next = newNode;
    }

    // delete first
    public void deleteFirst() {
        if (head == null) return;
        head = head.next;
    }

    // delete last
    public void deleteLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        Node curr = head;
        while (curr.next.next != null) {
            curr = curr.next;
        }
        curr.next = null;
    }

    // search element
    public boolean searchEle(int x) {
        Node curr = head;
        while (curr != null) {
            if (curr.data == x) return true;
            curr = curr.next;
        }
        return false;
    }

    // print linked list
    public void printLL() {
        Node curr = head;
        while (curr != null) {
            System.out.print(curr.data + " -> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    //count no of nodes
    public int countNodes(){
        Node curr=head;
        int count=0;
        while (curr!=null){
            count++;
            curr=curr.next;
        }
        return count;
    }



    //find sum of all nodes
    public int sumNodes(){
        Node curr=head;
        int sum=0;
        while (curr!=null){
            sum+=curr.data;
            curr=curr.next;
        }
        return sum;
    }

    //insert at position
    public void insertAtPosition(int data,int index){
        Node newNode=new Node(data);
        Node curr=head;
        for (int i = 1; i < index - 1; i++) {
            curr=curr.next;
        }
        newNode.next=curr.next;
        curr.next=newNode;
    }

    // delete node from position
    public void deleteNodeFromPosition(int index){
        if (head == null) return;

        // delete head
        if (index == 1) {
            head = head.next;
            return;
        }

        Node curr = head;
        Node prev = null;

        for (int i =0; i < index-1; i++) {
            prev = curr;
            curr = curr.next;
        }

        if (curr == null) return; // index out of bounds

        prev.next = curr.next;
    }

    public void removeDuplicate(){


        Node temp=head;
        Node curr=temp.next;
        while (curr!=null) {
            if (temp.data != curr.data) {
                temp = curr;
                curr = curr.next;
            }
            else{
                temp.next=curr.next;
                curr=curr.next;
            }
        }
    }

    public void reverseLL(){
        Node p=head;
        Node q=null,r=null;
        while (p!=null){
            r=q;
            q=p;
            p=p.next;
            q.next=r;
        }
        head=q;
    }
}

public class Creation_of_LL {
    public static void main(String[] args) {
        LinkedList newLL = new LinkedList();

        newLL.insertAtFirst(34);
        newLL.insertAtFirst(90);
        newLL.insertAtLast(900);
        newLL.insertAtLast(67);
        newLL.insertAtLast(67);
        newLL.insertAtLast(72);
        newLL.insertAtLast(11);

//        newLL.deleteFirst();
//        newLL.deleteLast();
        newLL.insertAtPosition(88,4);
        newLL.deleteNodeFromPosition(3);
        newLL.removeDuplicate();
        newLL.reverseLL();
        newLL.printLL();
//        System.out.println(newLL.searchEle(900));
//        System.out.println("no of nodes are : "+ newLL.countNodes());
//        System.out.println("sum of all nodes : "+ newLL.sumNodes());
    }
}
