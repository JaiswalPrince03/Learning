package LinkedList;

public class enQueueAnddeQueue {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class Queue {
        Node head = null;
        Node tail = null;
        int size = 0;

        public void enQueue(int data) {
            Node newNode = new Node(data);
            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = newNode;
            }
            size++;
            System.out.println("Enqueued " + data + " at " + tail.data);
            System.out.println("Queue size after enqueue: " + size);
        }

        public void deQueue() {
            if (head == null) {
                System.out.println("Queue is empty");
            } else {
                Node temp = head;
                head = head.next;
                temp.next = null;
                size--;
                if (head != null) {
                    System.out.println("Dequeued " + temp.data + " at " + head.data);
                } else {
                    System.out.println("Dequeued " + temp.data + " and queue is now empty");
                }
                System.out.println("Queue size after dequeue: " + size);
            }
        }

        public void peek() {
            if (head == null) {
                System.out.println("Queue is empty");
            } else {
                System.out.println("Peeked " + head.data);
            }
        }

        public int getSize() {
            return size;
        }
    }

    public static void main(String args[]) {
        Queue q = new Queue();
        q.enQueue(10);
        q.enQueue(2);
        q.enQueue(3);
        // q.deQueue();
        q.peek();

    }
}
