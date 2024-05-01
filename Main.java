package TUGAS_PBO;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
    
        String username, password;
        int menuResto;
        int menuOrder;

        Scanner scanner = new Scanner(System.in);
        Login user1 = new Login();
        Admin restaurant = new Admin();
        boolean loggedIn = false;


        while(loggedIn == false) {
            System.out.println("=========== Login ==========");
            System.out.print("| masukan username : ");username = scanner.next();
            System.out.print("| masukan password : ");password = scanner.next();
            System.out.println("============================");
            System.out.println("\n");

            if (username.equals(user1.getUsername_user()) && password.equals(user1.getPassword_user()) || username.equals(user1.getUsername_admin()) && password.equals(user1.getPassword_admin())) {
                int ulang;
                loggedIn = true;
                if (username.equals(user1.getUsername_user())) {
                    do {
                        System.out.println("======== MENU CUSTOMER ========");
                        System.out.println("| 1. Order Makanan/Minuman     ");
                        System.out.println("| 2. Lihat Pesanan             ");
                        System.out.println("| 3. Kembali ke Halaman Login  ");
                        System.out.println("| 4. Logout                    ");
                        System.out.println("===============================");
                        System.out.print("Masukan opsi yang anda inginkan ? ");
                        menuOrder = scanner.nextInt();
                        System.out.println("\n");
                        switch (menuOrder){
                            case 1:
                                restaurant.viewMenu();
                                break;
                            case 2:
                                restaurant.viewOrder();
                                break;
                            case 3:
                                loggedIn = false;
                                break;
                            case 4:
                                System.out.println("Anda berhasil logout!");
                                System.exit(0);
                                break;
                        }
                        String pesan = (loggedIn == false) ? "Login ulang ? (1 = Tidak/ 2 = Iya) : " : "Apakah anda ingin memilih menu lain? (1 = iya /2 = tidak) : ";
                        System.out.print(pesan);ulang= scanner.nextInt();
                    }while(ulang == 1);
                } else if (username.equals(user1.getUsername_admin())) {
                    do {
                        restaurant.menuAdmin();
                        System.out.print("Masukan opsi yang anda inginkan : ");
                        menuResto = scanner.nextInt();
                        System.out.println("\n");
                        switch (menuResto) {
                            case 1:
                                restaurant.viewRestaurant();
                                break;
                            case 2:
                                restaurant.addRestaurant();
                                break;
                            case 3:
                                restaurant.removeRestaurant();
                                break;
                            case 4:
                                loggedIn = false;
                                break;
                            case 5:
                                System.out.println("Anda berhasil logout!");
                                System.exit(0);
                                break;
                        }
                        String pesan = (loggedIn == false) ? "Login ulang ? (1 = Tidak/ 2 = Iya) : " : "Apakah anda ingin memilih menu lain? (1 = iya /2 = tidak) : ";
                        System.out.print(pesan);ulang= scanner.nextInt();
                    }while(ulang == 1);
                }

            }else{
                System.out.println("* Username/Password salah!*");
            }

        }
    }
}
