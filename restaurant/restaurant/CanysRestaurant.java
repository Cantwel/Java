package restaurant;

import java.util.ArrayList;
import java.util.Scanner;

public class CanysRestaurant {

    //ArrayList of MenuItem objects
    private static final ArrayList<MenuItem> menuItems = new ArrayList<>();

    //Scanner object
    private static final Scanner scanner = new Scanner(System.in);

    
    // class representing a menu item
    private static class MenuItem {
        private final String name;
        private final double price;

        // using constructor
        public MenuItem(String name, double price) {
            this.name = name;
            this.price = price;
        }

        public String getName() {
            return name;
        }

        public double getPrice() {
            return price;
        }

    }


    // get an item from the menu
    private static MenuItem findMenuItem(String name) {
        for (MenuItem item : menuItems) {
            if (item.getName().equalsIgnoreCase(name)) {
                return item;
            }
        }
        return null; // item not found
    }

    // Method to view the current menu items
    private static void viewMenu() {
        System.out.println("Cany's Restaurant Menu:");
        for (MenuItem item : menuItems) {
            System.out.println(item.getName() + " - Ksh. " + item.getPrice());
        }
    }

    // Method to add a new item to the menu
    private static void addItemToMenu() {
        System.out.print("Enter food item name: ");
        String itemName = scanner.nextLine();
        System.out.print("Enter food item price: ");
        double itemPrice = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character

        MenuItem newItem = new MenuItem(itemName, itemPrice);
        menuItems.add(newItem);
        System.out.println(itemName + "has been added to our menu!");
    }

    // Method to allow customer to order food and drink
    private static void orderFoodAndDrink() {
        ArrayList<MenuItem> order = new ArrayList<>();
        double totalCost = 0;
        boolean addingItems = true;

        while (addingItems) {
            System.out.print("Enter food item name (or type '0' to finish order): ");
            String itemName = scanner.nextLine();

            if (itemName.equals("0")) {
                addingItems = false;
            } else {
                MenuItem item = findMenuItem(itemName);
                if (item == null) {
                    System.out.println("Sorry, food item not found.");
                } else {
                    order.add(item);
                    totalCost += item.getPrice();
                }
            }
        }

        System.out.println("Order summary (Generated automatically):");
        for (MenuItem item : order) {
            System.out.println(item.getName() + " - Ksh. " + item.getPrice());
        }
        System.out.println("Total cost: Ksh. " + totalCost);

        System.out.print("Enter payment amount through mobile money: Ksh. ");
        double paymentAmount = scanner.nextDouble();
        scanner.nextLine(); // consume the newline character

        if (paymentAmount < totalCost) {
            System.out.println("Payment amount is less than total cost, order cancelled.");
        } else {
            System.out.println("Payment received, thank you for your order at Cany's Restaurant!");
        }
    }

    public static void main(String[] args) {

        // Creating the initial menu with 4 items
        menuItems.add(new MenuItem("Fried Fish", 400.00));
        menuItems.add(new MenuItem("Rice Beans", 150.00));
        menuItems.add(new MenuItem("Chicken Ugali", 650.00));
        menuItems.add(new MenuItem("Soda Chips", 250.00));

        // bool to check if program is running
        boolean running = true;
        while (running) {
            System.out.println("\nWelcome to Cany's Restaurant! Please select a service:");
            System.out.println("1. View menu");
            System.out.println("2. Order food and drink");
            System.out.println("3. Add item to menu (Cheffs only)");
            System.out.println("4. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    viewMenu();
                case 2:
                    orderFoodAndDrink();
                case 3:
                    addItemToMenu();
                case 4:
                    running = false; // stop program
                default:
                    System.out.println(
                            "Invalid choice, please try again by typing an option represented by a numbers 1 to 4.");
            }
        }

        System.out.println("Thank you for visiting Cany's Restaurant!");
    }
}