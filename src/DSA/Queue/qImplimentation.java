package DSA.Queue;


     class Queue {
        int[] Q;
        int size;
        int front, rear;

        Queue(int size) {
            this.size = size;
            Q = new int[size];
            front = rear = -1;
        }

        void enqueue(int x) {
            if (rear == size - 1) {
                System.out.println("Queue is Full");
                return;
            }
            Q[++rear] = x;
        }

        void dequeue() {
            if (front == rear) {
                System.out.println("Queue is Empty");
                return;
            }
            ++front;
        }

        void display() {
            for (int i = front + 1; i <= rear; i++) {
                System.out.print(Q[i] + " ");
            }
            System.out.println();
        }
    }
public class qImplimentation {
    public static void main(String[] args) {
        Queue q=new Queue(15);
        q.enqueue(343);
        q.dequeue();
        q.display();

    }
}
