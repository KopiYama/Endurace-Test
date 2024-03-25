import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SudokuBlock {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input elemen-elemen blok sudoku
        int[][] blokSudoku = new int[3][3];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                blokSudoku[i][j] = scanner.nextInt();
            }
        }

        // Memeriksa validitas blok sudoku
        String hasil = periksaValiditas(blokSudoku);

        // Cetak hasil
        System.out.println(hasil);
    }

    // Fungsi untuk memeriksa validitas blok sudoku
    public static String periksaValiditas(int[][] blokSudoku) {
        Set<Integer> set = new HashSet<>();

        // Menambahkan setiap elemen ke set
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (!set.add(blokSudoku[i][j])) {
                    return "tidak valid";
                }
            }
        }

        // Jika setiap elemen unik, maka valid
        return "valid";
    }
}
