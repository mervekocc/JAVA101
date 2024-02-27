import java.util.Scanner;

public class UstHesabi {
    public static void main(String[] args) {
        int sayi;
        int us ;
        int toplam=0;
        Scanner scanner=new Scanner(System.in);
        // kullanıcıdan veriler alınır
        System.out.print("Taban değeri giriniz :");
         sayi= scanner.nextInt();

        System.out.print("Üs değerini giriniz :");
         us= scanner.nextInt();
         toplam=sayi;

        // verilere göre işlem yapılır ve çıktı verilir
        for (int i = 1; i <us ; i++) {
            toplam =toplam*sayi;

        }
        System.out.print("Sonuç :" +toplam);
    }
}