import java.util.Scanner;

public class AplikasiParkirMall {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input kategori kendaraan (1 untuk mobil, 2 untuk motor, 3 untuk box)
        int kategori = scanner.nextInt();

        // Input lama waktu parkir dalam satuan jam
        int lamaParkir = scanner.nextInt();

        // Input status member parkir (VIP atau Umum)
        String statusMember = scanner.next();

        // Memanggil fungsi untuk menghitung biaya parkir
        int biayaParkir = hitungBiayaParkir(kategori, lamaParkir, statusMember);

        // Cetak total biaya parkir
        System.out.println(biayaParkir);
    }

    // Fungsi untuk menghitung biaya parkir
    public static int hitungBiayaParkir(int kategori, int lamaParkir, String statusMember) {
        int tarifPertama = 0;
        int tarifBerikutnya = 0;
        int biayaMaksimal = 0;

        // Menentukan tarif dan biaya maksimal berdasarkan kategori kendaraan
        switch (kategori) {
            case 1: // Mobil
                tarifPertama = 5000;
                tarifBerikutnya = 2000;
                biayaMaksimal = 25000;
                break;
            case 2: // Motor
                tarifPertama = 2000;
                tarifBerikutnya = 1000;
                biayaMaksimal = 10000;
                break;
            case 3: // Box
                tarifPertama = 10000;
                tarifBerikutnya = 5000;
                biayaMaksimal = 50000;
                break;
            default:
                System.out.println("Kategori kendaraan tidak valid.");
                return 0;
        }

        // Menentukan tarif pertama untuk member VIP (0 untuk member VIP)
        if (statusMember.equalsIgnoreCase("VIP")) {
            tarifPertama = 0;
        }

        // Menghitung biaya parkir
        int biayaTotal = tarifPertama + tarifBerikutnya * (lamaParkir - 1);

        // Mengecek biaya maksimal
        if (biayaTotal > biayaMaksimal) {
            biayaTotal = biayaMaksimal;
        }

        return biayaTotal;
    }
}
