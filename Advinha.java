import java.util.Random;
import java.util.Scanner;

public class Advinha {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        int numeroSecreto = random.nextInt(100) + 1;
        int tentativasMaximas = 10;
        int tentativas = 0;
        boolean acertou = false;

        System.out.println("Bem Vindo ao Jogo de Adivinhação!");
        System.out.println("Adivinhe o número entre 1 e 100.");
        System.out.println("Você tem " + tentativasMaximas + " tentativas.");

        while (tentativas < tentativasMaximas && !acertou) {
            System.out.print("Digite seu palpite: ");
            int palpite = scanner.nextInt();
            tentativas++;

            if (palpite < 1 || palpite > 100) {
                System.out.println("Por favor, digite um número entre 1 e 100.");
                tentativas--; 
                continue;
            }

            if (palpite < numeroSecreto) {
                System.out.println("O número é maior!");
            } else if (palpite > numeroSecreto) {
                System.out.println("O número é menor!");
            } else {
                acertou = true;
                System.out.println("Parabéns! Você adivinhou o número em " + tentativas + " tentativas.");
            }
        }

        if (!acertou) {
            System.out.println("Você perdeu! O número era " + numeroSecreto + ".");
        }

        scanner.close();
    }
}