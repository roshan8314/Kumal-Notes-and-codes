class Node {
    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

class LinkedList {
    Node head;

    void addNode(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.next != null) {
                current = current.next;
            }
            current.next = newNode;
        }
    }

    void nextGreatestElement() {
        Node current = head;
        while (current != null) {
            int nextGreatest = -1;
            Node temp = current.next;
            while (temp != null) {
                if (temp.data > current.data) {
                    nextGreatest = temp.data;
                    break;
                }
                temp = temp.next;
            }
            System.out.println("The next greatest element after " + current.data + " is " + nextGreatest);
            current = current.next;
        }
    }
}

public class NextGreatest {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.addNode(5);
        list.addNode(2);
        list.addNode(7);
        list.addNode(4);
        list.addNode(9);

        list.nextGreatestElement();
    }
}
