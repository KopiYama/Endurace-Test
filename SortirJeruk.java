import java.util.Scanner;

public class SortirJeruk {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah jeruk
        int N = scanner.nextInt();
        int[] nilaiJeruk = new int[N];

        // Input nilai jeruk
        for (int i = 0; i < N; i++) {
            nilaiJeruk[i] = scanner.nextInt();
        }

        // Variabel untuk menghitung jumlah jeruk berdasarkan kualitas
        int countE = 0; // Kualitas Ekspor
        int countL = 0; // Kualitas Lokal
        int countR = 0; // Kualitas Rendah

        // Memeriksa setiap nilai jeruk dan menentukan kualitasnya
        for (int nilai : nilaiJeruk) {
            if (nilai >= 85 && nilai <= 100) {
                countE++;
            } else if (nilai >= 60 && nilai <= 84) {
                countL++;
            } else if (nilai >= 0 && nilai < 60) {
                countR++;
            } else {
                System.out.println("error");
                return;
            }
        }

        // Menampilkan jumlah jeruk berdasarkan kualitasnya
        System.out.println("E " + countE);
        System.out.println("L " + countL);
        System.out.println("R " + countR);
    }
}
