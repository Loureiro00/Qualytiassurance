package entradaesaida;

import java.util.Scanner;

public class Media7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double nota;
		Scanner ler = new Scanner(System.in);
		
			System.out.print( "Digite sua média final  : " );
			nota = ler.nextDouble();
			
		
			if(nota<5)
				System.out.print( "Reprovado" );
				
			else if (nota>=7)
				System.out.println(" Aprovado" );
				
			else 
					System.out.print("exame " );
					System.out.print (" \n Fim do Programa !");
					
			ler.close();
			
			
			
	

	}

}
