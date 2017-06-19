package nodeRubroNegra;

public class NodeRubroNegra<T> {
	private NodeRubroNegra<T> esq;
	private NodeRubroNegra<T> dir;
	private int chave;
	private boolean cor;
	
	public static final boolean PRETO = true;
	public static final boolean VERMELHO = false;
	
	public NodeRubroNegra(int chave) {
		esq = null;
		dir = null;
		this.chave = chave;
		cor = false;
	}

	public NodeRubroNegra<T> getEsq() {
		return esq;
	}

	public void setEsq(NodeRubroNegra<T> esq) {
		this.esq = esq;
	}

	public NodeRubroNegra<T> getDir() {
		return dir;
	}

	public void setDir(NodeRubroNegra<T> dir) {
		this.dir = dir;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}

	public boolean isCor() {
		return cor;
	}

	public void setCor(boolean cor) {
		this.cor = cor;
	}

	public static boolean isPreto() {
		return PRETO;
	}

	public static boolean isVermelho() {
		return VERMELHO;
	}
}
