import java.util.Scanner;

public class BahasaPanda {

    private static final int ASCII_A = 65;
    private static final int ASCII_SPACE = 32;

    private static int getSandiNumber(char c) {
        if (c == ' ') {
            return -1;
        } else {
            return (int) c - ASCII_A + 1;
        }
    }

    private static int[] encodeToSandi(String input) {
        int[] encodedSandi = new int[input.length()];
        for (int i = 0; i < input.length(); i++) {
            encodedSandi[i] = getSandiNumber(input.charAt(i));
        }
        return encodedSandi;
    }

    private static String generateSandiString(int[] sandi) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sandi.length; i++) {
            if (sandi[i] == -1) {
                sb.append("-");
            } else {
                sb.append(sandi[i]);
            }
            if (i != sandi.length - 1) {
                if (sandi[i] != -1 && sandi[i + 1] != -1) {
                    sb.append(".");
                }
            }
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine().toUpperCase();
        int[] encodedSandi = encodeToSandi(input);
        String sandiString = generateSandiString(encodedSandi);
        System.out.println(sandiString);
        scanner.close();
    }
}
