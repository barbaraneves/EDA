package hash;

import java.util.LinkedList;
import java.util.List;

public class EnderecamentoExterno extends Hash{
	private List<NodeHash>[] tabela = null;
	
	public EnderecamentoExterno(Integer tam){
		super(tam);
		tabela = new LinkedList[tam];
		// TODO Auto-generated constructor stub
	}

	/**
	 * Insere o elemento passando a chave e o seu valor. 
	 */
	public void inserir(Integer chave, String valor) {
		Integer n = fHash(chave);
		NodeHash no = new NodeHash(chave, valor);
		if(tabela[n] == null){
			tabela[n] = new LinkedList<NodeHash>();
		}
		tabela[n].add(no);
	}

	/**
	 * Busca o elemento passando por parâmetro apenas sua chave.
	 */
	public String buscar(Integer chave) {
		Integer n = fHash(chave);
		if(tabela[n] == null) return null;
		for(NodeHash x : tabela[n]){
			if(x.getChave() == chave){
				return x.getValor();
			}
		}
		return null;
	}

	/**
	 * Remove o elemento passando sua chave.
	 */
	public String remover(Integer chave) {
		Integer n = fHash(chave);
		if(tabela[n] == null) return null;
		for(NodeHash x : tabela[n]){
			if(x.getChave() == chave){
				tabela[n].remove(x);
				return x.getValor();
			}
		}
		return null;
	}
}
