

import java.util.Scanner;

public class ArmstrongSayilariBulanProgram {
    public static void main(String[] args) {
        int sayi1, bsmkSay1 = 0, hafizaSay1;
        Scanner input = new Scanner(System.in);

        //Armstrong Sayıları Bulan Program
        System.out.print("\n!!! ARMSTRONG SAYILARI BULAN PROGRAM !!!\n");

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi1 = input.nextInt();
        hafizaSay1 = sayi1;

        for (int x = 0; sayi1 != 0; x++) {
            sayi1 = sayi1 / 10;
            bsmkSay1++;
        }

        sayi1 = hafizaSay1;

        int bsmkMod1, bsmkDeger1, mod1 = 10, bolum1 = 1, gToplam1 = 1, sonuc1 = 0;

        for (int y = 1; y <= bsmkSay1; y++) {
            bsmkMod1 = sayi1 % mod1;
            bsmkDeger1 = bsmkMod1 / bolum1;
            mod1 *= 10;
            bolum1 *= 10;

            for (int z = 1; z <= bsmkSay1; z++) {
                gToplam1 *= bsmkDeger1;
            }

            sonuc1 += gToplam1;
            gToplam1 = 1;
        }
        if (sayi1 == sonuc1) {
            System.out.println(sayi1 + " bir armstrong sayıdır.");
        } else {
            System.out.println(sayi1 + " bir armstrong sayıdır değildir !!!");
        }


        //Basamak Sayılarının Toplamını Hesaplayan Program
        System.out.print("\n!!! BASAMAK SAYILARININ TOPLAMINI HESAPLAYAN PROGRAM !!!\n");

        int sayi2, bsmkSay2 = 0, hafizaSay2;

        System.out.print("Lütfen bir sayı giriniz: ");
        sayi2 = input.nextInt();
        hafizaSay2 = sayi2;

        for (int x = 0; sayi2 != 0; x++) {
            sayi2 = sayi2 / 10;
            bsmkSay2++;
        }

        sayi2 = hafizaSay2;

        int bsmkMod2, bsmkDeger2, mod2 = 10, bolum2 = 1, sonuc2 = 0;

        for (int y = 1; y <= bsmkSay2; y++) {
            bsmkMod2 = sayi2 % mod2;
            bsmkDeger2 = bsmkMod2 / bolum2;
            mod2 *= 10;
            bolum2 *= 10;

            sonuc2 += bsmkDeger2;

        }

        System.out.print("Basamak Sayılarının Toplamı: " + sonuc2);

    }
}