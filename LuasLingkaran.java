import java.util.Scanner;

public class LuasLingkaran {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jari-jari lingkaran
        double jariJari = scanner.nextDouble();

        // Memanggil fungsi untuk menghitung luas lingkaran
        double luas = hitungLuasLingkaran(jariJari);

        // Cetak hasil dengan dua angka di belakang koma
        System.out.printf("%.2f\n", luas);
    }

    // Fungsi untuk menghitung luas lingkaran
    public static double hitungLuasLingkaran(double jariJari) {
        double pi = 3.14;
        double luas = pi * jariJari * jariJari;
        return luas;
    }
}
