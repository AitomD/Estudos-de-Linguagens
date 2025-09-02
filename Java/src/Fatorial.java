import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Integer n = 0;
        Integer cont;

        System.out.println("Digite um numero para calculo de fatorial");
        n = sc.nextInt();
        sc.nextLine();
        cont = n;

        for (int i = cont-1 ; i > 1 ; i--){
            n = n*i;
        }
        System.out.printf("O fatorial foi %d", n);
    }
}
