import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class YudisiumMahasiswa {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat map untuk menyimpan skala nilai
        Map<Character, Integer> skalaNilai = new HashMap<>();
        skalaNilai.put('A', 4);
        skalaNilai.put('B', 3);
        skalaNilai.put('C', 2);
        skalaNilai.put('D', 1);
        skalaNilai.put('E', 0);

        // Input jumlah mata kuliah
        int jumlahMataKuliah = scanner.nextInt();
        scanner.nextLine();  // Membersihkan newline

        // Inisialisasi total nilai dan jumlah mata kuliah
        int totalNilai = 0;
        int jumlahMataKuliahLulus = 0;

        // Loop untuk menghitung total nilai
        for (int i = 0; i < jumlahMataKuliah; i++) {
            char nilai = scanner.nextLine().charAt(0);

            // Mengambil skala nilai dari map
            int skala = skalaNilai.get(nilai);

            // Menghitung total nilai dan jumlah mata kuliah yang lulus
            if (skala > 0) {
                totalNilai += skala;
                jumlahMataKuliahLulus++;
            }
        }

        // Menghitung IPK
        double ipk = (double) totalNilai / jumlahMataKuliahLulus;

        // Menentukan Yudisium berdasarkan IPK
        String yudisium = "";
        if (ipk >= 3.5) {
            yudisium = "Cum Laude";
        } else if (ipk >= 2.75) {
            yudisium = "Sangat Memuaskan";
        } else if (ipk >= 2) {
            yudisium = "Memuaskan";
        } else {
            yudisium = "Pending";
        }

        // Cetak Yudisium
        System.out.println(yudisium);
    }
}
