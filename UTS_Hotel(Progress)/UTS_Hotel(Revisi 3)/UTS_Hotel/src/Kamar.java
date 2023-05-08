public class Kamar {
    private static int economyReserved = 0;
    private static int bussinessReserved = 0;
    private static int suiteReserved = 0;

    public static void incrementEconomyReserved() {
        economyReserved++;
    }

    public static void incrementBussinessReserved() {
        bussinessReserved++;
    }

    public static void incrementSuiteReserved() {
        suiteReserved++;
    }

    public static void displayReservedRooms() {
        System.out.println("Jumlah kamar yang terpesan:");
        System.out.println("Ekonomi: " + economyReserved);
        System.out.println("Bisnis: " + bussinessReserved);
        System.out.println("Suite: " + suiteReserved);
    }
}
