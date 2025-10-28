package Modul3.Tugas2;

import Modul2.Tugas3.Before.Player;

public class TopUp {
    /**
     * package diamond yang dijual
     */
    private String diamondPackage;
    /**
     * harga diamond
     */
    private double price;

    public TopUp(String diamondPackage, double price) {
        this.diamondPackage = diamondPackage;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public String getDiamondPackage() {
        return diamondPackage;
    }

    /**
     * proses top up
     * @param player
     */
    public void processTopUp(Player player) {
        printProcessing(); //Refactor 1
        deductBalance(player); //Refactor 1
        printSucces(player); //Refactor 1
    }

    /**
     * top up succes
     * @param player
     */
    private void printSucces(Player player) {
        System.out.println("✅ Top-Up Success!");
        System.out.println(diamondPackage + " added to player: " + player.getNickname());
        System.out.println("Remaining Balance: Rp " + player.getBalance());
    }

    /**
     * total saldo adalah (saldo - harga)
     * @param player
     */
    private void deductBalance(Player player) {
        player.addBalance(-price);
    }

    /**
     * tampilkan process top up
     */
    private static void printProcessing() {
        System.out.println("\nProcessing Top-Up...");
    }
}