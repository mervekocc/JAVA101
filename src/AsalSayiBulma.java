import java.util.Scanner;

public class AsalSayiBulma
{
    static int asal(int number, int i) {

        if (number == i)
        {
            return 1;
        } else
        {
            if (number % i == 0)
            {
                return 0;
            } else return asal(number, i + 1);
        }

    }

    public static void main(String[] args)
    {
        //Bir Scanner nesnesi oluşturularak kullanıcıdan giriş alınır.
        //Kullanıcıya bir mesaj gösterilerek bir sayı girmesi istenir.
        //Kullanıcının girdiği sayı number değişkenine atanır.
        Scanner input = new Scanner(System.in);
         System.out.print("Sayı giriniz:");
          int number = input.nextInt();
          int i = 2;

        if (asal(number, i) == 1)
        {
         // Ekrana sonuç yazdırılır.
            System.out.print(number + " Sayısı asaldır !");
        }
        else
        {
            System.out.println(number + " Sayısı asal değildir !");
        }

    }
}