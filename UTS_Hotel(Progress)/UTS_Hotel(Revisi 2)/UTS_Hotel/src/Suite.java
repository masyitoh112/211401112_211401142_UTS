import java.util.Scanner;

public class Suite {
    public static float harga;

    public void Show() {
        System.out.println("Suite Menu");
    }

    int[] biayaSewa = new int[]{800000, 1300000, 1500000};

    public void Menu() {
        Scanner input = new Scanner(System.in);// Create a Scanner object
        Receipt receipt = new Receipt();

        System.out.println(
                "Pilih Kelas Kamar:" +
                        "\n1. Kamar 2 Orang + Sarapan " + biayaSewa[0] +
                        "\n2. Kamar 2 Orang + 1 Anak Kecil + Sarapan " + biayaSewa[1] +
                        "\n3. Kamar 2 Orang + 1 Anak Kecil + Sarapan + Late check out " + biayaSewa[2] +
                        "\n4. Kembali");

        System.out.print("\nPilih:");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.print("Berapa hari menginap: ");
                int hari = input.nextInt();
                harga += biayaSewa[0] * hari;
                receipt.showReceiptSuite(harga, hari);
                break;
            case 2:
                System.out.print("Berapa hari menginap: ");
                hari = input.nextInt();
                harga += biayaSewa[1] * hari;
                receipt.showReceiptSuite(harga, hari);
                break;
            case 3:
                System.out.print("Berapa hari menginap: ");
                hari = input.nextInt();
                harga += biayaSewa[2] * hari;
                receipt.showReceiptSuite(harga, hari);
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
