package entradaesaida;

import java.util.Scanner;

public class MediaDeNotas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double n1, n2, n3, n4, media;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digiete a Primeira nota : ");
		n1 = ler.nextDouble();
		System.out.print("Digite a Segunda Nota : ");
		n2 = ler.nextDouble();
		System.out.print("Digite a Terceira Nota : ");
		n3 = ler.nextDouble();
		System.out.print("Digite a Quarta nota : ");
		n4 = ler.nextDouble();
		media = (n1 + n2 + n3 + n4) / 4;
		System.out.println("\nA media é :" + media);
		ler.close();

	}

}
