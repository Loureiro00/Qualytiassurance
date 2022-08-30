package pedrinhodev;

import java.util.Scanner;

public class ExercicioQa9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner ler = new Scanner(System.in);
		double cf, ct, imp = 0.45, dis = 0.28, impf, disf;

		System.out.println(" Digite o custo de fábrica : ");
		cf = ler.nextDouble();
		impf = (imp * cf);
		disf = (dis * cf);

		ct = cf + impf + disf;

		System.out.println("O valor de fabrica do carro é de  : " + cf + "\nO custo com impostos  : " + impf
				+ "\nCom os custo de distribuicao : " + disf + " \nTotalizando o valor de  : " + ct);
		ct = ler.nextDouble();

		ler.close();

	}

}
