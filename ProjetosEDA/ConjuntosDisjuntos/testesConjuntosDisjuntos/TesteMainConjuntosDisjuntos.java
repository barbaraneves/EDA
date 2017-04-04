package testesConjuntosDisjuntos;

import conjuntosDisjuntos.ConjuntosDisjuntos;

public class TesteMainConjuntosDisjuntos {
	
	public static void main(String[] args) {
		ConjuntosDisjuntos conjDisjunto1 = new ConjuntosDisjuntos(10);
		
		conjDisjunto1.makeSetAll();
		conjDisjunto1.mostrarConjuntoDisjunto();
		
		int paiDeTodos = conjDisjunto1.findSet(4);
		System.out.println("Pai de todos é o elemento " + paiDeTodos + ".");
		
		ConjuntosDisjuntos conjDisjunto2 = new ConjuntosDisjuntos(10);
		
		for(int i = 0; i < 10; i++){
			conjDisjunto2.makeSet(i);
		}
		
		conjDisjunto2.mostrarConjuntoDisjunto();
		
		conjDisjunto1.union(paiDeTodos, 0);		
	}
}
