package repetição;

import java.util.Scanner;

public class Ex1000ao1999 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
               
		
		Scanner ler= new Scanner(System.in);
			
				for(int contador =1000; contador<=1999;contador++) 
				{
					
					if(contador%11==5)
					System.out.println(contador);
					
					
				}
			
	ler.close();
	}
	

}
