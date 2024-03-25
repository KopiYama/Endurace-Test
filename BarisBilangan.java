import java.util.Scanner;

public class BarisBilangan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        int increment = 3;
        int sum = input;
        System.out.print(input + " ");

        for (int i = 1; i < 15; i++) {
            sum += increment;
            System.out.print(sum + " ");

            if (increment == 5) {
                increment = 3;
            } else {
                increment += 1;
            }
        }

        scanner.close();
    }
}