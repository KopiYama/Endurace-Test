import java.util.Scanner;

public class Pola {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah baris
        int N = scanner.nextInt();

        // Membuat pola dan mencetak
        for (int i = 0; i < N; i++) {
            for (int j = 0; j <= i; j++) {
                int bilangan = (int) Math.pow(2, i - j);
                System.out.print(bilangan + " ");
            }
            System.out.println();
        }
    }
}
