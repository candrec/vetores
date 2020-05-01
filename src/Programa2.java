import java.util.Locale;
import java.util.Scanner;

import entidades.Produto;

public class Programa2 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		Produto[] vect = new Produto[n];
		
		for(int i=0;i<vect.length;i++) {
			sc.nextLine();
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			vect[i] = new Produto(nome,preco);
		}
		
		double soma=0;
		
		for(int i=0;i<vect.length;i++) {
			soma += vect[i].getPreco();
		}
		
		double media = soma/vect.length;
		
		System.out.printf("Preço médio: %.2f%n",media);
		sc.close();
	}

}
