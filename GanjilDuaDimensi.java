import java.util.Scanner;

public class GanjilDuaDimensi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Inisialisasi array dua dimensi 4x4
        int[][] X = new int[4][4];

        // Input elemen-elemen array X
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                X[i][j] = scanner.nextInt();
            }
        }

        // Memanggil fungsi untuk menghitung jumlah bilangan ganjil
        int count = countOdd(X);

        // Cetak hasil
        System.out.println(count);
    }

    // Fungsi untuk menghitung jumlah bilangan ganjil pada array 2 dimensi
    public static int countOdd(int[][] arr) {
        int count = 0;

        // Iterasi untuk setiap elemen array
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                // Jika elemen adalah bilangan ganjil, tambahkan ke count
                if (arr[i][j] % 2 != 0) {
                    count++;
                }
            }
        }

        return count;
    }
}