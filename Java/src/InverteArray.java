import java.util.Scanner;

public class InverteArray {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] inv = new int[6];

        for (int i=0; i < inv.length ; i++ ) {
            System.out.println("Digite um numero: ");
            inv[i] = sc.nextInt();
        }

        for (int v = 5 ; v >= 0 ; v--){
            System.out.printf(" %d ", inv[v]);
        }
    }
}
