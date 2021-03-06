package edaUtilAlgoritmos;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import grafo.Aresta;
import grafo.Grafo;

public class EDAUtil {
	
    public static List<Integer> getDadosIniciais(String path) throws IOException {
        List<Integer> entrada = new ArrayList<Integer>();
        Scanner scanner = new Scanner(new FileReader(path)).useDelimiter("\r\n");
        
		while (scanner.hasNext())
			entrada.add(scanner.nextInt());
		
		scanner.close();
        return entrada;
    }
    
    public static Grafo lerGrafo(String path) throws IOException{
    	Grafo g = null;
    	Scanner scanner = new Scanner(new FileReader(path)).useDelimiter(" |\r\n");
    	
    	if(scanner.hasNext()){
    		g = new Grafo(scanner.nextInt(), scanner.nextInt());
    		int pos = 0;
    		while(scanner.hasNext()){
    			//Aresta a = new Aresta(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    			//g.add(a);
    			Aresta b = new Aresta(scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
    			if(pos <= g.getQtdAresta()){
    				g.getArestas()[pos] = b;
    			}
    			pos++;
    		}
    	}
    	scanner.close();
    	return g;
    }
    
    public static List<Operacao> getOperacoes(String path) throws IOException {
        List<Operacao> operacoes = new ArrayList<Operacao>();
        Scanner scanner = new Scanner(new FileReader(path)).useDelimiter(" |\r\n");	
		while (scanner.hasNext())
			operacoes.add(new Operacao(scanner.next(), scanner.nextInt(), scanner.nextInt()));
			
		scanner.close();
        return operacoes;
    }    
}