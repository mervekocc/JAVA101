import java.util.Scanner;
public class Fibonacci{
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        // kullanıcıdan veri alınır
        System.out.print("Eleman Sayısını Giriniz : ");
        int m = inp.nextInt();
        int a = 0;
        int b = 1;
        int c;
        System.out.print(m+" Elemanlık fibonacci serisi: " + a + ", " + b);

       // a ve b toplanarak c değişkenine atanır bu fibonacci serisindeki bir sonraki sayıyı oluşturur
        for (int i = 2; i < m; i++) {
            c = a + b;
            System.out.print(", " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}