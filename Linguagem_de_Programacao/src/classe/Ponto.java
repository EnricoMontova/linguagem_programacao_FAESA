package classe;

public class Ponto{
	// ATRIBUTOS SAO AS PARTES QUE COMPOEM O OBJETO
	// E ELES DEVEM SER private
	
	private double x, y;
	
	// construtor
	// o construtor deve ser public ou protected, sem tipo de retorno
	// e o nome dele TEM que ser o nome da classe
	
	public Ponto (double x, double y){
		this.x = x;  //this referencia o atributo
		this.y = y;
	}
	
	public Ponto (){
		this.x = 0;  //this referencia o atributo
		this.y = 0;
	}

	// metodos de acesso (gets)
	// metodos de modificacao (sets)
	public double getX(){
		return x;
	}

	public void setX(double x){
		this.x = x;
	}

	public double getY(){
		return y;
	}

	public void setY(double y){
		this.y = y;
	}
	
	public String toString (){
		return ("("+this.x+", "+this.y+")");
	}
	
	/*
	 * calcular e retornar 
	 * a distância entre o ponto objeto da 
	 * classe o outro ponto parâmetro
	 */
	public double distancia (Ponto outro){
		double dx = outro.getX() - this.getX(); // delta x
		double dy = outro.getY() - this.getY(); // delta y
		double dist = Math.sqrt(dx*dx + dy*dy);  // distancia
		return dist;
	}
	
	/*
	 * pontoMedio que vai calcular e retornar o ponto médio 
	 * entre o ponto objeto da classe o outro ponto parâmetro.
	 */
	public Ponto pontoMedio (Ponto outro){
		double px = (outro.getX()+this.getX())/2;
		double py = (outro.getY()+this.getY())/2;
		Ponto temp = new Ponto(px, py);// criei o ponto que sera retornado
		return temp;
	}
}
	
	
	
	
	
	
	
	
	
	
	