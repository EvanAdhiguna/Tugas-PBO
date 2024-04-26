package TUGAS_PBO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String username, password;
        int menuResto;
        int menuOrder;
        Scanner scanner = new Scanner(System.in);
        Login user1 = new Login();
        boolean loggedIn = false;

        while (!loggedIn) {
            System.out.println("=========== Login ==========");
            System.out.print("|| Masukkan username : ");
            username = scanner.next();
            System.out.print("|| Masukkan password : ");
            password = scanner.next();
            System.out.println("============================");

            if ((username.equals(user1.getUsernameUser()) && password.equals(user1.getPasswordUser())) ||
                    (username.equals(user1.getUsernameAdmin1()) && password.equals(user1.getPasswordAdmin1())) ||
                    (username.equals(user1.getUsernameAdmin2()) && password.equals(user1.getPasswordAdmin2()))) {
                int repeat;
                loggedIn = true;
                if (username.equals(user1.getUsernameUser())) {
                    do {
                        Order.menuOrder();

                        System.out.print("Masukkan opsi yang Anda inginkan ? ");
                        menuOrder = scanner.nextInt();
                        switch (menuOrder) {
                            case 1:
                                Order.viewMenu();
                                break;
                            case 2:
                                loggedIn = false;
                                break;
                        }
                        String message = (loggedIn == false) ? "===========================\n Apakah Anda ingin kembali ke halaman login ?\n1. Ya\n2. Tidak\nPilihan Anda: " : "===========================\n" + //
                                                        "Apakah Anda ingin memilih menu lain?\n1. Tidak\n2. Ya\nPilihan Anda: ";
                            System.out.print(message);
                            repeat = scanner.nextInt();
                        } while (repeat == 2);
                    } else if (username.equals(user1.getUsernameAdmin1()) || username.equals(user1.getUsernameAdmin2())) {
                        do {
                            Admin.menuAdmin();
                            System.out.print("Masukkan opsi yang Anda inginkan : ");
                            menuResto = scanner.nextInt();

                            switch (menuResto) {
                                case 1:
                                    Admin.viewRestaurant();
                                    break;
                                case 2:
                                    Admin.addRestaurant();
                                    break;
                                case 3:
                                    Admin.removeRestaurant();
                                    break;
                                case 4:
                                    loggedIn = false;
                                    break;
                            }
                            String message = (loggedIn == false) ? "===========================\n Apakah Anda ingin kembali ke halaman login ?\n1. Ya\n2. Tidak\nPilihan Anda: " : "===========================\n" + //
                            "Apakah Anda ingin memilih menu lain?\n1. Tidak\n2. Ya\nPilihan Anda: ";
                            System.out.print(message);
                            repeat = scanner.nextInt();
                        } while (repeat == 2);
                    }
                } else {
                    System.out.println("* Username/Password salah!*");
                }
            }
            scanner.close();   
        }
    }
