import java.util.Scanner;

public class MencariHuruf {
    public static void main(String[] args) {
        // Array X
        char[] X = {'P', 'a', 'd', 'e', 'p', 'o', 'k', 'a', 'n', '7', '9'};
        Scanner scanner = new Scanner(System.in);
        char huruf = scanner.next().charAt(0);
        String hasil = cekKeberadaan(X, huruf);

        System.out.println(hasil);
    }

    public static String cekKeberadaan(char[] arr, char target) {
        target = Character.toLowerCase(target);

        for (char c : arr) {
            if (Character.toLowerCase(c) == target) {
                return "ada";
            }
        }

        return "tidak ada";
    }
}
