import java.util.Scanner;

public class ArtikYil {
    public static void main(String[] args) {
        int year;
        Scanner input = new Scanner(System.in);

    //kullanıcıdan veri alınır
        System.out.print("Yıl Giriniz : ");
        year = input.nextInt();

    //veriler doğrultusunda işlem yapılır ve çıktı verilir
        if ((year % 4 == 0) && ((year % 100 != 0) || (year % 400 == 0))) {
            System.out.print(year + " Bir Artık Yıldır");
        }else{
            System.out.print(year + " Bir Artık Yıl Değildir.");
        }
    }
}
