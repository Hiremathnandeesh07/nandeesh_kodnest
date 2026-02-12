package DSA.Queue;



class  Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class QueueCreation{
    Node front;
    Node rear;

    QueueCreation(){
        front=null;
        rear=null;
    }

    void ll_enqueue(int x){
        Node newnode=new Node(x);
        if(rear==null){
            front=rear=newnode;
            return;
        }
        rear.next=newnode;
        rear=newnode;
    }

    int ll_dequeue() {
        if (front == null) {
            System.out.println("Queue Underflow");
            return -1;
        }

        int val = front.data;
        front = front.next;

        if (front == null)
            rear = null;

        return val;
    }
    }




public class Q_implimentation_LL {
    static void main(String[] args) {
        QueueCreation q=new QueueCreation();
        q.ll_enqueue(34);
        q.ll_enqueue(11);
        System.out.println(q.ll_dequeue());


    }
}
