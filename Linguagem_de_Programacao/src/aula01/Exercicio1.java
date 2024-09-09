package aula01;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		int num1, num2;
		
		try (Scanner entrada = new Scanner(System.in)) {
			System.out.println("prineiro numero: ");
			num1 = entrada.nextInt();
			System.out.println("segundo numero");
			num2 = entrada.nextInt();
		}
		
		System.out.println("SOMA = " + (num1 + num2));
		System.out.println("DIFERENCA = " + (num1 - num2));
		System.out.println("MULTIPLICACAO = " + (num1 * num2));
		System.out.println("DIVISAO = " + (num1 / num2));
	}

}
