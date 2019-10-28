package atividadeGB.br.unisinos.tamanho;

import atividadeGB.br.unisinos.roupa.*;

public abstract class Tamanho {
	public char Sigla;
	public Roupa Roupa;
	
	public String toString(){
		return Roupa.toString() + ", Sigla: " + Sigla;
	}

	public abstract double preco();
}