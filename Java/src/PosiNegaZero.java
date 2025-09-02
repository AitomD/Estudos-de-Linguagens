import java.lang.reflect.Array;
import java.util.Scanner;

public class PosiNegaZero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer p=0,n=0,z=0,num=0;

        for (int i = 0; i < 5 ; i++) {
            System.out.println("Digite um numero qualquer: ");
            num = sc.nextInt();

            if (num == 0) {
                z = z + 1;
            }
            if (num < 0) {
                n = n + 1;
            }
            if (num > 0) {
                p = p + 1;
            }
        }
        System.out.printf("Tiveram %d positivos %d negativos e %d zeros", p, n, z);
    }
}
