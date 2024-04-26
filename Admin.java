package TUGAS_PBO;

import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private static ArrayList<String> restaurantList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void menuAdmin() {
        System.out.println("=========== Admin Menu ==========");
        System.out.println("1. Lihat Daftar Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Logout");
        System.out.println("===============================");
    }

    public static void viewRestaurant() {
        System.out.println("=========== Daftar Restoran ==========");
        for (String restaurant : restaurantList) {
            System.out.println(restaurant);
        }
        System.out.println("=====================================");
    }

    public static void addRestaurant() {
        System.out.print("Masukkan nama restoran yang ingin ditambahkan: ");
        String newRestaurant = scanner.next();
        restaurantList.add(newRestaurant);
        System.out.println("Restoran berhasil ditambahkan.");
    }

    public static void removeRestaurant() {
        System.out.print("Masukkan nama restoran yang ingin dihapus: ");
        String restaurantToRemove = scanner.next();
        if (restaurantList.contains(restaurantToRemove)) {
            restaurantList.remove(restaurantToRemove);
            System.out.println("Restoran berhasil dihapus.");
        } else {
            System.out.println("Restoran tidak ditemukan.");
        }
    }
}
