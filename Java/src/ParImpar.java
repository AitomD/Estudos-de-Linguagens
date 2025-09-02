import java.util.Scanner;

public class ParImpar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero = 0;

        System.out.println("Digite um numero: \n");
        numero = sc.nextInt();

        if (numero % 2 == 0){
            System.out.print("O numero digitado é par ");
        }
        else {
            System.out.print("O numero digitado foi impar");
        }
    }
}
