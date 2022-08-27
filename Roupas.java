package entradaesaida;

import java.util.Scanner;

public class Roupas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         int n1;
         
         Scanner ler= new Scanner(System.in);
         
         
        System.out.println(" Digite sua idade :  " );
     	n1=ler.nextInt();
        if (n1>=1 && n1<=14)
    		System.out.println( "Infantil" );
        
    		 else if (n1>=15  && n1<=17)
    		System.out.print ( " Juvenil " );
    		
    		 else if (n1>=18 && n1<=25)
    		System.out.print(" Adulto");
  
         
         	
        		 
        		 
       ler.close();
        
		
	}

}
