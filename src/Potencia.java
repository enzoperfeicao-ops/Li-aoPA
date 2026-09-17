import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a base: ");
        double base = entrada.nextDouble();

        System.out.print("Digite o expoente: ");
        int expoente = entrada.nextInt();

        double resultado = 1;
        int contador = 0;

        do {
            resultado = resultado * base;
            contador++;
        } while (contador < expoente);

        System.out.println("Resultado: " + resultado);

        entrada.close();
    }
}