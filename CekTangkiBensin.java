import java.util.Scanner;

public class CekTangkiBensin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int uang = input.nextInt();
        double kapasitas = input.nextDouble();
        double hargaBensin = 7600;
        double jumlahBensin = uang / hargaBensin;
        System.out.printf("%.2f\n", jumlahBensin);
        if (jumlahBensin <= kapasitas) {
            System.out.println();
        } else {
            System.out.println("Bensin Berlebih");
        }

        input.close();
    }
}