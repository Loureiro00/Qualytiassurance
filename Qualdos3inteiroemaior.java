package entradaesaida;

import java.util.Scanner;

public class Qualdos3inteiroemaior {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1,n2,n3;
		Scanner cc= new Scanner(System.in);
		
		System.out.print("  |Escreva o primeiro numero : ");
		n1= cc.nextInt();
		System.out.print(" | Escreva o segundo numero : ");
		n2= cc.nextInt();
		System.out.print(" | Escreva o terceiro numero : ");
		n3= cc.nextInt();
		
	 		if (n1>n2 && n1>n3)
		System.out.print( "  | o maior numero é  " + n1);
		else if (n2>n1 && n2>n3)
		System.out.print ( " | o maior numero é  " + n2 );
		else if ( n3>n1 && n3>n2)
		System.out.print("   | o maior numero é  " +   n3);
		
		   
	   
		
	    cc.close();
		

	}

}
