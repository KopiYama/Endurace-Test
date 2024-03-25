import java.util.Scanner;

public class MaxOfTenNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Membuat array untuk menyimpan 10 bilangan
        int[] numbers = new int[10];

        // Input 10 bilangan
        for (int i = 0; i < 10; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Memanggil fungsi untuk mencari nilai maksimal
        int max = findMax(numbers);

        // Cetak nilai maksimal
        System.out.println(max);
    }

    // Fungsi untuk mencari nilai maksimal dalam array
    public static int findMax(int[] arr) {
        int max = arr[0]; // Asumsikan nilai pertama sebagai nilai maksimal

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }

        return max;
    }
}
