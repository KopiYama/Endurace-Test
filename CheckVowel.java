import java.util.Scanner;

public class CheckVowel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input karakter
        char karakter = scanner.next().charAt(0);

        // Memanggil fungsi untuk mengecek apakah karakter vokal atau bukan
        boolean isVowel = checkVowel(karakter);

        // Cetak hasil
        System.out.println(isVowel);
    }

    // Fungsi untuk mengecek apakah karakter vokal atau bukan
    public static boolean checkVowel(char c) {
        // Mengubah karakter menjadi huruf kecil untuk memudahkan pengecekan
        c = Character.toLowerCase(c);

        // Mengecek apakah karakter merupakan huruf vokal
        if (c == 'a' || c == 'i' || c == 'u' || c == 'e' || c == 'o') {
            return true;
        } else {
            return false;
        }
    }
}
