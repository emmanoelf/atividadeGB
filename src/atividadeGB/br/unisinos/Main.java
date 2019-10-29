package atividadeGB.br.unisinos;

public class Main {

	public static void main(String[] args) {
		//instanciando a SimpleFactory
		SimpleFactory sf = new SimpleFactory();
		
       		//utilizando a SimpleFactory para instanciar as classes
		Compra compra = sf.createCompra();
        	Pagamento pag = sf.createPagamento();
        	Entrega entrega = sf.createEntrega();
		
		//adicionar item carrinho
		
		//escolher metodo pagamento
		
		//finalizar compra
	}

}
