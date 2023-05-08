import java.util.Scanner;
public class Main {
    static Scanner input = new Scanner(System.in);  // Create a Scanner object
    static int jumlahPengunjung=0;
    public static void Menu(){
        System.out.println("***************************************************");
        System.out.println("*         Selamat Datang di JW Marriott           *");
        System.out.println("*    Hotel Mewah dengan Pelayanan Terbaik di Kota *");
        System.out.println("***************************************************");
        System.out.print("Silakan Pilh Menu:\n1. Reservasi\n2. Kamar yang tersedia\n3. Perhitungan Hari ini \n4. Keuntungan \nPilih: ");
        int pilihan = input.nextInt();

        switch (pilihan){
            case 1:
                jumlahPengunjung++;
                new Reservation();
                break;
            case 2:
                Kamar kamar = new Kamar();
                kamar.displayReservedRooms();
                break;
            case 3: new Inspect();
                break;
            case 4: new Show();
                break;
            default:
                break;
        }
    }
    public static void main(String[] args) {

        Menu();
    }
}