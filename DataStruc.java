import java.util.Scanner;

class Node {
    int data;
    Node next;
    
    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class DataStruc {
    static Scanner scanner = new Scanner(System.in);
    static int[] array = new int[100];
    static int arraySize = 0;
    static Node head = null;
    
    // Function to insert into array
    static void insertArray(int num) {
        // Shift elements right
        for(int i = arraySize; i > 0; i--) {
            array[i] = array[i-1];
        }
        array[0] = num;
        arraySize++;
    }
    
    // Function to display array
    static void displayArray() {
        System.out.print("Array after insertion : [");
        for(int i = 0; i < arraySize; i++) {
            System.out.print(array[i]);
            if(i < arraySize - 1) System.out.print(" ");
        }
        System.out.println("]");
    }
    
    // Function to insert into linked list
    static void insertLinkedList(int num, int position) {
        Node newNode = new Node(num);
        
        if(position == 1) { // Insert at beginning
            newNode.next = head;
            head = newNode;
        } else { // Insert at end
            if(head == null) {
                head = newNode;
            } else {
                Node current = head;
                while(current.next != null) {
                    current = current.next;
                }
                current.next = newNode;
            }
        }
    }
    
    // Function to display linked list
    static void displayLinkedList() {
        System.out.print("Linked list after insertion: ");
        Node current = head;
        while(current != null) {
            System.out.print(current.data);
            if(current.next != null) System.out.print("→");
            current = current.next;
        }
        System.out.println("→null");
    }
    
    public static void main(String[] args) {
        while(true) {
            System.out.println("Enter number: ");
            int num = scanner.nextInt();
            
            System.out.println("options:");
            System.out.println("[1] insert to Array");
            System.out.println("[2] insert to LinkedList");
            System.out.print("Choice: ");
            int choice = scanner.nextInt();
            
            if(choice == 1) {
                insertArray(num);
                displayArray();
            }
            else if(choice == 2) {
                System.out.println("[1] Insert at Beginning");
                System.out.println("[2] Insert at End");
                System.out.print("Choice: ");
                int position = scanner.nextInt();
                
                insertLinkedList(num, position);
                displayLinkedList();
            }
            
            System.out.print("Proceed? [yes/no]: ");
            String proceed = scanner.next();
            if(proceed.equalsIgnoreCase("no")) {
                System.out.println("// terminate program");
                break;
            }
            System.out.println(); // Add blank line for spacing
        }
        
        scanner.close();
    }
}