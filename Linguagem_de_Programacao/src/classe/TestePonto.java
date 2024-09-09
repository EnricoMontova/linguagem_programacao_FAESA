package classe;

import java.util.ArrayList;

public class TestePonto{

	public static void main(String[] args){
		ArrayList<Ponto> vetor = new ArrayList<Ponto>();
		Ponto p = new Ponto(1, 0);
		vetor.add(p); // add : inserir no vetor
		Ponto p2 = new Ponto();
		vetor.add(p2);
		
		for (int i=0; i<vetor.size(); i++){// size : quantidade de elementos do vetor
			System.out.println("Ponto "+i+" = "+vetor.get(i));// get(i) : acessa a posicao i
		}
		
		// para modificar o x do ponto(0) para -2
		vetor.get(0).setX(-2);
		System.out.println("Ponto 0 novo "+vetor.get(0));
		
		double dist = vetor.get(0).distancia(vetor.get(1));
		Ponto medio = vetor.get(0).pontoMedio(vetor.get(1));
		System.out.println("distancia = "+dist);
		System.out.println("Ponto Medio = "+medio);
	}
}
