import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		int i = 1, numero, atual = 0, anterior = 1,proximo;
		
		System.out.println();
		numero = ler.nextInt();
		
		while(i <= numero) {
			proximo = atual + anterior;
			atual = anterior;
			anterior = proximo;
			System.out.println(atual);
			i++;
			
					
		}

	}

}
