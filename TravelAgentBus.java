import java.util.Scanner;

public class TravelAgentBus {
    public static void main(String[] args) {

        Bus[] listBus = {
                new Bus(60, 2300000),
                new Bus(45, 2000000),
                new Bus(32, 1800000),
                new Bus(18, 1500000),
                new Bus(12, 1300000)
        };

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int hargaTermurah = Integer.MAX_VALUE;

        for (Bus bus : listBus) {
            if (n <= bus.getKursi()) {
                if (bus.getHarga() < hargaTermurah) {
                    hargaTermurah = bus.getHarga();
                }
            } else {
                int sisaPenumpang = n - bus.getKursi();
                for (Bus busLain : listBus) {
                    if (sisaPenumpang <= busLain.getKursi()) {
                        int hargaTotal = bus.getHarga() + busLain.getHarga();
                        if (hargaTotal < hargaTermurah) {
                            hargaTermurah = hargaTotal;
                        }
                    }
                }
            }
        }

        System.out.println(hargaTermurah);

        scanner.close();
    }
}

class Bus {
    private int kursi;
    private int harga;

    public Bus(int kursi, int harga) {
        this.kursi = kursi;
        this.harga = harga;
    }

    public int getKursi() {
        return kursi;
    }

    public int getHarga() {
        return harga;
    }
}