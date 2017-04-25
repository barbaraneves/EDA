package edaUtilAlgoritmos;

public class Operacao {
	private String id;
	private Integer valor;
	private Integer novoValor;
	
	public Operacao(String id, Integer valor, Integer novoValor) {
		this.id = id;
		this.valor = valor;
		this.novoValor = novoValor;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Integer getValor() {
		return valor;
	}
	public void setValor(Integer valor) {
		this.valor = valor;
	}
	public Integer getNovoValor() {
		return novoValor;
	}
	public void setNovoValor(Integer novoValor) {
		this.novoValor = novoValor;
	}
}
