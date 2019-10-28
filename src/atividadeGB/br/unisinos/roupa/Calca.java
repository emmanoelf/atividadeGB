package atividadeGB.br.unisinos.roupa;

public class Calca extends Roupa {

	public Calca(){
		this.Nome = "calça";
		this.Marca = "youcom";
		this.Descricao = "sou uma roupa do tipo calça";
	}

	@Override
	public double preco() {
		return 80.00;
	}
}
