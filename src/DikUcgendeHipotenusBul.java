import java.util.Scanner;
public class DikUcgendeHipotenusBul {
    public static void main(String[] args) {
        double ilkKenar , ikinciKenar,ucuncuKenar,alan,u;

        Scanner klavye =new Scanner(System.in) ;
        System.out.print("Lütfen ilk kenar uzunluğunu giriniz:");
        ilkKenar = klavye.nextDouble();
        System.out.print("Lütfen ikinci kenar uzunluğunu giriniz:" );
        ikinciKenar = klavye.nextDouble();
        System.out.println("Hipotenüs uzunluğu :" + (Math.sqrt(Math.pow(ilkKenar,2)+Math.pow(ikinciKenar,2))));


        System.out.print("Lütfen 3.kenar uzunluğunu giriniz:");
        ucuncuKenar= klavye.nextDouble();
        u=((ilkKenar+ikinciKenar+ucuncuKenar)/2);
        alan=(Math.sqrt(u*(u-ilkKenar)*(u-ikinciKenar)*(u-ucuncuKenar)));
        System.out.println("Üçgenin alanı :"+alan);

    }
}
