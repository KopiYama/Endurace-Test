import java.util.Scanner;

public class KonversiDetik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Write Code Here
        int totalDetik = scanner.nextInt();

        int hari = totalDetik / (24 * 3600);
        int sisaDetik = totalDetik % (24 * 3600);
        int jam = sisaDetik / 3600;
        sisaDetik %= 3600;
        int menit = sisaDetik / 60;
        sisaDetik %= 60;
        int detik = sisaDetik;

        System.out.println(hari);
        System.out.println(jam);
        System.out.println(menit);
        System.out.println(detik);

        scanner.close();
    }
}
