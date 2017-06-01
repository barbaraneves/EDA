package noAVL;

public class NodeAVL {
	private NodeAVL esq;
	private NodeAVL dir;
	private int altura;
	private int chave;
	
	public NodeAVL(int chave){
		esq = null;
		dir = null;
		altura = 1;
		this.chave = chave;
	}

	public NodeAVL getEsq() {
		return esq;
	}

	public void setEsq(NodeAVL esq) {
		this.esq = esq;
	}

	public NodeAVL getDir() {
		return dir;
	}

	public void setDir(NodeAVL dir) {
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
