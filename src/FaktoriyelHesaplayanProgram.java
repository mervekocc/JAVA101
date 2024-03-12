

import java.util.Scanner;

public class FaktoriyelHesaplayanProgram {
    public static void main(String[] args) {
        int sayi, sonuc = 1, n, r, nF = 1, rF = 1, nRF = 1, kS;
        Scanner input = new Scanner(System.in);
        // n = eleman sayısı
        // r = seçim sayısı
        // nF = n Faktöriyel
        // rF = r Faktöriyel
        // nRF = n-r Faktöriyel
        // kS = kombinasyon sayısı

        //Faktöriyel Hesaplayan Program
        System.out.print("\n!!! FAKTÖRİYEL HESAPLAYAN PROGRAM\n");

        System.out.print("Faktörüyel hesaplamak için bir sayı giriniz: ");
        sayi = input.nextInt();

        for (int x = 1; x <= sayi; x++) {
            sonuc = sonuc * x;
        }
        System.out.print(sayi + " Faktöriyel= " + sonuc);

        //Kombinasyon Hesaplayan Program
        System.out.print("\n!!! KOMBİNASYON HESAPLAYAN PROGRAM\n");

        System.out.print("Eleman Sayısı (n): ");
        n = input.nextInt();

        System.out.print("Seçim Sayısı (r): ");
        r = input.nextInt();

        for (int y = 1; y <= n; y++) {
            nF = nF * y;
        }

        for (int z = 1; z <= r; z++) {
            rF = rF * z;
        }

        for (int a = 1; a <= n - r; a++) {
            nRF = nRF * a;
        }

        kS = nF / (rF * (nRF));
        System.out.println("C(" + n + "," + r + "): " + kS);
    }
}