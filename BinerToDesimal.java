import java.util.Scanner;

public class BinerToDesimal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan biner
        String bilanganBiner = scanner.nextLine();

        // Memanggil fungsi untuk mengonversi ke desimal
        int bilanganDesimal = binerToDesimal(bilanganBiner);

        // Cetak hasil konversi
        System.out.println(bilanganDesimal);
    }

    // Fungsi untuk mengonversi bilangan biner ke desimal
    public static int binerToDesimal(String biner) {
        int panjang = biner.length();
        int hasil = 0;
        int pangkat = 1; // pangkat 2^0

        for (int i = panjang - 1; i >= 0; i--) {
            if (biner.charAt(i) == '1') {
                hasil += pangkat;
            }
            pangkat *= 2;
        }

        return hasil;
    }
}
