package vetor_metodo;
import io.InOut;
public class Exemplo1Vetor{
/*
 * Faça um programa para criar um vetor de inteiros de 3 posições, 
 * preencher esse vetor e mostrá-lo na tela.
 */
	public static void main(String[] args){
		// criar o vetor
		int[] vetor; // declarando um vetor
		vetor = new int[3]; // instanciando um vetor de 3 posicoes
		
		// inserir os dados (ler valores)
		for(int i=0; i<vetor.length; i++){
			// vetor.length retorna o tamanho do vetor
			vetor[i] = InOut.leInt("vetor["+i+"]");// lendo cada valor
		}
		
		// mostrar na tela
		for(int i=0; i<vetor.length; i++){
			System.out.print(vetor[i]+"  |  ");
		}
	}
}



