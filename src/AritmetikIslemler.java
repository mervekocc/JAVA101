import java.util.Scanner;
public class AritmetikIslemler {
    public static void main(String[] args) {

        //değişkenleri tanımla
        int a,b,c, islem;

        //kullanıcıdan verileri al
        Scanner input=new Scanner(System.in);
        System.out.print("1. Sayıyı Giriniz : ");
        a=input.nextInt();
        System.out.print("2. Sayıyı Giriniz : ");
        b=input.nextInt();
        System.out.print("3. Sayıyı Giriniz : ");
        c=input.nextInt();

        //işlemleri yaptır, sonucu ekrana yazdır
        islem=a+b*c-b;
        System.out.println("İşlem Sonucunuz: "+ islem  );
    }
}
