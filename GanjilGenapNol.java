import java.util.Scanner;

public class GanjilGenapNol {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan
        int X = scanner.nextInt();

        // Memanggil fungsi untuk menentukan jenis bilangan
        String jenisBilangan = checkNumber(X);

        // Cetak jenis bilangan
        System.out.println(jenisBilangan);
    }

    // Fungsi untuk menentukan jenis bilangan
    public static String checkNumber(int num) {
        if (num == 0) {
            return "nol";
        } else if (num % 2 == 0) {
            return "genap";
        } else {
            return "ganjil";
        }
    }
}
