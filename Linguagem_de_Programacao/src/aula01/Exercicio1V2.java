package aula01;

import io.InOut;

public class Exercicio1V2 {
	public static void main(String[] args) {
		int num1, num2;
		
		num1 = InOut.leInt("primeiro numero");
		num2 = InOut.leInt("segundo numero");
		
		InOut.msgDeInformacao(
				"RESULTADO", "SOMA = " + (num1 + num2) + "\n" +
				"DIFERENCA = " + (num1 - num2) + "\n" +
				"MULTIPLICACAO = " + (num1 * num2) + "\n" +
				"DIVISAO = " + (num1 / num2)
				);
	}
}
