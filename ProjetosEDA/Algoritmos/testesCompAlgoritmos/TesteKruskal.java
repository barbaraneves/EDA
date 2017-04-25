package testesCompAlgoritmos;

import java.io.IOException;
import java.util.List;

import algoritmos.ArvoreGeradoraMinima;
import edaUtilAlgoritmos.CriarInstancia;
import edaUtilAlgoritmos.EDAConstants;
import edaUtilAlgoritmos.EDAUtil;
import grafo.Aresta;
import grafo.Grafo;

public class TesteKruskal {
	public static void main(String args[]){
		try {
			for (int tamanho : CriarInstancia.tamanhoInstanciasGK) {	
				for(int i = 0; i < 4; i++){
					String path = EDAConstants.grafoKruskal + "tb8ch" + tamanho + "_" + i +".txt";
					
					Grafo entrada = EDAUtil.lerGrafo(path);
					
					long tempoInicial = System.currentTimeMillis();				
					ArvoreGeradoraMinima grafo = new ArvoreGeradoraMinima();
					System.out.println("\n" + "tb8ch" + tamanho + "_" + i +":");
					List<Aresta> solucao= grafo.kruskal(entrada);
					
					System.out.println("Custo: " + grafo.getCusto(solucao));
					long tempo = System.currentTimeMillis() - tempoInicial;
					System.out.println("tempo: " + tempo);
					
				}
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
