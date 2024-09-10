package veiculos;

/// Faça uma classe Veiculo que contenha:
public class Veiculo_base {
	/* Atributos:
	*	a. placa, modelo, problema (descrição do problema), valorDoServico.
	*/
	private String placa, modelo, problema;
    private double valorDoServico;
    
    /*
     *  Métodos
	 *	a. Um construtor vazio e um construtor recebendo valores iniciais.
     */
    
    /// Construtor vazio
    public Veiculo_base() {
        
        this.placa = "";
        this.modelo = "";
        this.problema = "";
        this.valorDoServico = 0.0;
    }
    
    /// Construtor recebendo valores iniciais
    public Veiculo_base (String placa, String modelo, String problema, double valorDoServico) {
    	this.placa = placa;
    	this.modelo = modelo;
    	this.problema = problema;
    	this.valorDoServico = valorDoServico;
    }
    
    /*
     * b. gets, sets, toString 
     */
    
    /// gets
    public String getPlaca() {
    	return placa;
    }
    
    public String getModelo() {
    	return modelo;
    }
    
    public String getProblema() {
    	return problema;
    }
    
    public double getValorDoServico() {
    	return valorDoServico;
    }
    
    /// sets
    public void setPlaca(String placa) {
    	this.placa = placa;
    }
    
    public void setModelo(String modelo) {
    	this.modelo = modelo;
    }
    
    public void setProblema(String problema) {
    	this.problema = problema;
    }
    
    public void setValorDoServico(double valorDoServico) {
    	this.valorDoServico = valorDoServico;
    }
    
    /// toString
    public String toString() {
    	return "Veiculo{" +
    			"placa ='"+ placa+"'\n" +
    			"modelo = "+modelo+"'\n" +
    			"problema = "+problema+"'\n" +
    			"valorDoServico = "+valorDoServico +
    			"}";
    }
    
}
