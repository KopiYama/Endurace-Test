import java.util.Scanner;

public class TokoTujuhSembilan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int jumlahBarang = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < jumlahBarang; i++) {
            String namaProduk = scanner.nextLine();

            String labelBarang = scanner.nextLine();

            double hargaProduksi = scanner.nextDouble();
            scanner.nextLine();

            double labaPercentage = getLabaPercentage(labelBarang);
            int hargaJual = kalkulasiHargaJual(labaPercentage, hargaProduksi);

            System.out.println(namaProduk);
            System.out.println(hargaJual);
            System.out.println();
        }

        scanner.close();
    }

    public static double getLabaPercentage(String labelBarang) {
        switch (labelBarang.toLowerCase()) {
            case "good":
                return 0.15;
            case "recommended":
                return 0.25;
            case "best seller":
                return 0.35;
            case "normal":
                return 0.10;
            default:
                return 0.10;
        }
    }

    public static int kalkulasiHargaJual(double labaPercentage, double hargaProduksi) {
        double hargaJualDouble = hargaProduksi * (1 + labaPercentage);
        return (int) Math.round(hargaJualDouble);
    }
}
