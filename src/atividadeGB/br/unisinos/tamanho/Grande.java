package atividadeGB.br.unisinos.tamanho;

import atividadeGB.br.unisinos.roupa.*;

public class Grande extends Tamanho{

	public Grande(Roupa r){
		this.Roupa = r;
	}

	@Override
	public double preco() {
		return Roupa.preco() + 40.00;
	}
}
