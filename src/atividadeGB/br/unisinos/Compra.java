import java.util.concurrent.atomic.AtomicInteger;

class Compra{
    private static final AtomicInteger count = new AtomicInteger(0);
    private final int id;
    private String status = "Em Andamento";

    public Compra(){
        this.id = count.incrementAndGet();
    }
    
    public Integer getId(){
        return this.id;
    }

    public void setStatus(String status){
        this.status = status;
    }

    public boolean isOK(){
        if(this.status.equals("Finalizado")){
            return true;
        }
        return false;
    }
}
