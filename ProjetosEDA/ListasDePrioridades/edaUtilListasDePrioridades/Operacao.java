package edaUtilListasDePrioridades;

/**
 * Classe respons�vel por armazenar uma opera��o que ser� realizada na lista de prioridade.
 * O atributo id cont�m o identificador da opera��o sendo as seguintes possibilidades: Inser��o: I; Remo��o: R; Altera��o: A; S: Sele��o.
 * O atributo valor ter� o valor a ser inserido, o valor que foi removido, o valor que ser� alterado e o valor com maior prioridade, respectivamente para as opera��es de inser��o, remo��o, altera��o e sele��o.
 * O atributo novoValor ter� o novo valor da prioridade para a opera��o de altera��o. Para as demais opera��es ele ter� valor 0(zero).  
 * @author fabio
 *
 */
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
