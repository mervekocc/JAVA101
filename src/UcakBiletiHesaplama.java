import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        int km, age, type;
        double price = 0.1, total;
        Scanner input = new Scanner(System.in);

        // veri girilir
        System.out.print("Mesafeyi KM Türündem Giriniz : ");
        km = input.nextInt();
        System.out.print("Yaşınızı Giriniz : ");
        age = input.nextInt();
        System.out.print("Yolculuk Tipini Giriniz (1 =>Tek Yön , 2 => Gidiş-Dönüş) : ");
        type = input.nextInt();
        total = km * price;

        // veri aralıklarına göre işlem yapılır
        if ((age >= 0) && (km > 0) && ((type == 1) || (type == 2))) {
            System.out.println("İndirimsiz Toplam Fiyat : " + total + "TL");
            if (age < 12) {
                System.out.println("0-12 Yaş indirimi : " + (total *= 0.5) + "TL");
            } else if (age >= 12 && age <= 24) {
                System.out.println("12-24 Yaş İndirimi : " + (total *= 0.9) + "TL");
            } else if (age >= 65) {
                System.out.println("65 Yaş Üstü İndirimi : " + (total *= 0.7) + "TL");
            } else {
                System.out.println("Yetişkin : " + (total) + "TL");
            }
            //veri girilir ve çıktı verilir
            if (type == 1) {
                System.out.println("Tek Yön İndirimi : " + (total = total) + "TL");
                System.out.println("Toplam Tutar : " + total + "TL");
            } else {
                System.out.println("Gidiş-Dönüş İndirimi : " + (total *=1.6) + "TL");
                System.out.println("Toplam Tutar : " + total + "TL");
            }
        } else {
            System.out.print("Hatalı Veri Girdiniz ! ");
        }
    }
}