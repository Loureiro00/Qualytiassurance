package entradaesaida;

import java.util.Scanner;

public class ImparPar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n1;
		Scanner ler= new Scanner(System.in);
		System.out.print(" Digite um numero : ");
		n1= ler.nextInt();
		
		    if (n1%2==0) 
    		System.out.println( n1+  ( "  , é par ") );
		    
		    else 
		    	System.out.print(  n1+ (" , É ímpar ") );
        
			
		ler.close();
				
		


		
		
		
		
		
		
		
		
		
		ler.close();

	}

}
