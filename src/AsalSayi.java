public class AsalSayi {
    public static void main(String[] args) {
        int sayi = 100;
        int sayac=0;

        //sayılar üzerinde işlem yapılır asal sayılırı belirler
        for (int i = 1; i < sayi; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    sayac++;


                }
            }
            //ekrana çıktı verir
            if (sayac==0){
                System.out.println(i);
            }
            sayac=0;
        }
    }
}