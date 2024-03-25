import java.util.HashMap;
import java.util.Scanner;

public class CountHolesInWord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kata = scanner.nextLine();
        int jumlahLubang = hitungLubang(kata);

        System.out.println(jumlahLubang);

        scanner.close();
    }

    public static int hitungLubang(String kata) {
        HashMap<Character, Integer> jumlahLubang = new HashMap<>();
        jumlahLubang.put('a', 1);
        jumlahLubang.put('b', 1);
        jumlahLubang.put('d', 1);
        jumlahLubang.put('e', 1);
        jumlahLubang.put('g', 1);
        jumlahLubang.put('o', 1);
        jumlahLubang.put('p', 1);
        jumlahLubang.put('q', 1);
        jumlahLubang.put('0', 1);
        jumlahLubang.put('4', 1);
        jumlahLubang.put('6', 1);
        jumlahLubang.put('8', 2);
        jumlahLubang.put('9', 1);
        jumlahLubang.put('B', 2);
        jumlahLubang.put('A', 1);
        jumlahLubang.put('D', 1);
        jumlahLubang.put('O', 1);
        jumlahLubang.put('P', 1);
        jumlahLubang.put('Q', 1);
        jumlahLubang.put('R', 1);

        int totalLubang = 0;
        for (char karakter : kata.toCharArray()) {
            if (jumlahLubang.containsKey(karakter)) {
                totalLubang += jumlahLubang.get(karakter);
            }
        }

        return totalLubang;
    }
}