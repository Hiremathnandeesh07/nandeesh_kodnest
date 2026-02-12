package DSA.LinkedList;

class dNode {
    int data;
    dNode next;
    dNode prev;

    dNode(int data) {
        this.data = data;
    }
}

class DoublyLL {

    private dNode head;

    // INSERT AT BEGINNING
    public void insertFirst(int data) {
        dNode newNode = new dNode(data);

        if (head != null) {
            newNode.next = head;
            head.prev = newNode;
        }
        head = newNode;
    }

    // INSERT AT END
    public void insertEnd(int data) {
        dNode newNode = new dNode(data);

        if (head == null) {
            head = newNode;
            return;
        }

        dNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.next = newNode;
        newNode.prev = curr;
    }

    // INSERT AT POSITION (0-based index)
    public void insertAtPos(int data, int index) {
        if (index < 0) {
            throw new IndexOutOfBoundsException("Invalid index");
        }

        if (index == 0) {
            insertFirst(data);
            return;
        }

        dNode curr = head;
        for (int i = 0; i < index - 1; i++) {
            if (curr == null) {
                throw new IndexOutOfBoundsException("Index out of bounds");
            }
            curr = curr.next;
        }

        if (curr == null) {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        dNode newNode = new dNode(data);
        newNode.next = curr.next;
        newNode.prev = curr;

        if (curr.next != null) {
            curr.next.prev = newNode;
        }

        curr.next = newNode;
    }

    // DELETE FIRST
    public void deleteAtFirst() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        head = head.next;
        head.prev = null;
    }

    // DELETE LAST
    public void deleteAtLast() {
        if (head == null) return;

        if (head.next == null) {
            head = null;
            return;
        }

        dNode curr = head;
        while (curr.next != null) {
            curr = curr.next;
        }

        curr.prev.next = null;
        curr.prev = null;
    }

    // DISPLAY FORWARD
    public void display() {
        dNode curr = head;
        while (curr != null) {
            System.out.print(curr.data + " <-> ");
            curr = curr.next;
        }
        System.out.println("null");
    }

    //reverse the doubly linked list
    public void reverseDLL(){
        if (head == null || head.next == null) return;

        dNode p=head;

        while(p!=null){
            dNode temp=p.next;
            p.next=p.prev;

            p.prev=temp;

            if(p.prev==null){
                head=p;
            }
            p=p.prev;

        }

    }
}

public class Creation_of_DLL {
    public static void main(String[] args) {
        DoublyLL dll = new DoublyLL();

        dll.insertFirst(23);
        dll.insertFirst(78);
        dll.insertEnd(67);
        dll.insertEnd(78);
        dll.insertEnd(999);
        dll.insertAtPos(56, 2);


        dll.display();
        dll.reverseDLL();
        dll.display();
    }
}
