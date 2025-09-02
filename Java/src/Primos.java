import java.util.Scanner;

public class Primos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = 0;
        int cont = 0;
        int primo = 0;

        System.out.println("Digite um numero: ");
        num = sc.nextInt();
        for (int i = 1 ; i <= num ; i ++){
            if (num % i == 0){
                cont += 1;
            }
        }
        if (cont == 2){
            System.out.println("O numero é primo");
        }
        else {
            System.out.println("O numero não é primo");
        }
    }
}
