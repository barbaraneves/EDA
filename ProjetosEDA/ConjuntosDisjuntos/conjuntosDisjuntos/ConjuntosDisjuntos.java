package conjuntosDisjuntos;

public class ConjuntosDisjuntos {
	
	private int pai[] = null;
	private int ordem[] = null;
	private int n = 0;
	
	public ConjuntosDisjuntos(int n){
		this.n = n;
		pai = new int[n + 1];
		ordem = new int[n + 1];
	}
	
	public void makeSet(int i){
		pai[i] = i;
		ordem[i] = 0;
	}
	
	public void makeSetAll(){
		for(int  i = 0; i < n; i++){
			makeSet(i);
		}
	}
	
	public int findSet(int v){
		if(v == pai[v])
			return v;
		
		return findSet(pai[v]);
	}
	
	public int findSetFast(int v){
		if(v == pai[v]){
			return v;
		}else{
			int paiV= findSetFast(pai[v]);
			pai[v] = paiV;
			return paiV;
		}
	}
	
	public void linkSet(int u, int v){
		pai[v] = u;
		
	}
	
	public void linkSetFast(int u, int v){
		if(ordem[v] < ordem[u]){
			pai[v] = u;
		}else{
			pai[u] = v;
			if(ordem[v] == ordem[u])
				ordem[v]++;
		}
	}
	
	public void union(int v, int u){
		linkSet(findSet(v), findSet(u));
	}	
}