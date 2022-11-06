package Lista10;

import java.util.Scanner;

public class Exercicio8 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int i = 1;
		int base = 1;
		int expoente = 1;
		int resultado = 1;

		System.out.println("Digite o valor da base : ");
		base = sc.nextInt();

		System.out.println("Digite o valor do expoente : ");
		expoente = sc.nextInt();

		for (i = 1; i <= expoente; i++) {
			resultado = resultado * base;
		}

		System.out.println("O resultado é " + base + " ^ " + expoente + " = " + resultado);

		sc.close();

	}
}
