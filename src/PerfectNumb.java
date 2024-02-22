import java.util.Scanner;

public class PerfectNumb {
    public static void main(String[] args) {
        //kullanıcıdan tamsayı alarak o sayının mükemmel bir sayı olup olmadığını kontrol eder ve sonucu ekrana yazdırır
        int sayi ;
        int sonuc = 0;
        Scanner input = new Scanner(System.in);
        sayi = input.nextInt();
        // kullanıcıdan alınan veriler üzerinde işlem yapılır
        //Bu döngü, sayının tam bölenlerini bulmak için kullanılacak
        for (int i = 1; i < sayi; i++) {
            if (sayi %i==0){
                sonuc+=i;
            }}
        //veriler sonucunda geri bildirim ver
        if (sonuc==sayi){
            System.out.println(sayi+" Mükemmel Sayıdır");
        }
        else
            System.out.println(sayi+" Mükemmel Sayı Değildir");




    }
}