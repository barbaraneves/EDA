package splay;

import noSplay.NodeSplay;

public class Splay {
	private NodeSplay raiz = null;
	
	public NodeSplay busca(int chave){
		this.raiz = splay(this.raiz, chave);
		
		if(this.raiz.getChave() == chave){
			return this.raiz;
		}
		else{
			return null;
		}
	}
	
	private NodeSplay splay(NodeSplay raiz, int chave){
		if(raiz == null){
			return null;
		}
		if(raiz.getChave() == chave){
			return raiz;
		}
		if(chave < raiz.getChave()){
			if(raiz.getEsq() != null){
				raiz.setEsq(splay(raiz.getEsq(), chave));
				raiz = rotacaoDir(raiz);
			}
		}
		if(chave > raiz.getChave()){
			if(raiz.getDir() != null){
				raiz.setDir(splay(raiz.getDir(), chave));
				raiz = rotacaoEsquerda(raiz);
			}
		}
		return raiz;
	}

	private NodeSplay rotacaoDir(NodeSplay raiz) {
		// TODO Auto-generated method stub
		return null;
	}

	private NodeSplay rotacaoEsquerda(NodeSplay raiz) {
		// TODO Auto-generated method stub
		return null;
	}
}
