import java.util.Scanner;
public class Licaozinha {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int idade, i, f1, f2, f3, f4, f5;
		double h1,h2,h3,h4,h5;
		
		f1 = 0;
		f2 = 0;
		f3 = 0;
		f4 = 0;
		f5 = 0;
		
		
		i=1;
		while ( i <= 10) {
		System.out.println("Digite a sua Idade");
		idade = ler.nextInt();
		
		if (idade <= 15) {
		   f1 = f1 +1 ;
		   
		}else if (idade <= 30) {
			f2 = f2 +1;
		}else if (idade <= 45) {
			f3 = f3 +1;
		}else if (idade <= 60) {
			f4 = f4 +1;
		}else if (idade >= 61) {
			f5 = f5 +1;
		}
		 i++;
		}
		
		
		h1 = (f1 * 100)/10;
		h2 = (f2 * 100)/10;
		h3 = (f3 * 100)/10;
		h4 = (f4 * 100)/10;
		h5 = (f5 * 100)/10;
		
		System.out.println("Faixa Etaria 1 tem " +f1+ "de Pessoas que Corresponde a "+h1+"% do Total");
		System.out.println("Faixa Etaria 2 tem " +f2+ "de Pessoas que Corresponde a "+h2+"% do Total");
		System.out.println("Faixa Etaria 3 tem " +f3+ "de Pessoas que Corresponde a "+h3+"% do Total");
		System.out.println("Faixa Etaria 4 tem " +f4+ "de Pessoas que Corresponde a "+h4+"% do Total");
		System.out.println("Faixa Etaria 5 tem " +f5+ "de Pessoas que Corresponde a "+h5+"% do Total");
		
	}
}
		