package atividadeGB.br.unisinos.tamanho;

import atividadeGB.br.unisinos.roupa.*;

public class Medio extends Tamanho{

	public Medio(Roupa r){
		this.Roupa = r;
	}

	@Override
	public double preco() {
		return Roupa.preco() + 20.00;
	}
}
