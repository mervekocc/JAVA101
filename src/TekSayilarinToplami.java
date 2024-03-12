
import java.util.Scanner;

public class TekSayilarinToplami {
    public static void main(String[] args) {
        int sayi=0, toplam1=0, toplam2=0;
        Scanner input = new Scanner(System.in);

        // TEK SAYILARIN TOPLAMINI BULAN PROGRAM
        System.out.println("!!! TEK SAYILARIN TOPLAMINI BULAN PROGRAM !!!\n");

        System.out.print("lütfen bir sayı giriniz: ");

        while (sayi>=0) {
            sayi = input.nextInt();
            if(sayi%2==1){
                toplam1 += sayi;
            }
        }
        System.out.println("Toplam = "+toplam1);

        // ÇİFT VE 4'ÜN KATLARI OLAN SAYILARIN TOPLAMINI BULAN PROGRAM
        System.out.println("\n!!! ÇİFT VE 4'ÜN KATLARI OLAN SAYILARIN TOPLAMINI BULAN PROGRAM !!!\n");

        System.out.print("lütfen bir sayı giriniz: ");

        while (sayi%2!=1) {
            sayi = input.nextInt();
            if(sayi%2==0 & sayi%4==0){
                toplam2 += sayi;
            }
        }
        System.out.println("Toplam = "+toplam2);
    }
}
