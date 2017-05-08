package hash;

public class EnderecamentoInterno1 extends Hash{
	private Integer p = 0;
	private NodeHash tabela[] = null;
	
	public EnderecamentoInterno1(Integer tam) {
		super(tam);
		p = (int) (0.3 * tam);
		tabela = new NodeHash[tam];
	}
	
	public Integer fHash (Integer chave){
		return (chave % p);
	}

	/**
	 * Insere o elemento passando sua chave e o seu valor.
	 */
	public void inserir(Integer chave, String valor) {
		Integer n = fHash(chave);
		System.out.println(n);
		NodeHash no = new NodeHash(chave, valor);
		
		if(tabela[n] == null){
			tabela[n] = no;
			return;
		}
		int aux = n;
		
		while(tabela[aux].getProx() != -1){
			if(tabela[aux].getChave() == chave){
				return;
			}
			aux = tabela[aux].getProx();
		}
		if(tabela[aux].getChave() == chave){
			return;
		}
		for (int i = p + 1; i < tabela.length; i++){
			if(tabela[i] == null){
				tabela[i] = no; 
				tabela[aux].setProx(i);
				return;
			}
		}
	}

	/**
	 * Busca o elemento através do valor da sua chave.
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
	 * Remove o elemento passando por parâmetro o valor da sua chave.
	 */
	public String remover(Integer chave) {
		Integer n = fHash(chave);
		Integer aux = n;
		
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
		else{
			return null;
		}
	}
}
