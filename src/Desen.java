import java.util.Scanner;

public class Desen
{
    static int design(int n, boolean control, int flag)
    {
        if (control)
        {
            if (n > 0)
            {
                System.out.print(n + " ");
                flag++;
                return design(n - 5, true, flag);
            }
            else
            {
                return design(n, false, flag);
            }
        }
        else
        {
            System.out.print(n + " ");
            if (flag > 0)
            {
                flag--;

                return design(n + 5, false, flag);
            }
            else
            {
                return 0;
            }
        }
    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Sayı giriniz: ");
        int n = input.nextInt();

        System.out.println(design(n, true, 0));

    }

}