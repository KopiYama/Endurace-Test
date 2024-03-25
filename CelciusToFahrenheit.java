import java.util.Scanner;

public class CelciusToFahrenheit {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input suhu dalam Celcius
        double suhuCelcius = scanner.nextDouble();

        // Memanggil fungsi untuk mengonversi ke Fahrenheit
        double suhuFahrenheit = konversiCelciusToFahrenheit(suhuCelcius);

        // Cetak hasil konversi dengan 2 angka di belakang koma
        System.out.printf("%.2f\n", suhuFahrenheit);
    }

    // Fungsi untuk mengonversi suhu Celcius ke Fahrenheit
    public static double konversiCelciusToFahrenheit(double suhuCelcius) {
        double suhuFahrenheit = suhuCelcius * 1.8 + 32;
        return suhuFahrenheit;
    }
}
