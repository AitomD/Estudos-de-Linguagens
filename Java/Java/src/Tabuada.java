import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um numero para ver sua tabuada: \n");
        num = sc.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.printf(" %d X %d = %d\n", num, i, num * i);
        }
    }
}
