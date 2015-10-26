package nyc.c4q.lukesterlee;

/**
 * Created by Luke Lee on 10/26/15.
 */

class Node {
    String data;
    Node next;

    public Node(String data) {
        this.data = data;
    }
}

public class CircularlyList {

    Node head;
    int size;

    public CircularlyList() {
        size = 0;
        head.next = head;
    }

    public void addToHead(String data) {
        Node newNode = new Node(data);
        Node walker = head;
        while (walker.next != head){
            walker = walker.next;
        }
        walker.next = newNode;
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addToTail(String data) {
        Node newNode = new Node(data);
        Node walker = head;
        while (walker.next != head){
            walker = walker.next;
        }
        walker.next = newNode;
        newNode.next = head;
        size++;
    }

    public void delete(String data) {
        if (data.equals(head.data)) {
            head = head.next;
        }


    }

    public void insertAfter(String prevData, String newData) {

    }

    public static void main(String[] args) {
        Node head = new Node("3");
        Node walker = new Node("5");
        System.out.println(head == walker);
        walker.next = head;
        System.out.println(walker.next == head);
    }
}
