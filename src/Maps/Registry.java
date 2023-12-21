package src.Maps;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicInteger;

public class Registry {

    private Map<String, Integer> kit;
    private Scanner scanner;

    public Registry() {
        this.kit = new HashMap<>();
        this.scanner = new Scanner(System.in);
    }

    public void create() {
        createAndPopulateList();
        printInitialKit();
    }

    private void createAndPopulateList() {
        try {
            System.out.print("Enter the total number of goods: ");
            int numberOfProducts = scanner.nextInt();
            scanner.nextLine();

            for (int i = 0; i < numberOfProducts; i++) {
                System.out.print("Enter the name of the product: ");
                String productName = scanner.nextLine();
                System.out.print("Enter the quantity of the product " + productName + ": ");
                try {
                    int quantity = scanner.nextInt();
                    scanner.nextLine();
                    kit.put(productName, quantity);
                } catch (InputMismatchException ex) {
                    System.out.println("Invalid input. Please enter a valid quantity as a number");
                    scanner.nextLine();
                    i--;
                }
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number for the total quantity of goods.");
        }
    }

    private void printInitialKit() {
        printKit();
    }

    AtomicInteger counter = new AtomicInteger(1);

    private void printKit() {
        for (Map.Entry<String, Integer> entry : kit.entrySet()) {
            System.out.println(counter.getAndIncrement() + ") " + entry.getKey() + ": " + entry.getValue() + " units");

        }
        System.out.println();
    }
}






