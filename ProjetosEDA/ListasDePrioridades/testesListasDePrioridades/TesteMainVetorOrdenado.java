package testesListasDePrioridades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import listasDePrioridades.LPMaximaOrdenada;;

public class TesteMainVetorOrdenado {
	
	public static void main(String[] args) {
		
		/*
		 * Testes feitos instaciando e usando os métodos apenas 
		 * para analisar o funcionamento da classe.
		 */
		
		LPMaximaOrdenada vetorOrdenado = new LPMaximaOrdenada(50);	
		List<Integer> lista2 = new ArrayList<>();
		
		Random numAleatorios = new Random(19700621);
		
		for(int i = 1; i <= 10; i++){
			lista2.add(numAleatorios.nextInt(51));
		}
		
		vetorOrdenado.construir(lista2);
		vetorOrdenado.mostrarVetor();
		
		System.out.println("Valor de máxima prioridade: " + vetorOrdenado.getMaximaPrioridade() + ".\n");
		
		int valorRemovido1 = vetorOrdenado.remove();
		System.out.println("Valor removido: " + valorRemovido1 + ".\n");
		
		vetorOrdenado.mostrarVetor();
		
		vetorOrdenado.inserir(1);
		vetorOrdenado.inserir(50);
		vetorOrdenado.mostrarVetor();
		
		System.out.println("Valor de máxima prioridade: " + vetorOrdenado.getMaximaPrioridade() + ".\n");
		
		vetorOrdenado.alterarPrioridade(14, 56);
		vetorOrdenado.mostrarVetor();
		System.out.println("Valor de máxima prioridade: " + vetorOrdenado.getMaximaPrioridade() + ".\n");
		
		int valorRemovido2 = vetorOrdenado.remove();
		System.out.println("Valor removido: " + valorRemovido2 + ".\n");
		
		vetorOrdenado.mostrarVetor();
	}
}