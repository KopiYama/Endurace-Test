import java.util.Scanner;

public class HurufVokal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        char[][] array2D = new char[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                array2D[i][j] = scanner.next().charAt(0);
            }
        }

        boolean ketemuVokal = false;

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (isVokal(array2D[i][j])) {
                    System.out.println(array2D[i][j] + ": (" + (i + 1) + "," + (j + 1) + ")");
                    ketemuVokal = true;
                }
            }
        }

        if (!ketemuVokal) {
            System.out.println("tidak ada huruf vokal");
        }

        scanner.close();
    }

    public static boolean isVokal(char c) {
        return c == 'a' || c == 'A' ||
                c == 'e' || c == 'E' ||
                c == 'i' || c == 'I' ||
                c == 'o' || c == 'O' ||
                c == 'u' || c == 'U';
    }
}