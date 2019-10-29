class VendaFacade{
    private Compra compra;
    private Pagamento pagamento;
    private Entrega entrega;

    public VendaFacade(Compra compra, Pagamento pagamento, Entrega entrega){
        this.compra = compra;
        this.pagamento = pagamento;
        this.entrega = entrega;
    }

    public void finalizarVenda() {
        this.pagamento.validarPagamento();
        this.compra.setStatus(this.pagamento.setStatus());

        if(this.compra.isOk()){
            this.entrega.adicionarFilaDeEnvio(this.compra);
        }

    }
}
