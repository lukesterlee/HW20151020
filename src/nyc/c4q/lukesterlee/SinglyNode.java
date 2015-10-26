package nyc.c4q.lukesterlee;

// singly list
public class SinglyNode {
    SinglyNode next;
    String data;
    public SinglyNode(String data) { this.data = data; }
}

class SinglyList {
    SinglyNode head;

    public void addToHead(String data) {
        SinglyNode newNode = new SinglyNode(data);
        newNode.next = head;
        head = newNode;
    }

    public void addToTail(String data) {
        SinglyNode newNode = new SinglyNode(data);
        SinglyNode current = head;
        while (current.next != null){
            current = current.next;
        }
        current.next = newNode;
        //newNode.next = null;
    }

    public void insertAfter(String prevData, String newData) {
        SinglyNode current = head;

        // traverse through list
        while(current != null && !current.data.equals(prevData)) {
            current = current.next;
        }

        if(current != null) {
            // then we know current is pointing to the node after
            // which we add 'newData'
            SinglyNode newNode = new SinglyNode(newData);
            newNode.next = current.next;
            current.next = newNode;
        }
    }
}
