import java.util.Scanner;

public class UstHesabi {
    public static void main(String[] args) {
        int sayi;
        int us ;
        int toplam=0;
        Scanner scanner=new Scanner(System.in);
        System.out.print("Üssünü öğrenmek istediğiniz sayıyi giriniz :");
        sayi= scanner.nextInt();
        System.out.print("Üssü giriniz :");
        us= scanner.nextInt();
        toplam=sayi;
        for (int i = 1; i <us ; i++) {
            toplam =toplam*sayi;

        }
        System.out.print("Üslü sayının sonucu :" +toplam);
    }
}