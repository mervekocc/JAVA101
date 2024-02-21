import java.util.Scanner;

public class DaireninYaricapi {
    public static void main(String[] args){
        Scanner inp = new Scanner(System.in);
        // yarıçap:r
        //merkez ölçüsünün alanı:a
        int r,a;
        double pi=3.14,alan;
        System.out.print("Direnin Yarıçapı :");
        r =inp.nextInt();
        System.out.print("Dairenin Merkez Açı Ölçüsü :");
        a = inp.nextInt();

        alan= (pi*(r*r)*a)/360;
        System.out.println("Daire Diliminin Alanı :"+alan);
    }
}