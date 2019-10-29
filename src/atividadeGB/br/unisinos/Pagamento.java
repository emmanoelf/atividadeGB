class Pagamento {
    private String status;

    public Pagamento(){
    }

    public void validarPagamento(){
        if(true){
            setStatus("Pagamento Aprovado");
        }
        setStatus("Erro no pagamento");
    }

    public void setStatus(String status){
        this.status = status;
    }
    
    public String getStatus(){
        return this.status;
    }
}
