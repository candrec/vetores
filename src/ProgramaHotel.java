import java.util.Locale;
import java.util.Scanner;

import entidades.Quarto;

public class ProgramaHotel {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos quartos serão alugados: ");
		int hospedes = sc.nextInt();
		Quarto[] vetor = new Quarto[10];
		
		for(int i=0;i<hospedes;i++) {
			sc.nextLine();
			System.out.println("\nAluguel #"+(i+1));
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("E-mail: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int j = sc.nextInt();
			vetor[j] = new Quarto(nome,email);
		}
		
		System.out.println("\n,Quartos Alugados:");
		for(int i=0;i<vetor.length;i++) {
			if(vetor[i] != null) {
				System.out.print(i+": "+vetor[i].toString());
			}
		}
		sc.close();
	}

}
