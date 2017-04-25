package algoritmos;

import java.util.ArrayList;
import java.util.List;

import conjuntosDisjuntos.ConjuntosDisjuntos;
import grafo.*;

public class ArvoreGeradoraMinima {
	
	public List<Aresta> kruskal(Grafo g){
		List<Aresta> solucao = new ArrayList<Aresta>();
		ConjuntosDisjuntos conj = new ConjuntosDisjuntos(g.getQtdVertice());
		
		for(int i = 0; i < g.getQtdVertice(); i++){
			conj.makeSet(i);
		}
		
		g.quickSort(0, g.getArestas().length - 1);
		
		for(int i = 0; i < g.getQtdAresta(); i++){
			Aresta a[] = g.getArestas();
			if(conj.findSetFast(a[i].getV()) != conj.findSetFast(a[i].getU())){
				solucao.add(a[i]);
				conj.union(a[i].getV(), a[i].getU());
			}
		}
		return solucao;
	}
	
	public double getCusto(List<Aresta> solucao){
		double custo = 0;
		for(Aresta aresta : solucao){
			custo += aresta.getCusto();
		}
		return custo;	
	}
}
