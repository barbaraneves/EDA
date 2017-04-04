package testesListasDePrioridades;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import listasDePrioridades.*;

public class TesteMainVetorNOrdenada {

	public static void main(String[] args) {
		
		LPMaximaNOrdenada vetorNOrdenado = new LPMaximaNOrdenada(50);
		
		List<Integer> lista1 = new ArrayList<>();
		Random numAleatorios = new Random(19700621);
		
		for(int i = 1; i <= 10; i++){
			lista1.add(numAleatorios.nextInt(51));
		}
		
		vetorNOrdenado.construir(lista1);
		vetorNOrdenado.mostrarVetor();
		
		System.out.println("Valor de máxima prioridade: " + vetorNOrdenado.getMaximaPrioridade() + ".\n");
		
		int valorRemovido = vetorNOrdenado.remove();
		System.out.println("Valor removido: " + valorRemovido + ".\n");
		
		vetorNOrdenado.mostrarVetor();
		
		int maxPrioridade = vetorNOrdenado.getMaximaPrioridade();
		vetorNOrdenado.alterarPrioridade(maxPrioridade, 50);
		vetorNOrdenado.mostrarVetor();
		System.out.println("Valor de máxima prioridade: " + vetorNOrdenado.getMaximaPrioridade() + ".\n");
		
		vetorNOrdenado.inserir(1);
		vetorNOrdenado.inserir(56);
		vetorNOrdenado.mostrarVetor();
		
		System.out.println("Valor de máxima prioridade: " + vetorNOrdenado.getMaximaPrioridade() + ".\n");
	}
}