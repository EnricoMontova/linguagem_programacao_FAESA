package aula01;

import io.InOut;

public class Exercicio3 {
	/*
	* Ler dois vetores, armazenar a soma deles em um
	* terceiro vetor e imprimir os 3 na tela
	*/
	
	public static void main(String[] args) {
		int[] vetor1 = new int[3];
		int[] vetor2 = new int[3];
		int[] vetSoma = new int[3];
		
		leVetor(vetor1);
		leVetor(vetor2);
		//vetSoma = soma(vetor1, vetor2);
		//imprimir(vetor1);
		//imprimir(vetor2);
		//imprimir(vetSoma);
	}
	
	public static void leVetor(int[] vet){
		for(int i=0; i<vet.length; i++){
			vet[i] = InOut.leInt("vet["+i+"]");
		}
	}
}
