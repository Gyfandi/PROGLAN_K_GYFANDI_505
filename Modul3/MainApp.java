package Modul3;

public class MainApp {
    public static void main(String[] args) {
        int[] data = {64, 34, 25, 12, 22, 11, 90};

        System.out.println("Sebelum diurutkan:");
        for (int num : data) {
            System.out.print(num + " ");
        }

        BubbleSort.bubbleSort(data);

        System.out.println("\n\nSetelah diurutkan:");
        for (int num : data) {
            System.out.print(num + " ");
        }
    }
}
