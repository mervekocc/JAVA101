
import java.util.Scanner;

public class UsluSayiHesaplayanProgram {
    public static void main(String[] args) {
        int sayi1, kuvvet1, sayi2, kuvvet2, sayac = 1, snc1 = 1, snc2 = 1;
        Scanner input = new Scanner(System.in);

        // Üslü Sayı Hesaplayan Program (while ile çözüm)
        //System.out.print("\n!!! ÜSLÜ SAYI HESAPLAYAN PROGRAM (WHILE İLE ÇÖZÜM)!!!\n");

        System.out.print("Lütfen taban sayıyı giriniz: ");
        sayi1 = input.nextInt();

        System.out.print("Lütfen kuvveti (üs) giriniz: ");
        kuvvet1 = input.nextInt();

        while (sayac <= kuvvet1) {
            snc1 *= sayi1;
            sayac++;
        }
        System.out.println(sayi1 + "^" + kuvvet1 + ": " + snc1);

        // Üslü Sayı Hesaplayan Program (for ile çözüm)
        System.out.print("\n!!! ÜSLÜ SAYI HESAPLAYAN PROGRAM (FOR İLE ÇÖZÜM)!!!\n");

        System.out.print("Lütfen taban sayıyı giriniz: ");
        sayi2 = input.nextInt();

        System.out.print("Lütfen kuvveti (üs) giriniz: ");
        kuvvet2 = input.nextInt();

        for (int x = 1; x <= kuvvet2; x++) {
            snc2 *= sayi2;
        }
        System.out.println(sayi2 + "^" + kuvvet2 + ": " + snc2);
    }
}