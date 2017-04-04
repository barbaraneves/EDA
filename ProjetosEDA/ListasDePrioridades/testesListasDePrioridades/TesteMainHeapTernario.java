package testesListasDePrioridades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import listasDePrioridades.*;

public class TesteMainHeapTernario {
	public static void main(String[] args) {
		HeapTernario heapTer = new HeapTernario(50);
		List<Integer> lista = new ArrayList<>();
		
		Random gerador = new Random(19700621);
		
		for(int i = 1; i <= 10; i++){
			lista.add(gerador.nextInt(51));
		}
		
		heapTer.construir(lista);
		heapTer.mostrarHeapTernario();
		
		System.out.println("Valor de maior prioridade: " + heapTer.getMaximaPrioridade() + "\n");
		
		int valorRemovido = heapTer.remove();
		System.out.println("Valor removido: " + valorRemovido + "\n");
		heapTer.mostrarHeapTernario();
		
		heapTer.inserir(50);
		heapTer.inserir(16);
		heapTer.inserir(92);
		heapTer.mostrarHeapTernario();
		
		heapTer.alterarPrioridade(26, 100);
		heapTer.mostrarHeapTernario();
	}
}