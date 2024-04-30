package TUGAS_PBO;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Admin {
    static HashMap<String, Restaurant> restaurantList = new HashMap<>();
    public static ArrayList<Order> orders = new ArrayList<>();

    private static Scanner scanner = new Scanner(System.in);

    public static void menuAdmin() {
        System.out.println("=========== Admin Menu ==========");
        System.out.println("1. Lihat Daftar Restoran");
        System.out.println("2. Tambah Restoran");
        System.out.println("3. Hapus Restoran");
        System.out.println("4. Login Ulang");
        System.out.println("5. Logout");
        System.out.println("===============================");
    }

    public static void viewRestaurant() {
        System.out.println("============= RESTAURANT =============");
        for(String namaRestaurant : restaurantList.keySet()){
            System.out.println("ID Restaurant : " + restaurantList.get(namaRestaurant).getId()
                    + " || Nama : " + namaRestaurant + " || Alamat : " +restaurantList.get(namaRestaurant).getAlamat());
            System.out.println("Menu : ");
            for (Menu menu : restaurantList.get(namaRestaurant).getMenus()){
                System.out.println(menu.getNama() + " || " +menu.getHarga());
            }
        }
    }

    public static void viewMenu(){
        System.out.println("==== RESTAURANT ====");
        for(String namarestaurant : restaurantList.keySet()) {
            System.out.println("Nama Restoran : " + namarestaurant + " || Alamat : " + restaurantList.get(namarestaurant).getAlamat());
        }
        System.out.print("Masukan nama restaurant : ");
        String pilih_restaurant = scanner.next();
        if(!restaurantList.containsKey(pilih_restaurant)){
            System.out.println("Menu tidak ada!");
        }
        Restaurant res = restaurantList.get(pilih_restaurant);
        Order newOrder = new Order(res);
        String menu = "";
        while(!menu.equals("2")){
            System.out.println("\n");
            System.out.println("==== Restaurant "+ res.getNama() + " ====");
            System.out.println("Menu : ");
            int nomorMenu = 1;
            for (Menu menu1 : res.getMenus()){
                System.out.println(nomorMenu + ". " + menu1.getNama() + " - " + menu1.getHarga());
                nomorMenu++;
            }
            System.out.print("Masukan nomor menu : ");
            int indexMenu = scanner.nextInt();
            System.out.print("Jumlah beli : ");
            int jumlah_beli = scanner.nextInt();
            scanner.nextLine();

            newOrder.addMenu(res.getMenus().get(indexMenu - 1), jumlah_beli);
            System.out.println("\n");
            System.out.print("Tambah menu lagi?  (1 = iya / 2 = tidak) : ");
            menu = scanner.next();
        }
        System.out.print("Masukan jarak pengantaran makanan (dalam km) : ");
        int jarak = scanner.nextInt();

        newOrder.setDistance(jarak);
        orders.add(newOrder);
        System.out.println("Order menu berhasil!");
        System.out.println("\n");
    }


    public static void viewOrder(){
        System.out.println("===== ORDERS =====");
        for(int i = 0; i<orders.size(); i++){
            Order order = orders.get(i);
            System.out.println((i+1) + ". " +order.getRestaurant().getNama());
            System.out.println("Menu : ");
            for(Menu menu : order.getMenus().keySet()){
                System.out.println("- " +menu.getNama() + " , Harga/satuan : "+ menu.getHarga() + " || [" + order.getMenus().get(menu) + " Porsi]");
            }
            System.out.println("- Ongkir 1.000/km || Jarak : "+order.getDistance()+" km");
            System.out.println("- Total Bayar : "+order.getTotalPrice());
        }
    }

    public static void addRestaurant() {
        System.out.print("Masukan Id Restaurant : ");
        int id = scanner.nextInt();

        System.out.print("Masukan Nama Restaurant : ");
        String nama = scanner.next();

        System.out.print("Masukan Alamat Restaurant : ");
        String alamat = scanner.next();
        Restaurant restaurant = new Restaurant(id, nama, alamat);

        String inputMenu = "";
        while (!inputMenu.equals("selesai")){
            System.out.print("Masukan menu (format: Nama menu|Harga menu) enter, lalu ketik \"selesai\" untuk selesai: ");
            inputMenu = scanner.next();
            if(!inputMenu.equals("selesai")){
                String[] menuData = inputMenu.split("\\|");
                restaurant.setMenus(new Menu(menuData[0], Integer.parseInt(menuData[1])));
            }
        }
        restaurantList.put(nama,restaurant);
        System.out.println("Tambah restaurant berhasil!");
        System.out.println("\n");
    }

    public static void removeRestaurant() {
        System.out.println("==== RESTAURANT ====");
        for (String namaRestaurant : restaurantList.keySet()) {
            System.out.println("ID Restaurant : " + restaurantList.get(namaRestaurant).getId()
                    + " || Nama : " + namaRestaurant + " || Alamat : " + restaurantList.get(namaRestaurant).getAlamat());
        }
        System.out.println("==============================");
        System.out.print("Masukan nama restaurant : ");
        String namaRestaurant = scanner.next();
        if (restaurantList.containsKey(namaRestaurant)) {
            restaurantList.remove(namaRestaurant);
            System.out.println("Restaurant berhasil di hapus!");
        } else {
            System.out.println("Restaurant tidak ditemukan!");
        }
    }
}
