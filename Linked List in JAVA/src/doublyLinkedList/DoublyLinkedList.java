package doublyLinkedList;

public class DoublyLinkedList {
    private Node head;

    // create a new Node using constructor
    public DoublyLinkedList(int item) {
        head = new Node();

        head.setPrev(null);
        head.setValue(item);
        head.setNext(null);
    }

    // insert first in the LinkedList
    public void insertFirst(int item) {
        Node node = new Node();
        node.setPrev(null);
        node.setValue(item);
        node.setNext(head);

        head.setPrev(node);

        head = node;
        System.out.println("Insert First the Property successfully!!");
    }

    // insert last int the LinkedList
    public void insertLast(int item) {
        Node node = new Node();

        Node new_node = head;
        while(new_node.getNext() != null) {
            new_node = new_node.getNext();
        }

        new_node.setNext(node);
        node.setPrev(new_node);

        node.setValue(item);
        node.setNext(null);

        System.out.println("Insert Last the Property successfully!!");

    }

    // delete any item in the LinkedList
    public void delete(int item) {
        // the student is first Node in the LinkedList

        if (head.getValue() == item) {
            head = head.getNext();
            System.out.println("Delete the Property successfully!!");
        }

        // if the student is not situated first Node
        else {
            Node first = head;
            Node second = head.getNext();

            while ((second != null) && !(second.getValue() == item)) {
                first = second;
                second = second.getNext();
            }


            if (second != null) {
                first.setNext(second.getNext());
                System.out.println("Delete the Property successfully!!");
            }
            else
                System.out.println("Your Property is not Found!!");
        }
    }

    // print all te node or element in the LinkedList
    public void printAll() {
        Node node = head;
        while (node != null) {
            System.out.println(node.getValue());
            node = node.getNext();
        }
    }

}
