package entradaesaida;

import java.util.Scanner;

public class Requisitosparque {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int idade;
		double altura;
			Scanner ler = new Scanner(System.in);
			
				System.out.print("   Digite sua idade : ");
				idade = ler.nextInt();
				System.out.print("   Digite sua altura : " );
				altura= ler.nextDouble();
				
				if (idade>=18 && altura>=1.60)
					System.out.print( "  Pode entrar ! ");
				else 
					System.out.println(" Se fodeu, volta pra casa " );
				
				ler.close();
				
				
				

	}

}
