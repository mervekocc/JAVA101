import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class TCHesap {
    public static void main(String[] args) {
        /*Map<String, String> database = new HashMap<>();
        database.put("ali veli", "12345678901");
        database.put("ayşe fatma", "98765432109");
        //sScanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("İsim Soyisim: ");
            String fullName = scanner.nextLine().toLowerCase();
            if (fullName.equalsIgnoreCase("q") || fullName.equalsIgnoreCase("Q")) {
                System.out.println("Programdan çıkılıyor...");
                break; // Döngüden çıkış
            }
            // İsim doğruluğunu kontrol etSS
            if (database.containsKey(fullName)) {
                String tcKimlikNo = database.get(fullName);

                // TC Kimlik numarasının son üç rakamını al
                String lastThreeDigitsFromDatabase = tcKimlikNo.substring(8);

                // Kullanıcıdan TC Kimlik numarasının son üç rakamını iste
                System.out.println("TC : "+ tcKimlikNo.substring(0,8) + "***");
                System.out.print("TC Kimlik Numarasının Son 3 Rakamı: ");
                String enteredLastThreeDigits = scanner.nextLine();

                // Son üç rakamın doğruluğunu kontrol et
                if (lastThreeDigitsFromDatabase.equals(enteredLastThreeDigits)) {
                    System.out.println("Correct");
                } else {
                    System.out.println("Hata: TC Kimlik No yanlış girildi.");
                }
            } else {
                System.out.println("Hata: İsim soyisim bulunamadı.");
            }
        }
        scanner.close();*/
        String name = "irfan";
        int test = 1;

        String[] strAr3=  new  String[ 2 ];
        strAr3[0] = "ali veli";
        strAr3[1] = "deli";

        for(int i=0; i<strAr3.length; i++){
            String eleman = strAr3[i];
            System.out.println(eleman);
        }
        Scanner scanner = new Scanner(System.in);
        System.out.println("isim soyisim");
        String fullName = scanner.nextLine().toLowerCase();
        if(strAr3[0].toString().equals(fullName)){
            System.out.println("isim doğru");
            ////////
            System.out.println("TC YAZ");
            String tc = scanner.nextLine().toLowerCase();
            if(strAr3[1].toString().equals(tc)){
                System.out.println("tc doğru");
            }else{
                System.out.println("tc yanlis");
            }
        }else{
            System.out.println("isim yanlış");

        }


    }

}
