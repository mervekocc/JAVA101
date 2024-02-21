import java.util.Scanner;

public class ManavKasaPrograms {
    public static void main(String[] args){
        double a=2.14,e=3.67,d=1.11,m=0.95,p=5,toplam;
        double kg1,kg2,kg3,kg4,kg5;
        Scanner inp = new Scanner(System.in);

        //kullanıcıdan veri aldık
        System.out.print("Armut Kaç Kilo? :");
        kg1 =inp.nextDouble();
        System.out.print("Elma Kaç Kilo? :");
        kg2 =inp.nextDouble();
        System.out.print("Domates Kaç Kilo? :");
        kg3=inp.nextDouble();
        System.out.print("Muz Kaç Kilo? :");
        kg4 = inp.nextDouble();
        System.out.print("Patlıcan Kaç Kilo? :");
        kg5=inp.nextDouble();

        //veriler doğrultusunda hesaplama yaptık
        toplam = (a*kg1)+(e*kg2)+(d*kg3)+(m*kg4)+(p*kg5);
        System.out.print("Toplam Tutar :"+toplam);
    }
}