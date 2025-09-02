import java.util.Arrays;
import java.util.Scanner;

public class ArrayMaiorMenor {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int[] num = new int[5];
        Integer menor=0;
        Integer maior=0;
        Integer media=0;
        for (int i=0 ; i < 5 ; i++){
            System.out.println("Digite um numero");
            num[i] = sc.nextInt();
        }
        System.out.println("Maior e menor: ");
        for (int c = 0 ; c < num.length ; c++){
            if (c == 0){
                menor = num[c];
                maior = num[c];
            }

            if (menor > num[c]){
                menor = num[c];
            }

            if (num[c] > maior){
                maior = num[c];
            }
            media += num[c];
        }
        System.out.printf("O maior foi %d e o menor %d e a media foi %d", maior, menor, media);
    }
}
