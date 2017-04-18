package grafo;

public class Grafo {
	private int n = 0;
	private int m = 0;
	private Aresta arestas[] = null;
	
	//Fazer um método lá em baixo que cria uma aresta e adiciona na lista.
	
	/*
	 * n representa a quantidade de vértices do grafo.
	 * Um grafo também possui uma vetor de arestas, 
	 * e a quantidade de arestas que ele possui (dada por m).
	 */
	
	public Grafo(int n, int m) {
		this.n = n;
		this.m = m;
		arestas = new Aresta[m];
	}

	public int getN() {
		return n;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int getM() {
		return m;
	}

	public void setM(int m) {
		this.m = m;
	}

	public Aresta[] getArestas() {
		return arestas;
	}
	
	
	//Analisar esse método.
	public Aresta getAresta(int posicao){
		for(Aresta aresta : arestas){
			if(aresta == arestas[posicao]){
				return aresta;
			}
		}
		return null;
	}

	public void setArestas(Aresta[] arestas) {
		this.arestas = arestas;
	}
	
	public int sizeArestas(){
		int cont = 0;
		
		for(Aresta aresta : arestas){
			cont++;
		}
		return cont;
	}
}
