class Entrega{
    private String tipoEntrega;

    public Entrega(){
        this.tipoEntrega = "Padrão";
    }

    public void setTipoEntrega(String tipo){
        this.tipoEntrega = tipo;
    }

    public String getTipoEntrega(){
        return this.tipoEntrega;
    }

    public void adicionarFilaDeEnvio(Compra compra){
        System.out.println("Pedido ID: "+compra.getId()+" encaminhado para fila de entrega");
    }
}
