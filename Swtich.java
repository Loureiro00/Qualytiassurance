package pedrinhodev;

import java.util.Scanner;

public class Swtich {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	Scanner sc = new Scanner(System.in);

		System.out.println(" Sistema Bancário Unipaulistana ");
		System.out.println();
		System.out.println(" Selecione a sua operação :");
		System.out.println("1- Saque");
		System.out.println("2- PIX");
		System.out.println("3- Saldo ");
		System.out.println("4-Tranferência");
		System.out.println("5-Empréstimo");
		System.out.println();

		int valor = sc.nextInt();

		switch (valor) {
		case 1:
			System.out.println(" Digite o numero da sua conta : ");
			int conta = sc.nextInt();
			System.out.println(" Digite A  senha da sua conta : ");
			int senha = sc.nextInt();
			System.out.println(" Digite o valor  do  saque : ");
			int saque = sc.nextInt();
			System.out.println(" Saque efetuado com sucesso !");
			break;

		case 2:
			System.out.println(" Digite o numero da sua conta : ");
			int contaPix = sc.nextInt();
			System.out.println(" Digite A da sua conta : ");
			int senhaPix = sc.nextInt();
			System.out.println(" Digite o valor  do  saque : ");
			int numeroContaDestino = sc.nextInt();
			System.out.println(" Pix efetuado com sucesso");
			break;
			
			

		}

		sc.close();
	}

}
