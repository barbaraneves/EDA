package testesCompAlgoritmos;

import java.io.IOException;

import algoritmos.Dijkstra;
import edaUtilAlgoritmos.CriarInstancia;
import edaUtilAlgoritmos.EDAConstants;
import edaUtilAlgoritmos.EDAUtil;
import grafo.Grafo;

public class TesteDijkstra {
	public static void main(String[] args) {
		try {
			for(int tamanho : CriarInstancia.tamanhoInstancias){
				for(int i = 0; i < 4; i++){
					String path = EDAConstants.grafosAlgoritmos + "tb8ch" + tamanho + "_" + i + ".txt";
					
					Grafo entrada = EDAUtil.lerGrafo(path);
					
					long tempoInicial = System.currentTimeMillis();
					Dijkstra grafo = new Dijkstra();
					System.out.println("\n" + "tb8ch" + tamanho + "_" + i + ":");
					grafo.execucao(entrada);
				
					long tempo = System.currentTimeMillis() - tempoInicial;
					System.out.println("Tempo: " + tempo + ".");
				}
			}
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
