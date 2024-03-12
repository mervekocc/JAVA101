
import java.util.Scanner;

public class YildizlarIleUcgenYapimi {
    public static void main(String[] args) {
        int katSay1, katSay2;
        Scanner input = new Scanner(System.in);

        //Yıldız ile Üçgen Yapımı
        System.out.print("\n!!! YILDIZ ÜÇGEN YAPIMI !!!\n");

        System.out.print("Bir sayı giriniz: ");
        katSay1 = input.nextInt();

        for (int x = 0; x <= katSay1; x++) {

            for (int y = 0; y < (katSay1 - x); y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * x + 1); z++) {
                System.out.print("*");
            }
            System.out.println("");
        }


        //Yıldız Elmas Yapımı
        System.out.print("\n!!! YILDIZ ELMAS YAPIMI !!!\n");

        System.out.print("Bir sayı giriniz: ");
        katSay2 = input.nextInt();

        for (int x = 0; x <= katSay2; x++) {

            for (int y = 0; y < (katSay2 - x); y++) {
                System.out.print(" ");
            }
            for (int z = 1; z <= (2 * x + 1); z++) {
                System.out.print("*");
            }
            System.out.println("");
        }

        for (int x = 0; x <= katSay2; x++) {

            for (int y = 0; y <= x; y++) {
                System.out.print(" ");
            }
            for (int z = 1; z < (2 * katSay2) - (2 * x); z++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}