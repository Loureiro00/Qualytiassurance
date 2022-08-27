package repetição;

import java.util.Scanner;

public class EnquantoPara {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner ler = new Scanner(System.in);
		
		System.out.println(" Escolha uma tabuada do 1 ou 10 : ");
		n= ler.nextInt();
		
		while(n>0 && n<10)
		{
			System.out.println("\nTabuada do "+n+"\n");
			
				for(int x=1;x<=10;x++)
					System.out.println(n+" x "+x+" = "+n*x);
				System.out.println(" Escolha uma tabuada do 1 ou 10 : \n");
				n= ler.nextInt();
				
		}

		System.out.println("Opção invalida!!!\nFim do programa ");
		ler.close();
	}

}
