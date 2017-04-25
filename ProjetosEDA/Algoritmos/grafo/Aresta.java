package grafo;

public class Aresta {
	private int u = 0;
	private int v = 0;
	private int custo = 0;

	/*
	 * As variáveis v e u guardam os valores dos vértices
	 * ligados por uma aresta, e a variável w representa o 
	 * peso dessa aresta.
	 */

	public Aresta(int u, int v, int custo){
		this.u = u;
		this.v = v;
		this.custo = custo;
	}

	public int getU() {
		return u;
	}

	public void setU(int u) {
		this.u = u;
	}

	public int getV() {
		return v;
	}

	public void setV(int v) {
		this.v = v;
	}
	
	public int getCusto() {
		return custo;
	}

	public void setCusto(int custo) {
		this.custo = custo;	
	}	
}
