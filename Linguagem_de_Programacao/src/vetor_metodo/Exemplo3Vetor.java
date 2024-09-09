package vetor_metodo;
/*
 * Faça um programa para criar dois vetores de inteiros de 5 posições, 
 * preencher esses vetores, fazer o produto escalar desses vetores e 
 * mostrar os dois e o produto escalar na .
 */

public class Exemplo3Vetor{
	/*
	 * Faça um programa para criar três vetores de inteiros de 5 posições, 
	 * preencher dois desses vetores, preencher o terceiro vetor com a soma 
	 * dos dois primeiros e mostrar os três na tela.
	 */
	
	public static void main(String[] args){
		int[] vet1 = new int[5];
		int[] vet2 = new int[5];
		int prodEscalar;

		Exemplo2Vetor.ler(vet1);
		Exemplo2Vetor.ler(vet2);
		prodEscalar = produto(vet1, vet2);
		Exemplo2Vetor.imprimir (vet1);
		Exemplo2Vetor.imprimir(vet2);
		System.out.println("Produto Escalar = "+ prodEscalar);
	}

	// metodo para somar dois vetores
	private static int produto(int[] v1, int[] v2){
		int soma =0;
		for (int i=0; i<v1.length; i++){
			soma += v1[i] * v2[i];
		}
		return soma;
	}

}



