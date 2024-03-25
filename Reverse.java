import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String teks = scanner.nextLine();
        String hasil = reverseString(teks);

        System.out.println(hasil);
    }

    public static String reverseString(String str) {
        char[] charArray = str.toCharArray();

        int start = 0;
        int end = charArray.length - 1;

        while (start < end) {
            char temp = charArray[start];
            charArray[start] = charArray[end];
            charArray[end] = temp;

            start++;
            end--;
        }

        String reversedString = new String(charArray);

        return reversedString;
    }
}
