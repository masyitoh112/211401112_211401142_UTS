import java.util.Scanner;

public class Reservation {
    Scanner input = new Scanner(System.in);

    public Reservation() {
        System.out.println("Order Selected!");
        System.out.println("Silakan Pilih Menu:\n1. Economy\n2. Bussiness\n3. Suite\n4. Kembali\nPilih: ");
        int pilihan = input.nextInt();
        switch (pilihan) {
            case 1:
                Economy economy = new Economy();
                economy.Show();
                economy.Menu();
                break;
            case 2:
                Bussiness bussiness = new Bussiness();
                bussiness.Show();
                bussiness.Menu();
                break;
            case 3:
                Suite suite = new Suite();
                suite.Show();
                suite.Menu();
                break;
            case 4:
                Main.Menu();
                break;
            default:
                break;
        }
    }
}
