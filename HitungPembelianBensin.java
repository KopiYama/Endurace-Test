import java.util.Scanner;

public class HitungPembelianBensin {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Pilih jenis bensin:");
        System.out.println("1. Pertamax");
        System.out.println("2. Premium");
        int pilihan = scanner.nextInt();

        System.out.println("Masukkan jumlah liter bensin:");
        double jumlahLiter = scanner.nextDouble();

        double hargaBensin;
        if (pilihan == 1) {
            hargaBensin = 9000; // Harga Pertamax per liter
        } else if (pilihan == 2) {
            hargaBensin = 7600; // Harga Premium per liter
        } else {
            System.out.println("Pilihan tidak valid");
            return;
        }

        double totalHarga = hitungTotalHarga(hargaBensin, jumlahLiter);

        System.out.printf("%.2f\n", totalHarga);
    }

    public static double hitungTotalHarga(double hargaPerLiter, double jumlahLiter) {
        double totalHarga = hargaPerLiter * jumlahLiter;
        return totalHarga;
    }
}
