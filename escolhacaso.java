package entradaesaida;

import java.util.Scanner;

public class escolhacaso{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1, n2, ok;
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro numero: ");
		n1=ler.nextInt();
		System.out.print("Digite o Segundo numero: ");
		n2=ler.nextInt();
		
		System.out.println(" |\n 1-soma\n | 2-subtração\n | 3-divisão\n | 4-multiplicação");
		System.out.print( " |  \nEscolha : " );
		ok=ler.nextInt();
		
		switch(ok)
		{
		case 1:
			System.out.println(" | A soma é:" +(n1+n2));
			break;
		case 2:
			System.out.println(" | A subtração é:" +(n1-n2));
			break;
		case 3:
			if(n2==0)
			System.out.println("Erro");
			else
				System.out.println(" |  A divisão é: " +(n1/n2));
			break;
		case 4:
			System.out.println(" | A Multiplição é:" +(n1*n2));
			break;
		
	   default:
		
			System.out.println("Opção invalida");
			
			ler.close();
		}
		
		
		
		
		

	}

}
