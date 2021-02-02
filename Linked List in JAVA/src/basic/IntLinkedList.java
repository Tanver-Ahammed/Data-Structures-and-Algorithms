package basic;

public class IntLinkedList {

    private Node head;

    // create a new Node using constructor
    public IntLinkedList(int item) {
        head = new Node();
        head.value = item;
        head.link = null;
    }

    // Insert first in the LinkedList
    public void insertFirst(int item) {
        // create a node
        Node node = new Node();
        node.value = item;
        node.link = head;

        head = node;
        System.out.println("Insert First the Item successfully!!");
    }

    // Insert last in the LinkedList
    public void insertLast(int item) {
        // create a node
        Node node = new Node();
        node.value = item;
        node.link = null;

        Node new_Node;
        new_Node = head;

        while(new_Node.link != null) {
            new_Node = new_Node.link;
        }

        new_Node.link = node;
        System.out.println("Insert Last the Item successfully!!");
    }

    // delete any item of the linked list
    public void deleteItem(int item) {

        // if the item is first value of the node
        if (head.value == item) {
            head = head.link;
            System.out.println("Delete the item successfully!!");
        }
        else {
            Node first = head;
            Node second = head.link;
            while(true) {
                if (second == null || second.value == item) {
                    break;
                }
                else {
                    first = second;
                    second = second.link;
                }
            }

            if (second != null) {
                first.link = second.link;
                System.out.println("Delete the item successfully!!");
            }
            else {
                System.out.println("Value is not found!!\n");
            }
        }
    }

    // sorting the list (Bubble sort)
    public void sort() {
        Node first = head;
        while(first.link != null) {
            Node second = head;
            while (second.link != null) {
                if (second.value > second.link.value) {
                    int temp = second.value;
                    second.value = second.link.value;
                    second.link.value = temp;
                }
                second = second.link;
            }
            first = first.link;
        }
    }

    // Traverse all or print all the node
    public void printAllList() {
        Node n = head;
        while(n != null) {
            System.out.print(n.value+" ");
            n = n.link;
        }
        System.out.println();
    }

    class Node {
        private int value;
        private Node link;
    }
}
