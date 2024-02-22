import java.util.Scanner;

public class TipDonusum {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        //Kullanıcıdan tam sayı ve ondalıklı sayıyı alınır
        System.out.print("Tam sayı giriniz : ");
        int Intnumb = scan.nextInt();

        System.out.print("Ondalıklı sayı giriniz : ");
        double ondaliklinumb = scan.nextDouble();

        //Tip dönüşümleri yapılır ve sonuçları ekrana yazdırılır
        double intCasting = Intnumb;
        int floatCasting = (int) ondaliklinumb;

        System.out.println("Tam sayı dönüştürme : " + intCasting);
        System.out.println("Ondalıklı sayı dönüştürme : " + floatCasting);

    }
}
