import java.util.Deque;
import java.util.ArrayDeque;

public class TesteDeque {
    public static void main(String[] args) {
        Deque<String> pilha = new ArrayDeque<>();


        pilha.push("pamonha");
        pilha.push("batata");
        pilha.push("carro");

        System.out.printf("O elemento de cima é %s,\n",pilha.peek());

        System.out.println("Removendo o ultimo... ");
        pilha.pop();

        System.out.printf("O novo elemento de cima é %s",pilha.peek());
    }
}
