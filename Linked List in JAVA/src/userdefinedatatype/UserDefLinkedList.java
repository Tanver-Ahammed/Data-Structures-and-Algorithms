package userdefinedatatype;

public class UserDefLinkedList {
    private Node head;

    public Node getHead() {
        return head;
    }

    // it is constructor to using create a LinkedList and first node of Linked List
    public UserDefLinkedList(Student student) {
        head = new Node();
        head.setStudent(student);
        head.setLink(null);
    }

    // insert first in the LinkedList
    public void insertFirst(Student student) {
        // crate a Node
        Node node = new Node();
        node.setStudent(student);
        node.setLink(head);

        head = node;
        System.out.println("Insert First the Property successfully!!");
    }

    // insert last int the LinkedList
    public void insertLast(Student student) {
        // create a Node
        Node node = new Node();
        node.setStudent(student);
        node.setLink(null);

        Node new_node = head;
        while (new_node.getLink() != null) {
            new_node = new_node.getLink();
        }

        new_node.setLink(node);
        System.out.println("Insert Last the Property successfully!!");
    }

    // delete any student in the LinkedList
    public void deleteStudent(Student studentId) {
        // the student is first Node in the LinkedList

        if (head.getStudent().getStudentId().equals(studentId.getStudentId())) {
            head = head.getLink();
            System.out.println("Delete the Property successfully!!");
        }

        // if the student is not situated first Node
        else {
            Node first = head;
            Node second = head.getLink();

            while ((second != null) && !(second.getStudent().getStudentId().equals(studentId.getStudentId()))) {
                first = second;
                second = second.getLink();
            }


            if (second != null) {
                first.setLink(second.getLink());
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
            System.out.println(node.getStudent());
            node = node.getLink();
        }
        System.out.println();
    }
}
