package algoritmos;

import grafo.Aresta;
import grafo.Grafo;
import grafo.ListaAdjacencia;
import listasDePrioridades.HeapMinimo;

public class Dijkstra {
	private int origem;
	private int ant[] = null;
	private int d[] = null;
	private int vertices[] = null;
	
	public void execucao(Grafo g){
		int x = g.getQtdVertice();
		d = new int[x];
		ant = new int [x];
		vertices =  new int[x];
		//Inicializao Integer.MAX_VALUE
		inicializacao(x, origem);
		
		HeapMinimo Q = new HeapMinimo(g.getQtdVertice());
		Q.construir(vertices);
		
		while(!Q.isEmpty()){
			int u = Q.remove();
			ListaAdjacencia adj = g.getAdj()[u];
			adj.inicializarIterator();
			while(adj.hasNext()){
				Aresta a = adj.next();
				int v = (a.getU() == u ? a.getV() : a.getU());
				relaxamento(adj, u, v);
			}
		}
	}
	
	public void inicializacao(int v, int s){
		for (int u = 0; u < v; u++){
			ant[u] = -1;
			d[u] = Integer.MAX_VALUE;
			vertices[u] = u;
		}
		d[s] = 0;
		ant[s] = s;
	}
	
	public void relaxamento(ListaAdjacencia adj, int u, int v){
		if(d[v] > (d[u] + adj.next().getCusto())){
			ant[v] = u;
			d[v] = adj.next().getCusto() + d[u];
		}
		adj.next();
	}
}