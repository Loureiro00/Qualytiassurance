package entradaesaida;

import java.util.Scanner;

public class estruturadecisao {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n1;
		Scanner ler = new Scanner (System.in);
		
			System.out.println("Digite um numero : ");
			n1 = ler.nextInt();
			
			if (n1>=0)
				System.out.print("Positivo");
			else

				System.out.print("Negativo");
		

       ler.close();
	}

}
