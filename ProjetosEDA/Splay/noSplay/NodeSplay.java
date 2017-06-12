package noSplay;

public class NodeSplay {
	private NodeSplay esq;
	private NodeSplay dir;
	private int altura;
	private int chave;
	
	public NodeSplay(int chave){
		esq = null;
		dir = null;
		altura = 1;
		this.chave = chave;
	}

	public NodeSplay getEsq() {
		return esq;
	}

	public void setEsq(NodeSplay esq) {
		this.esq = esq;
	}

	public NodeSplay getDir() {
		return dir;
	}

	public void setDir(NodeSplay dir) {
		this.dir = dir;
	}

	public int getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}
}
