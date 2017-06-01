package aVL;

import noAVL.NodeAVL;

public class AVL {
	private NodeAVL raiz = null;
	
	public void inserir(int chave){
		this.raiz = inserir(this.raiz, chave);
	}
	
	private int altura(NodeAVL raiz){
		return (raiz != null ? raiz.getAltura() : 0);
	}
	
	private NodeAVL inserir(NodeAVL raiz, int chave){
		if(raiz == null){
			NodeAVL node = new NodeAVL(chave);
			return node;
		}
		else if(raiz.getChave() > chave){
			/* raiz.esq(?) = inserir(raiz.getEsq(), chave); */
			raiz.setEsq(inserir(raiz.getEsq(), chave));
			
			if(altura(raiz.getEsq()) - altura(raiz.getDir()) == 2){
				if(altura(raiz.getEsq().getEsq()) > altura(raiz.getDir().getEsq())){
					raiz = rotacaoDireita(raiz);
				}
				else{
					raiz = rotacaoDuplaDireita(raiz);
				}	
			}
		}
		else if(raiz.getChave() < chave){
			/* raiz.dir(?) = inserir(raiz.getEsq(), chave); */
			raiz.setDir(inserir(raiz.getDir(), chave));
			
			if(altura(raiz.getDir()) - altura(raiz.getEsq()) == 2){
				if(altura(raiz.getDir().getDir()) > altura(raiz.getDir().getEsq())){
					raiz = rotacaoEsquerda(raiz);
				}
				else{
					raiz = rotacaoDuplaEsquerda(raiz);
				}
			}
		}
		
		/* raiz.altura = max(altura(raiz.dir)), altura(raiz.esq) + 1; */
		
		return raiz;
	}

	private NodeAVL rotacaoEsquerda(NodeAVL node) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private NodeAVL rotacaoDireita(NodeAVL node) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private NodeAVL rotacaoDuplaEsquerda(NodeAVL node) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private NodeAVL rotacaoDuplaDireita(NodeAVL node) {
		// TODO Auto-generated method stub
		return null;
	}
}
