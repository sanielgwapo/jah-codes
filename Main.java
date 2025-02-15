import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

       
        ArrayList<Integer> arrayList = new ArrayList<>();
        LinkedList<Integer> linkedList = new LinkedList<>();

        while (true) {
            
            System.out.print("Enter a number: ");
            if (!scanner.hasNextInt()) {
                System.out.println("Invalid number. Please enter a valid number.");
                scanner.next(); 
                continue;
            }
            int number = scanner.nextInt();

            
            System.out.println("[1] Insert to Array List");
            System.out.println("[2] Insert to Linked List");
            System.out.print("User Input: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Please enter [1] or [2].");
                scanner.next(); 
                continue;
            }
            int choice = scanner.nextInt();

           
            if (choice == 1) {
                arrayList.add(number);
                System.out.println("Array list after insertion: " + arrayList);
            } else if (choice == 2) {
                linkedList.add(number);
                System.out.print("Linked list after insertion: ");
                for (int num : linkedList) {
                    System.out.print(num + " -> ");
                }
                System.out.println("null");
            } else {
                System.out.println("Invalid choice. Please enter [1] or [2].");
                continue;
            }

            
            System.out.println("[1] Enter new number");
            System.out.println("[2] End");
            System.out.print("Option: ");

            String proceed = scanner.next();

            if (proceed.equals("2")) {
                System.out.println("Program ended.");
                break;
            } else if (!proceed.equals("1")) {
                System.out.println("Invalid input. Please enter [1] or [2].");
            }
        }

        scanner.close();
    }
}