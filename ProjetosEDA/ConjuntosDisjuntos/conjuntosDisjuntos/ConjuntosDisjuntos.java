package conjuntosDisjuntos;

import java.util.Random;
import java.util.Vector;

public class ConjuntosDisjuntos {
	private int pai[] = null;
	private int ordem[] = null;
	//O valor de n se refere ao tamanho.
	private int n = 0;
	
	public ConjuntosDisjuntos(int n) {
		pai = new int[n];
		ordem = new int[n];
		this.n = n;
	}
	
	public void makeSet(int i){
		pai[i] = i;
		ordem[i] = 0;
	}
	
	public void makeSetAll(){
		for(int i = 0; i < n; i++){
			makeSet(i);
		}
	}
	
	public int findSetAux(int v){
		if(v == pai[v]){
			return v;
		}
		return findSetAux(pai[v]);
	}
	
	public int findSet(int v){
		if(pai[v] != v){
			pai[v] = findSet(pai[v]);
			return pai[v];
		}
		return v;
	}
	
	private void linkSetAux(int v, int u){
		pai[v] = u;
	}
	
	private void linkSet(int v, int u){
		if(ordem[v] < ordem[u]){
			pai[v] = u;
		}
		else{
			if(ordem[v] == ordem[u]){
				ordem[v]++;
			}
			pai[u] = v;
		}
	}
	
	public void union(int v, int u){
		linkSet(findSet(v), findSet(u));
	}
	
	public void mostrarConjuntoDisjunto(){
		System.out.println("Quantidade de elementos: " + n + ", e elem.: ");
		
		for(int i = 0; i < n; i++){
			System.out.print(pai[i] + " ");
		}
		System.out.println("\n");
	}
}
