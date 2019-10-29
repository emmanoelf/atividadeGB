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
        if(this.pagamento.getStatus().equals("Pagamento Aprovado")){
            this.compra.setStatus("Finalizado");
        } else{
            this.compra.setStatus("Aguardando Pagamento");
        }
        

        if(this.compra.isOK()){
            this.entrega.adicionarFilaDeEnvio(this.compra);
        }

    }
}
