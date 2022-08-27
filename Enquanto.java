package repetição;

import java.util.Scanner;

public class Enquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double n1,n2;
		
		Scanner ler = new Scanner(System.in);
		
			System.out.print(" Digite o Primeiro Numero : ");
			n1= ler.nextDouble();
			
			System.out.print(" Digite o Segundo Numero : ");
			n2= ler.nextDouble();
			
			while(n2!=0)
			{
				System.out.println(" O resultado da divisão é " +n1/n2);
				
				System.out.print(" Digite o Primeiro Numero : ");
				n1= ler.nextDouble();
				
				System.out.println(" Digite o Segundo Numero : ");
				n2= ler.nextDouble();
				
			}
				System.out.println("\n Não é possível dividir por Zero ");
				ler.close();
               

	}

}
