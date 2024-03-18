

import java.util.Scanner;

public class HarmonikSeriBulanProgram {
    public static void main(String[] args) {
        double n, toplam = 0;
        Scanner input = new Scanner(System.in);

        System.out.print("Harmonik serisini bulmak istediğiniz sayıyı (n) giriniiz: ");
        n = input.nextInt();

        for (double x = 1; x <= n; x++) {
            toplam += 1 / x;
        }
        System.out.print("Cevap: " + toplam);
    }
}