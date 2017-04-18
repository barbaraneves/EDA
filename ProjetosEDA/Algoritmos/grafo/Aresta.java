package grafo;

public class Aresta {
	private int u = 0;
	private int v = 0;
	private int w = 0;

	/*
	 * As variáveis v e u guardam os valores dos vértices
	 * ligados por uma aresta, e a variável w representa o 
	 * peso dessa aresta.
	 */
	
	public Aresta(int u, int v, int w) {
		this.u = u;
		this.v = v;
		this.w = w;
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

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}
}
