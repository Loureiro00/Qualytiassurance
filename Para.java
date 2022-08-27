package repetição;

import java.util.Scanner;

public class Para {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		int n,contador,x;
		Scanner ler = new Scanner(System.in);
		System.out.println(" Digite um numero : ");
		n=ler.nextInt();
		ler.close();
		System.out.println("Tabuada do 7 \n");
		for( contador =1; contador<10;contador++)
		{
			System.out.println(7+ " X "+contador+" = "+7*contador);
		}

		System.out.println("\n");
		System.out.println("Tabuada do 7 invertida \n");
		for (contador =10; contador>=1;contador--)
			
		System.out.println(7+ " X "+contador+" = "+7*contador);
		
		
		System.out.println("\n\n tabuada do "+n);
	
		for (contador =1; contador<=10;contador++)
			
	    System.out.println (n+" X "+contador+"="+n*contador);
		
	    for(x=2;x<10;x++);
	    {
	    	System.out.println("\nTabuada do "+x);
	    	
	    }
		
			ler.close();
		
	}

}
