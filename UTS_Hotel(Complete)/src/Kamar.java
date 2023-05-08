public class Kamar {
    private int economyReserved = 0;
    private int bussinessReserved = 0;
    private int suiteReserved = 0;

    public void incrementEconomyReserved() {
        economyReserved++;
    }

    public void incrementBussinessReserved() {
        bussinessReserved++;
    }

    public void incrementSuiteReserved() {
        suiteReserved++;
    }

    public void displayReservedRooms() {
        System.out.println("Jumlah kamar yang terpesan:");
        System.out.println("Ekonomi: " + economyReserved);
        System.out.println("Bisnis: " + bussinessReserved);
        System.out.println("Suite: " + suiteReserved);
    }
}
