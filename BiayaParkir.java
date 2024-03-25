import java.util.Scanner;

public class BiayaParkir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jenisKendaraan = scanner.nextInt();
        int lamaParkir = scanner.nextInt();
        int totalBiaya = 0;

        if (jenisKendaraan == 1) {
            totalBiaya = 2000;

            if (lamaParkir > 1) {
                totalBiaya += 1000 * (lamaParkir - 1);
            }

        } else if (jenisKendaraan == 2) {
            totalBiaya = 1000;

            if (lamaParkir > 1) {
                totalBiaya += 500 * (lamaParkir - 1);
            }
        }

        System.out.println(totalBiaya);
        scanner.close();
    }
}
