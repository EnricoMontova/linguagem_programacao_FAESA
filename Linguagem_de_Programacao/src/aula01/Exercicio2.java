package aula01;

import io.InOut;

public class Exercicio2{
	
	public static void main(String[] args){
		int[] vetor = new int[3];
		
		for(int i=0; i<vetor.length; i++){
			vetor[i] = InOut.leInt("vetor["+i+"]");
		}
		System.out.println("| Vetor criado:");
		for(int i=0; i<vetor.length; i++){
			System.out.println(vetor[i] + " | ");
		}
	}
}

