package Lista10;

import java.util.Scanner;

public class Exercicio2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite um numero de 1 a 10 : ");
		int numero = sc.nextInt();

		int contadora = 0;
		while (contadora <= 9) {

			contadora++;

			System.out.println(+numero + " x " + contadora + " = " + numero * contadora);
		}

		sc.close();

	}

}
