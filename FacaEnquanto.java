package repetição;

import java.util.Scanner;

public class FacaEnquanto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int n;
		
		Scanner ler = new Scanner(System.in);
		
		do
		{
			System.out.println("Escolha uma tabuada do 1 o 10 : ");
			n=ler.nextInt();
			System.out.println("Tabuada do "+n);
			
			for(int x=1;x<=10;x++)
				System.out.println(n+" X "+x+"="+n*x);
		}
		while(n>0 && n<=10);
		System.out.println("Numero Invalido, burro!");
		
		ler.close();

	}

}
