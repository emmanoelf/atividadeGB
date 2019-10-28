package atividadeGB.br.unisinos.roupa;

public abstract class Roupa {
	public String Nome;
	public String Marca;
	public String Descricao;

	public String toString(){
		return "Nome: " + Nome + ", Marca: " + Marca + ", Descrição: " + Descricao;
	}

	public abstract double preco();
}