import java.util.Scanner;

public class PromoPujasera {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        double jumlahHarga = scanner.nextDouble();
        int tanggalLahir = scanner.nextInt();

        // Perhitungan promo
        double totalBayar = jumlahHarga;
        if (jumlahHarga >= 50000) {
            double potongan = 0.02 * tanggalLahir * jumlahHarga;
            totalBayar -= potongan;
        }

        // Output
        System.out.printf("%.2f", totalBayar);

        scanner.close();
    }
}
