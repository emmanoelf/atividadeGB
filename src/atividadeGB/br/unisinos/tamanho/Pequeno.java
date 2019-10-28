package atividadeGB.br.unisinos.tamanho;

import atividadeGB.br.unisinos.roupa.*;

public class Pequeno extends Tamanho{

	public Pequeno(Roupa r){
		this.Roupa = r;
	}

	@Override
	public double preco() {
		return Roupa.preco();
	}
}
