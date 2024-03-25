import java.util.Scanner;

public class VolumeBola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input
        int R1 = scanner.nextInt();
        int R2 = scanner.nextInt();
        int R3 = scanner.nextInt();
        double r1 = scanner.nextDouble();

        // Perhitungan volume bola
        double volume1 = (4.0 / 3) * 3.14 * Math.pow(r1, 3);
        double volume2 = (4.0 / 3) * 3.14 * Math.pow((r1 * R2) / R1, 3);
        double volume3 = (4.0 / 3) * 3.14 * Math.pow((r1 * R3) / R1, 3);

        // Jumlah volume 3 bola
        double totalVolume = volume1 + volume2 + volume3;

        // Output
        System.out.printf("%.2f", totalVolume);

        scanner.close();
    }
}
