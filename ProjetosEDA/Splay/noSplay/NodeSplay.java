package noSplay;

public class NodeSplay<T> {
	private NodeSplay<T> esq;
	private NodeSplay<T> dir;
	private int chave;
	
	public NodeSplay(int chave){
		esq = null;
		dir = null;
		this.chave = chave;
	}

	public NodeSplay<T> getEsq() {
		return esq;
	}

	public void setEsq(NodeSplay<T> esq) {
		this.esq = esq;
	}

	public NodeSplay<T> getDir() {
		return dir;
	}

	public void setDir(NodeSplay<T> dir) {
		this.dir = dir;
	}

	public int getChave() {
		return chave;
	}

	public void setChave(int chave) {
		this.chave = chave;
	}
}
