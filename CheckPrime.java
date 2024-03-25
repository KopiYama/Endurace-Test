import java.util.Scanner;

public class CheckPrime {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input bilangan
        int inputBilangan = scanner.nextInt();

        // Memanggil fungsi untuk mengecek apakah inputBilangan prima atau bukan
        if (isPrime(inputBilangan)) {
            System.out.println("prima");
        } else {
            System.out.println("bukan prima");
        }
    }

    // Fungsi untuk mengecek apakah sebuah bilangan prima atau bukan
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
