package org.example;

public class List {

    Node head;

    private class Node {
        int value;
        Node next;
    }

    public void revert() {
        if (head != null && head.next != null){
            Node temp = head;
            revert(head.next, head);
            temp.next = null;
        }
    }

    private void revert(Node curentNode, Node previosNode){
        if (curentNode.next == null) {
            head = curentNode;
        } else {
            revert(curentNode.next, curentNode);
        }
        curentNode.next = previosNode;
    }
}
