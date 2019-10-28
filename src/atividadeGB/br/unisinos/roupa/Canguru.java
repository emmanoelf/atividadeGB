package atividadeGB.br.unisinos.roupa;

public class Canguru extends Roupa {

	public Canguru(){
		this.Nome = "canguru";
		this.Marca = "adidas";
		this.Descricao = "sou uma roupa do tipo canguru";
	}

	@Override
	public double preco() {
		return 140.00;
	}
}
