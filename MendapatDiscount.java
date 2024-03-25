import java.util.Scanner;

public class MendapatDiscount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input harga barang dan jumlah barang
        double hargaBarang = scanner.nextDouble();
        int jumlahBarang = scanner.nextInt();

        // Memanggil fungsi untuk menghitung total harga dengan potongan
        double totalHarga = hitungTotalHarga(hargaBarang, jumlahBarang);

        // Cetak total harga dengan dua angka di belakang koma
        System.out.printf("%.2f\n", totalHarga);
    }

    // Fungsi untuk menghitung total harga dengan potongan
    public static double hitungTotalHarga(double hargaBarang, int jumlahBarang) {
        // Total harga awal
        double totalHarga = hargaBarang * jumlahBarang;

        // Jika jumlah barang adalah kelipatan 3 dan 4, berikan potongan 15%
        if (jumlahBarang % 3 == 0 && jumlahBarang % 4 == 0) {
            double potongan = 0.15 * totalHarga;
            totalHarga -= potongan;
        }

        return totalHarga;
    }
}
