package atividadeGB.br.unisinos.roupa;

public class Camisa extends Roupa {

	public Camisa(){
		this.Nome = "cammisa";
		this.Marca = "supreme";
		this.Descricao = "sou uma roupa do tipo camisa";
	}

	@Override
	public double preco() {
		return 60.00;
	}
}
