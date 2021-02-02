package userdefinedatatype;

import java.util.Scanner;

public class MainUserDefine {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("This is a Linked List Program.\nIt has two data Id And Name.");

        Student student = new Student("IT-19016", "Md. Tanver Ahammed");
//        System.out.println(student.toString());

        UserDefLinkedList linkedList = new UserDefLinkedList(student);

        while (true) {
            System.out.println("\n(1) Insert First\n" +
                    "(2) Insert Last\n" +
                    "(3) Delete\n" +
                    "(4) Print All\n");
            System.out.print("Choice: ");
            String choice = scanner.next();

            switch (choice) {

                case "1": {
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.next();
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    if (studentName.isEmpty())
                        studentName = scanner.nextLine();

                    Student studentInsertFirst = new Student(studentId, studentName);
                    linkedList.insertFirst(studentInsertFirst);
                    break;
                }

                case "2": {
                    System.out.print("Enter Student ID: ");
                    String studentId = scanner.next();
                    System.out.print("Enter Student Name: ");
                    String studentName = scanner.nextLine();
                    if (studentName.isEmpty())
                        studentName = scanner.nextLine();

                    Student studentInsertLast = new Student(studentId, studentName);
                    linkedList.insertLast(studentInsertLast);
                    break;
                }

                case "3": {
                    System.out.print("Enter Delete Student ID: ");
                    Student studentDelete = new Student(scanner.next());
                    linkedList.deleteStudent(studentDelete);
                    break;
                }

                case "4": {
                    System.out.println("All The Elements:\n");
                    linkedList.printAll();
                    break;
                }

                default:
                    System.out.println("Your choice is wrong!!");
            }
        }

    }
}

