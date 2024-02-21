import java.util.Scanner;

public class VucutKitleIndeksiHesaplama {
    public static void main(String[] args){
        double meter,kg,index;
        Scanner input = new Scanner(System.in);

        System.out.print("Lütfen Boyunuzu (metre cinsinde) Giriniz :");
        meter=input.nextDouble();
        System.out.print("Lütfen Kilonuzu Giriniz :");
        kg = input.nextDouble();
        index = kg/(meter*meter);
        System.out.print("Vücut Kitle İndeksiniz :"+index);
    }
}