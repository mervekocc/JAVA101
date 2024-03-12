
import java.util.Scanner;

public class CiftSayilariBulmak {
    public static void main(String[] args) {

        // ÇİFT SAYILARI BULAN PROGRAM

        System.out.println("!!! ÇİFT SAYILARI BULAN PROGRAM !!!\n");

        int sayi, toplam = 0, bolen = 0, ortalama;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int x = 0; x <= sayi; x++) {
            if (x % 2 == 0) {
                System.out.println(x);
            }
        }

        // 3 VE 4'E TAM BÖLÜNEN SAYILARIN ORTALAMASINI BULAN PROGRAM

        System.out.println("\n!!! 3 VE 4'E TAM BÖLÜNEN SAYILARIN ORTALAMASINI BULAN PROGRAM !!!\n");

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int y = 0; y <= sayi; y++) {
            if (y % 3 == 0 & y % 4 == 0) {
                System.out.println(y);
                bolen++;
                toplam += y;
            }
        }
        ortalama = toplam / bolen;
        System.out.println("Ortalama: " + ortalama);
    }
}
