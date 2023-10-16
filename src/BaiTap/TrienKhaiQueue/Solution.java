package BaiTap.TrienKhaiQueue;

public class Solution extends Queue {
    void enQueue(int data) {
        Node newNode = new Node(data);
        if (front == null) {
            front = newNode;
            rear = newNode;
            rear.link = front;
        } else {
            rear.link = newNode;
            rear = newNode;
            rear.link = front;
        }
    }

    void deQueue() {

    }

    void displayQueue() {

    }
}
