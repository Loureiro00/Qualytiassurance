package pedrinhodev;

import java.util.Scanner;

public class ExercicioQa8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
           
		Scanner ler = new Scanner(System.in);
		
		double salario,reajuste,salarioatual;
		
		System.out.println(" Digite seu salario atual : ");
		salario= ler.nextDouble();
		
			System.out.println("Digite o percentual de reajuste : ");
			reajuste= ler.nextDouble();
			
			reajuste = (reajuste/100)*salario;
			
			salarioatual= reajuste+salario;
			
			System.out.println(" Seu salairo atual é de : " +salarioatual );
	
	         ler.close();		
	}

}
