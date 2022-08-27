package entradaesaida;

import java.util.Scanner;

public class Ordemcrescente {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n1,n2,n3;
		Scanner ler = new Scanner(System.in);
		
		System.out.print(" insira um numero :");
		n1=ler.nextInt();
		System.out.print(" insira um numero :");
		n2=ler.nextInt();
		System.out.print(" insira um numero :");
		n3=ler.nextInt();
		
		
		if (n1<n2) {
			if (n2<n3) {
				System.out.print(n1+","+n2+","+n3);
				
			}
			else if (n1<n3) {
				System.out.print(n1+","+n3+","+n2);
				
			} else {
				System.out.print(n3+","+n1+","+n2);
				
			}
		}
		else if (n2<n3) {
			if (n1<n3) {
				System.out.print(n2+","+n1+","+n3);
				
			} else {
				System.out.print(n2+","+n3+","+n1);
				
			}
		} else {
			System.out.print(n3+","+n2+","+n1);
			
			ler.close();
		}
		
		
		
		 
		
		 
		
		
	
	}

}
