package Modul3.Tugas2;

import Modul2.Tugas3.After.ListDiamond;
import Modul2.Tugas3.Before.Player;
import Modul2.Tugas3.Before.TopUp;

import java.util.Scanner;

/**
 * class utama untuk menjalankan program
 */
public class MainApp {
    /**
     * deklarasi haarga perjumlah diamond dan saldo awal
     */
    public static final int DIAMOND_86 = 20000; //Refactor 3
    public static final int DIAMOND_170 = 38000; //Refactor 3
    public static final int DIAMOND_257 = 55000; //Refactor 3
    public static final int DIAMOND_706 = 150000; //Refactor 3
    public static final int SALDO_AWAL = 1000000000; //Refactor 3

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        /**
         * menampilkan output untuk mengisi player id, server, dan nickname
         */
        System.out.println("=== MOBILE LEGENDS TOP-UP CENTER ===");

        System.out.print("Enter Player ID: ");
        long id = sc.nextLong();

        System.out.print("Enter Server ID: ");
        int server = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Nickname: ");
        String nickname = sc.nextLine();

        /**
         * membuat objek player
         * menampilkan pesan akun sudah dibuat
         * memanggil method untuk menampilkan profil akun
         */
        Player player = new Player(id, server, nickname, SALDO_AWAL); //Refactor 3
        System.out.println("\nAccount created successfully!");
        player.showProfile();

        /**
         * memanggil method untuk menampilkan list diamond dan harga
         */
        ListDiamond.showMenu(); //Refactor 5

        /**
         * menampilkan untuk mengisi pilihan diamond mana yang mau dipilih
         */
        System.out.print("Enter your choice: ");
        int menuChoice = sc.nextInt(); //Refactor 2

        TopUp selectedTopup = null; //Refactor 2

        /**
         * memanggil method untuk memproses topup
         */
        ProccessTopUp(menuChoice, selectedTopup, player); //Refactor 6

        /**
         * menampilkan pesan terimakasih telah menggunakan program
         */
        System.out.println("\n=== THANK YOU FOR USING MLBB TOP-UP SERVICE ===");
        sc.close();
    }

    /**
     * switch case untuk proses pemilihan dari list list diamond
     * if else untuk apabila saldo leih banyak dari harga akan memproses topup, dan apabila harga lebih mahal dari saldo akan menampilkan pesan
     * @param menuChoice
     * @param selectedTopup
     * @param player
     */
    private static void ProccessTopUp(int menuChoice, TopUp selectedTopup, Player player) {
        switch (menuChoice) {
            case 1 -> selectedTopup = new TopUp("86 Diamonds", DIAMOND_86); //Refactor 3
            case 2 -> selectedTopup = new TopUp("170 Diamonds", DIAMOND_170); //Refactor 3
            case 3 -> selectedTopup = new TopUp("257 Diamonds", DIAMOND_257); //Refactor 3
            case 4 -> selectedTopup = new TopUp("706 Diamonds", DIAMOND_706); //Refactor 3
            default -> System.out.println("Invalid choice!");
        }

        if (selectedTopup != null) {
            if (player.getBalance() >= selectedTopup.getPrice()) {
                selectedTopup.processTopUp(player);
            } else {
                System.out.println("\n❌ Insufficient balance!");
            }
        }
    }
}