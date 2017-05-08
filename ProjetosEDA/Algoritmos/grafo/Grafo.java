package grafo;
	
	/*
	 * Um grafo possui uma vetor de arestas, 
	 * e a quantidade de arestas que ele possui.
	 */

public class Grafo {
	private Integer qtdVertice;
	private Integer qtdAresta;
	private Aresta arestas[];
	private ListaAdjacencia adj[];
	
	public Grafo(Integer a, Integer b){
		qtdVertice = a;
		qtdAresta = b;
	}

	public Integer getQtdVertice() {
		return qtdVertice;
	}

	public void setQtdVertice(Integer qtdVertice) {
		this.qtdVertice = qtdVertice;
	}

	public Integer getQtdAresta() {
		return qtdAresta;
	}

	public void setQtdAresta(Integer qtdAresta) {
		this.qtdAresta = qtdAresta;
	}
	
	public Aresta[] getArestas(){
		return arestas;
	}
	
	public void setArestas(Aresta[] arestas){
		this.arestas = arestas;
	}
	
	public void add (Aresta a){
		arestas[arestas.length] = a;
	}
	public void quickSort(int i, int j){
		if (i < j){
			int k = particiona(i , j);
			quickSort(i, k - 1);
			quickSort(k + 1, j);
		}
	}
	
	public int particiona(int i, int j){
		int pivo = j;
		int a = i - 1;
		for(int p = i; p < j; p++){
			if(arestas[p].getCusto() < arestas[pivo].getCusto()){
				a++;
				Aresta aux = arestas[p];
				arestas[p] = arestas[a];
				arestas[a] = aux;
			}
		}
		
		Aresta aux = arestas[a + 1];
		arestas[a + 1] = arestas[j];
		arestas[j] = aux;
		return a +1;
	}
	
	public ListaAdjacencia[] getAdj(){
		return adj;
	}
	
	public void setAdj(ListaAdjacencia[] adj){
		this.adj = adj;
	}
}
