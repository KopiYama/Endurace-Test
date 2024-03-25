//import package bila perlu
import java.util.Scanner;

public class ParkirMalam {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //Tulis jawaban disini

        int jenisKendaraan = input.nextInt();
        int lamaParkir = input.nextInt();
        int biayaParkir = hitungBiayaParkir(jenisKendaraan, lamaParkir);
        if (biayaParkir == -1) {
            System.out.println("disegel");
        } else {
            System.out.println(biayaParkir);
        }

        input.close();
    }

    public static int hitungBiayaParkir(int jenisKendaraan, int lamaParkir) {
        int biayaPerJam;
        int biayaTotal;

        if (jenisKendaraan == 1) {
            biayaPerJam = 1500;
        } else if (jenisKendaraan == 2) {
            biayaPerJam = 1000;
        } else {
            System.out.println("Jenis kendaraan tidak valid.");
            return 0;
        }

        biayaTotal = biayaPerJam * lamaParkir;

        if (lamaParkir > 5) {
            biayaTotal += 500 * (lamaParkir - 5);
        }

        if (lamaParkir > 8) {
            return -1;
        }

        return biayaTotal;
    }
}