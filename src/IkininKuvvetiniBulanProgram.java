

import java.util.Scanner;

public class IkininKuvvetiniBulanProgram {
    public static void main(String[] args) {
        int sayi1, sayac1 = 0, sayi2, sayac2 = 0, sayac3 = 0;
        Scanner input = new Scanner(System.in);

        // 2'NİN KUVVETLERİNİ EKRANA YAZDIRAN PROGRAM
        System.out.print("\n!!! 2'NİN KUVVETLERİNİ EKRANA YAZDIRAN PROGRAM !!!\n");

        System.out.print("Lütfen bir sınır değeri giriniz: ");
        sayi1 = input.nextInt();

        for (int x = 1; x <= sayi1; x *= 2) {
            System.out.println(2 + "^" + sayac1 + " = " + x);
            sayac1++;
        }

        // 4 VE 5'İN KUVVETLERİNİ EKRANA YAZDIRAN PROGRAM
        System.out.print("\n!!! 4 VE 5'İN KUVVETLERİNİ EKRANA YAZDIRAN PROGRAM !!!\n");

        System.out.print("Lütfen bir sınır değeri giriniz: ");
        sayi2 = input.nextInt();

        System.out.println("4'ün katları\n");

        for (int y = 1; y <= sayi2; y *= 4) {
            System.out.println(4 + "^" + sayac2 + " = " + y);
            sayac2++;
        }

        System.out.println("5'in katları\n");

        for (int z = 1; z <= sayi2; z *= 5) {
            System.out.println(5 + "^" + sayac3 + " = " + z);
            sayac3++;
        }
    }
}
