package Modul3.Tugas2;


/**
 * Kelas ini merepresentasikan data pengguna secara umum
 * kelas ini merupakan parent dari class player
 */
public class User {
    /**
     * id pemain
     */
    private long id; //Refactor 4
    /**
     * user id pembeli
     */
    private int server; //Refactor 4

    public User(long id, int server) {
        this.setId(id);
        this.setServer(server);
    }

    /**
     * menampilkan profil akun mobile legend pembeli
     */
    public void showProfile() {
        System.out.println("=== PLAYER INFO ===");
        System.out.println("ID      : " + getId());
        System.out.println("Server  : " + getServer());
    }

    public long getId() { //Refactor 4
        return id;
    }

    public void setId(long id) { //Refactor 4
        this.id = id;
    }

    public int getServer() { //Refactor 4
        return server;
    }

    public void setServer(int server) { //Refactor 4
        this.server = server;
    }
}
