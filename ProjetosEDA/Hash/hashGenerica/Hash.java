package hashGenerica;

public abstract class Hash {
	protected Integer m = 0; //A quantidade "0" indica o vazio. 

	protected Integer fHash(Integer chave){
		return(chave % m);
	}
	
	public abstract void inserir(Integer chave, String valor);
	public abstract String buscar(Integer chave);
	public abstract String remover(Integer chave);
	
	public Hash(Integer tam){
		m = tam;
	}
}
