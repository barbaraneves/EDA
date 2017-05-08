package hash;

public class EnderecamentoInterno2 extends Hash{
private NodeHash tabela[] = null;
	
	public EnderecamentoInterno2(Integer tam) {
		super(tam);
		tabela = new NodeHash[tam];
		// TODO Auto-generated constructor stub
	}
	
	/**
	 * Insere o elemento através da sua chave e do seu valor.
	 */
	public void inserir(Integer chave, String valor) {
		Integer n = fHash(chave);
		NodeHash no = new NodeHash(chave, valor);
		
		if(tabela[n] == null){
			tabela[n] = no;
		}
		while(tabela[n].getProx() != -1){
			if(tabela[n].getChave() == chave){
				return;
			}
			n = tabela[n].getProx();
		}
		if(tabela[n].getChave() == chave){
			return;
		}
		
		int j = 1;
		int max = tabela.length;
		
		for (int i = n + 1; i < max; i++){
			if(j == max){
				return;
			}
			if(tabela[i] == null){
				tabela[i] = no; 
				tabela[n].setProx(i);
				return;
			}
			if(i % max == 0){
				i = 0;
			}
			j++;
		}		
	}

	/**
	 * Busca o elemento de acordo com a o valor da sua chave.
	 */
	public String buscar(Integer chave) {
		Integer n = fHash(chave);
		
		if(tabela[n] == null){
			return null;
		}
		while(true){
			if(tabela[n].getChave() == chave){
				return tabela[n].getValor();
			}
			else if(tabela[n].getProx() != -1){
				n = tabela[n].getProx();
			}
			else{
				return null;
			}
		}
	}

	/**
	 * Remove o elemento através da sua chave.
	 */
	public String remover(Integer chave) {
		Integer n = fHash(chave);
		int aux = n;
		
		if(tabela[n] != null){
			if(tabela[n].getChave() == chave){
				if(tabela[n].getProx() == -1) {
					String a = tabela[n].getValor();
					tabela[n] = null; 
					return a;
				}
				aux = tabela[n].getProx();
				tabela[n] = new NodeHash(tabela[aux].getChave(), tabela[aux].getValor());
				tabela[n].setProx(tabela[aux].getProx());
				tabela[aux] = null;
			}
			while(true){
				if(tabela[n].getChave() == chave){
					tabela[aux].setProx(tabela[n].getProx());
					String p = tabela[n].getValor();
					tabela[n] = null;
					
					return p;
				}
				else if(tabela[n].getProx() != -1){
					aux = n;
					n = tabela[n].getProx();
				}
				else{
					return null;
				}
			}		
		}
		return null;
	}
}
