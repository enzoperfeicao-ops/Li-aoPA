package pa.doWhile;

import java.util.Scanner;

public class continuacao {

	public static void main(String[] args) {
	int i = 2;
	double n1, n2, media;
	Scanner ler = new Scanner(System.in);
	do {
		System.out.println("Entre com a nota 1");
		n1 = ler.nextDouble();
		System.out.println("Entre com a nota 2");
		n2 = ler.nextDouble();
		media = (n1+n2)/2;
		System.out.println("Media = "+media);
		System.out.println("\n Deseja continuar? 1-Sim / 2-Não");
		i=ler.nextInt();
	}while(i==1);
	ler.close();
	}

}
