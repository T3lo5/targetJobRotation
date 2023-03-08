import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite um número inteiro para verificar se pertence à sequência de Fibonacci: ");
        int num = input.nextInt();

        int anterior = 0, atual = 1, proximo;
        boolean pertence = false;

        if (num == 0 || num == 1) {
            pertence = true;
        } else {
            for (int i = 2; i <= num; i++) {
                proximo = anterior + atual;
                if (proximo == num) {
                    pertence = true;
                    break;
                } else if (proximo > num) {
                    break;
                } else {
                    anterior = atual;
                    atual = proximo;
                }
            }
        }

        if (pertence) {
            System.out.println(num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println(num + " não pertence à sequência de Fibonacci.");
        }

    }

}
