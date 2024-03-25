//import package jika perlu
import java.util.Scanner;

public class WujudBenda {
    public static void main(String[] args){
        //Tulis jawaban disini
        Scanner input = new Scanner(System.in);
        double suhu = input.nextDouble();
        String wujud = tentukanWujud(suhu);
        System.out.println(wujud);
        input.close();

    }
    public static String tentukanWujud(double suhu) {
        if (suhu >= 0 && suhu <= 100) {
            return "berwujud cair";
        } else {
            return "berwujud non cair";
        }
    }

}