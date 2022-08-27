package repetição;

import java.util.Scanner;

public class ParImpar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int par=0,impar=0,n1;
		
		Scanner ler= new Scanner(System.in);
		
				
		for(int x=1;x<=10;x++) 	
		{
			
			
				System.out.print("Digite um numero : ");
				n1=ler.nextInt();
			
			if (n1%2 != 0) 
			{
				impar++;
			}
			    
			    else 
			    {
			    	par++;
			    }
			
		}
		 System.out.println( "Numeros ímpares "+impar);
		 System.out.println( "Numeros ímpares "+par);
    		
			
		ler.close();
	}

}
