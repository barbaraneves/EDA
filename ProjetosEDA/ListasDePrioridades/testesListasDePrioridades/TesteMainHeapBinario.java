package testesListasDePrioridades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import listasDePrioridades.HeapMaximo;;

public class TesteMainHeapBinario {
	
	public static void main(String[] args) {
		
		/*
		 * Testes feitos instaciando e usando os métodos apenas 
		 * para analisar o funcionamento da classe.
		 */
		
		HeapMaximo heapMax = new HeapMaximo(50);
		List<Integer> lista3 = new ArrayList<>();
		
		Random numAleatorios = new Random(19700621);
		
		for(int i = 1; i <= 10; i++){
			lista3.add(numAleatorios.nextInt(51));
		}
		
		heapMax.construir(lista3);
		heapMax.mostrarHeap();
		
		System.out.println("Valor de máxima prioridade: " + heapMax.getMaximaPrioridade() + ".\n");
		
		int valorRemovido1 = heapMax.remove();
		System.out.println("Valor removido: " + valorRemovido1 + ".\n");
		
		heapMax.mostrarHeap();
		
		heapMax.inserir(1);
		heapMax.inserir(50);
		heapMax.mostrarHeap();
		
		System.out.println("Valor de máxima prioridade: " + heapMax.getMaximaPrioridade() + ".\n");
		
		heapMax.alterarPrioridade(14, 56);
		heapMax.mostrarHeap();
		System.out.println("Valor de máxima prioridade: " + heapMax.getMaximaPrioridade() + ".\n");
	

		int valorRemovido2 = heapMax.remove();
		System.out.println("Valor removido: " + valorRemovido2 + ".\n");
		
		heapMax.mostrarHeap();
	}
}