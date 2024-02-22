import java.util.Scanner;

public class TersUcgen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // kullanıcıdan veri alır
        System.out.print("Sayı Giriniz: ");
        int sayi = input.nextInt();

        // üçgenin her satırının yıldızlarını azalarak devam et
        for (int i = sayi - 1; i >= 1; i--) {
           for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}