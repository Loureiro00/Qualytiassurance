package pedrinhodev;

import java.util.Scanner;

public class ExercicioQa10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double salariofixo, comisão = 0.05, valordevenda, salariofinal, carrosvendidos;
        
		Scanner ler = new Scanner(System.in);
		System.out.println("Escreva o seu salario fixo : ");
		salariofixo = ler.nextDouble();
		
		
		System.out.println(" Escreva o total de carros vendidos : ");
		
		carrosvendidos = ler.nextDouble();
		System.out.println(" Escreva o total de  de vendas : ");
		{
			valordevenda = ler.nextDouble();

			if (valordevenda <= 0)

				System.out.println(" O seu salairo é de  R$ " + salariofixo);

			salariofinal = (comisão * valordevenda) + salariofixo;

			System.out.println(" Seu salario final é de R$ :  " + salariofinal);

			ler.close();

		}

	}
}
