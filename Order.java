package TUGAS_PBO;

import java.util.Scanner;

public class Order {
    private static Scanner scanner = new Scanner(System.in);

    public static void menuOrder() {
        System.out.println("=========== Menu Order ==========");
        System.out.println("1. Lihat Menu");
        System.out.println("2. Logout");
        System.out.println("===============================");
    }

    public static void viewMenu() {
        System.out.println("=========== Menu Restoran ==========");
        System.out.println("1. Pizza Margherita");
        System.out.println("2. Pizza Pepperoni");
        System.out.println("3. Pizza Hawaiian");
        System.out.println("4. Pizza Supreme");
        System.out.println("5. Pizza Vegetarian");
        System.out.println("6. Pizza BBQ Chicken");
        System.out.println("7. Pizza Meat Lovers");
        System.out.println("8. Pizza Four Cheese");
        System.out.println("9. Pizza Seafood");
        System.out.println("10. Pizza Capricciosa");
        System.out.println("===================================");     
        scanner.close();   
    }

}
