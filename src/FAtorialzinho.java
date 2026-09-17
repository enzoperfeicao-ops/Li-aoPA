import java.util.Scanner;

public class FAtorialzinho {
    public static void main(String[] args) {

        Scanner ler = new Scanner(System.in);

        System.out.print("Digite um número inteiro: ");
        int numero = entrada.nextInt();

        long fatorial = 1;
        int contador = numero;

        while (contador > 1) {
            fatorial = fatorial * contador;
            contador--;
        }

        System.out.println("O fatorial de " + numero + " é " + fatorial);

        ler.close();
    }
}
