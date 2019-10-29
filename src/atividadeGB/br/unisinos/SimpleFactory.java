class SimpleFactory{
    public Compra createCompra(){
        return new Compra();
    }

    public Pagamento createPagamento(){
        return new Pagamento();
    }

    public Entrega createEntrega(){
        return new Entrega();
    }

}
