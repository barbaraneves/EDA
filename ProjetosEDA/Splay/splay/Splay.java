package splay;

import noSplay.NodeSplay;

public class Splay<T> {
	private NodeSplay<T> raiz = null;
	
	public NodeSplay<T> busca(int chave){
		this.raiz = splay(this.raiz, chave);
		
		if(this.raiz.getChave() == chave){
			return this.raiz;
		}
		else{
			return null;
		}
	}
	
	public void inserir(int chave){
		raiz = inserir(raiz, chave);
	}
	
	private NodeSplay<T> inserir(NodeSplay<T> raiz, int chave){
		if(raiz == null){
			return new NodeSplay<T>(chave);
		}
		else if(raiz.getChave() > chave){
			raiz.setEsq(inserir(raiz.getEsq(), chave));
		}
		else if(raiz.getChave() < chave){
			raiz.setDir(inserir(raiz.getDir(), chave));
		}
		raiz = splay(raiz, chave);
		
		return raiz;
	}
	
	private NodeSplay<T> splay(NodeSplay<T> raiz, int chave){
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

	private NodeSplay<T> rotacaoDir(NodeSplay<T> raiz) {
		// TODO Auto-generated method stub
		NodeSplay<T> aux = raiz.getEsq();

		raiz.setEsq(aux.getDir());
		aux.setDir(raiz);

		return aux;
	}

	private NodeSplay<T> rotacaoEsquerda(NodeSplay<T> raiz) {
		// TODO Auto-generated method stub
		NodeSplay<T> aux = raiz.getDir();
		
		raiz.setDir(aux.getEsq());
		aux.setEsq(raiz);
		
		return aux;
	}
}
