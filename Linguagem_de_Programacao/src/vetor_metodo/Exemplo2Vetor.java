package vetor_metodo;

import io.InOut;

public class Exemplo2Vetor{
	/*
	 * Faça um programa para criar três vetores de inteiros de 5 posições, 
	 * preencher dois desses vetores, preencher o terceiro vetor com a soma 
	 * dos dois primeiros e mostrar os três na tela.
	 */
	
	public static void main(String[] args){
		int[] vet1 = new int[10];
		int[] vet2 = new int[10];
		int[] vetSoma = new int[10];

		lerAleatorio(vet1);
		lerAleatorio(vet2);
		vetSoma = soma(vet1, vet2);
		imprimir (vet1);
		imprimir(vet2);
		imprimir (vetSoma);
	}

	// metodo para ler um vetor de inteiro
	public static void ler(int[] vet){
		for (int i=0; i<vet.length; i++){
			vet[i] = InOut.leInt("vetor[" + i + "] = ");
		}
	}
	
	// metodo para preencher um vetor de inteiro com numeros aleatorios
	public static void lerAleatorio(int[] vet){
		for (int i=0; i<vet.length; i++){
			vet[i] = (int)(Math.random()*50+1);
		}
	}

	// metodo para somar dois vetores
	private static int[] soma(int[] v1, int[] v2){
		int[] vetSoma = new int[v1.length];
		for (int i=0; i<v1.length; i++) {
			vetSoma[i] = v1[i] + v2[i];
		}
		return vetSoma;
	}

	// metodo para imprimir um vetor
	public static void imprimir(int[] vet){
		System.out.print("| ");
		for (int i=0; i<vet.length; i++){
			System.out.print(vet[i]+ " | ");
		}
		System.out.println();
	}


}





