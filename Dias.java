package entradaesaida;

import java.util.Scanner;

public class Dias {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int mes, anos, idade, conta1;
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite a sua idade: ");
		idade = ler.nextInt();
		System.out.print("Digite seus meses: ");
		mes = ler.nextInt();
	
		// conta1 =

		conta1 = idade * 365;
		mes = (conta1 / 30);
		anos = conta1 / 365;
             
 		System.out.print("anos = " + anos);
		System.out.print(" | meses = " + mes);
		System.out.print(" | total de dias =  " + conta1);

		ler.close();
	}

}
