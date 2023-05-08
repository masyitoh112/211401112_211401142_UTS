import java.util.Scanner;

public class Reservation {
    private static int MAX_ECONOMY_ROOMS = 10;
    private static int MAX_BUSSINESS_ROOMS = 5;
    private static int MAX_SUITE_ROOMS = 3;
    private static int economyCount = 0;
    private static int bussinessCount = 0;
    private static int suiteCount = 0;
    private Scanner input = new Scanner(System.in);
    private Kamar kamar = new Kamar();

    public Reservation() {
        System.out.println("Order Selected!");
        System.out.println("Silakan Pilih Menu:\n1. Economy\n2. Bussiness\n3. Suite\n4. Kembali\nPilih: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                if (economyCount < MAX_ECONOMY_ROOMS) {
                    Economy economy = new Economy();
                    economy.incrementCount();
                    economy.Show();
                    economy.Menu();
                    economyCount++;
                    kamar.incrementEconomyReserved();
                } else {
                    System.out.println("Maaf, kamar ekonomi sudah penuh.");
                }
                break;
            case 2:
                if (bussinessCount < MAX_BUSSINESS_ROOMS) {
                    Bussiness bussiness = new Bussiness();
                    bussiness.incrementCount();
                    bussiness.Show();
                    bussiness.Menu();
                    bussinessCount++;
                    kamar.incrementBussinessReserved();
                } else {
                    System.out.println("Maaf, kamar bisnis sudah penuh.");
                }
                break;
            case 3:
                if (suiteCount < MAX_SUITE_ROOMS) {
                    Suite suite = new Suite();
                    suite.incrementCount();
                    suite.Show();
                    suite.Menu();
                    suiteCount++;
                    kamar.incrementSuiteReserved();
                } else {
                    System.out.println("Maaf, kamar suite sudah penuh.");
                }
                break;
            case 4:
                Main.Menu();
                break;
            default:
                System.out.println("Pilihan tidak valid!");
                break;
        }
    }
}
