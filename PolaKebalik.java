import java.util.Scanner;

public class PolaKebalik {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input jumlah baris
        int N = scanner.nextInt();
        int count = 1;

        // Membuat pola dan mencetak
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N - i; j++) {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
