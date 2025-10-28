package Modul3.Tugas2;

import Modul2.Tugas3.Before.User;

/**
 * kelas ini merepresantisakan data pengguna / pembeli diamond
 * kelas ini merupakan turunan dari kelas user
 */
public class Player extends User {
    /**
     * nickname player
     */
    private String nickname;
    /**
     * saldo player
     */
    private double balance;

    public Player(long id, int server, String nickname, double balance) {
        super(id, server);
        this.nickname = nickname;
        this.balance = balance;
    }

    public String getNickname() {
        return nickname;
    }

    public double getBalance() {
        return balance;
    }

    /**
     *
     * @param amount, balance ditambah yang hasilnya adalah amount
     */
    public void addBalance(double amount) {
        balance += amount;
    }

    /**
     * override dari class user, untuk menampilkan nama dan saldo player
     */
    @Override
    public void showProfile() {
        super.showProfile();
        System.out.println("Nickname: " + nickname);
        System.out.println("Balance : Rp " + balance);
    }
}