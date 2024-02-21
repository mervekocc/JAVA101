import java.util.Scanner;
public class Kdv {
    public static void main(String[] args) {
        double tutar ;
        System.out.print("Lütfen tutarı giriniz:");
        Scanner scanner=new Scanner(System.in);
        tutar =scanner.nextDouble();
        System.out.println("Kdvsiz tutar:"+tutar);
        System.out.println("Kdv tutarı :" + tutar*0.18);
        System.out.println("Kdvli tutar :"+ (tutar*0.18+tutar));

        if (tutar<1000){
            System.out.println("Yüzde 18 Kdvli tutar :"+ (tutar*0.18+tutar));}
        else
            System.out.println("Yüzde 8 Kdvli tutar :"+ (tutar*0.8+tutar));



    }
}