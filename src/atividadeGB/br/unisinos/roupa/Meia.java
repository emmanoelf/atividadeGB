package atividadeGB.br.unisinos.roupa;

public class Meia extends Roupa{

	public Meia(){
		this.Nome = "meia";
		this.Marca = "viko";
		this.Descricao = "sou uma roupa do tipo meia";
	}

	@Override
	public double preco() {
		return 15.00;
	}
}
