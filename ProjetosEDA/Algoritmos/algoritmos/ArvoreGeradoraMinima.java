package algoritmos;

import java.util.ArrayList;
import java.util.List;

import conjuntosDisjuntos.ConjuntosDisjuntos;
import grafo.*;

public class ArvoreGeradoraMinima {
	
	//Implementar o quickSort com uma pequena alteração:
		//if(vetor[j].get(w) < pivo)
		//		troca(vetor[j], vetor[i])
	
	private void quickSort(Aresta[] vetor, int inicio, int fim){
		int pivo = (inicio + fim)/2;
		int i = inicio;
		int f = fim;
		
		while(i <= f){
			while(vetor[i].getW() < pivo){
				i++;
			}
			while(vetor[f].getW() > pivo){
				f--;
			}
			if(i <= f){
				Aresta aux = vetor[i];
				vetor[i] = vetor[f];
				vetor[f] = aux;
				i++;
				f--;
			}
		}
		if(fim - i >= 1){
			quickSort(vetor, i, fim);
		}
		if(f - inicio >= 1){
			quickSort(vetor, inicio, f);
		}
	}
	
	public List<Aresta> Kruskal1(Grafo g){
		List<Aresta> solucao = new ArrayList<Aresta>();
		
		ConjuntosDisjuntos conjDisjunto = new ConjuntosDisjuntos(g.getN());
		
		for(int i = 0; i < g.getN(); i++){
			conjDisjunto.makeSet(i);
		}
		
		quickSort(g.getArestas(), 0, (g.sizeArestas() - 1));
		
		for(int i = 0; i < g.getM(); i++){
			Aresta a = g.getAresta(i);
			
			if(conjDisjunto.findSet(a.getV()) != conjDisjunto.findSet(a.getU())){
				solucao.add(a);
				conjDisjunto.union1(a.getV(), a.getU());
				
			}
		}
		return solucao;
	}
	
	//Fazer mais os métodos Kruskal modificando o union de cada.
	
	//Implementar a classe custo que conta os elem. presentes na lista solucao.

}
