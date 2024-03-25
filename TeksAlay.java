import java.util.Scanner;

public class TeksAlay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kalimat = scanner.nextLine();
        String kalimatAlay = ubahKeAlay(kalimat);

        System.out.println(kalimatAlay);
    }

    public static String ubahKeAlay(String kalimat) {
        char[] karakter = kalimat.toCharArray();
        for (int i = 0; i < karakter.length; i++) {
            switch (karakter[i]) {
                case 'A':
                case 'a':
                    karakter[i] = '4';
                    break;
                case 'I':
                case 'i':
                    karakter[i] = '1';
                    break;
                case 'Z':
                case 'z':
                    karakter[i] = '2';
                    break;
                case 'E':
                case 'e':
                    karakter[i] = '3';
                    break;
                case 'G':
                case 'g':
                    karakter[i] = '6';
                    break;
                case 'J':
                case 'j':
                    karakter[i] = '7';
                    break;
                case 'B':
                case 'b':
                    karakter[i] = '8';
                    break;
                default:
                    break;
            }
        }
        return new String(karakter);
    }
}
