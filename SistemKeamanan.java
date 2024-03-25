import java.util.Scanner;

public class SistemKeamanan {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String kalimat = input.nextLine();
        String kalimatTanpaSpasi = hapusSpasi(kalimat);
        boolean isPalindrom = isPalindrom(kalimatTanpaSpasi);
        int jumlahHuruf = hitungJumlahHuruf(kalimatTanpaSpasi);

        System.out.println(kalimatTanpaSpasi);
        System.out.println(isPalindrom);
        System.out.println(jumlahHuruf);

        if(isPalindrom) {
            System.out.println("Silahkan Masuk");
        } else {
            System.out.println("Akses Ditolak");
        }

        input.close();
    }

    public static String hapusSpasi(String kalimat) {
        return kalimat.replaceAll("\\s", "");
    }

    public static boolean isPalindrom(String kalimat) {
        int panjang = kalimat.length();
        for (int i = 0; i < panjang / 2; i++) {
            if (kalimat.charAt(i) != kalimat.charAt(panjang - i - 1)) {
                return false;
            }
        }
        return true;
    }

    public static int hitungJumlahHuruf(String kalimat) {
        return kalimat.length();
    }
}
