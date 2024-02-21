import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args){
        double meter,kg,index;
        Scanner input = new Scanner(System.in);

        //Kullanıcıdan bilgileri alıyoruz
        System.out.print("Lütfen Boyunuzu (metre cinsinde) Giriniz :");
        meter=input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz :");
        kg = input.nextDouble();

        //kullanıcının girmiş olduğ bilgiler ile vücut kitle index formülünü uygula
        index = kg/(meter*meter);

        //Çıkan sonucu ekrana yazdırdık
        System.out.print("Vücut Kitle İndeksiniz :"+index);
    }
}