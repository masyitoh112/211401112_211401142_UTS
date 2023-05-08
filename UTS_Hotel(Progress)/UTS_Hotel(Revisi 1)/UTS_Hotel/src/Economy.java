import java.util.Scanner;

public class Economy {
    public static float harga;

    public void Show() {
        System.out.println("Ini Tipe Kamar Ekonomi");
    }

    int[] biayaSewa = {125000, 175000, 250000};

    public void Menu() {
        Scanner input = new Scanner(System.in);
        Receipt receipt = new Receipt();

        System.out.println(
                "Pilih Kelas Kamar" +
                        "\n1. Kamar Untuk 1 Orang Rp " + biayaSewa[0] +
                        "\n2. Kamar Untuk 2 Orang Rp " + biayaSewa[1] +
                        "\n3. Kamar Untuk 2 Orang + 1 Anak Kecil (Rp " + biayaSewa[2] +
                        "\n4. Kembali");

        System.out.print("\nPilih:");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                System.out.print("Berapa hari menginap: ");
                int hari = input.nextInt();
                harga += (biayaSewa[0] * hari);
                receipt.showReceiptEconomy(harga, hari);
                break;
            case 2:
                System.out.print("Berapa hari menginap: ");
                hari = input.nextInt();
                harga += (biayaSewa[1] * hari);
                receipt.showReceiptEconomy(harga, hari);
                break;
            case 3:
                System.out.print("Berapa hari menginap: ");
                hari = input.nextInt();
                harga += (biayaSewa[2] * hari);
                receipt.showReceiptEconomy(harga, hari);
                break;
            case 4:
                new Reservation();
                break;
            default:
                System.out.print("Pilihan Salah!");
                Menu();
                break;
        }
    }
}
