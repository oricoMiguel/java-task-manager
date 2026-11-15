public class Tarefa {

    private String titulo;
    private String descricao;
    private Prioridade prioridade;
    private StatusTarefa status;

    public Tarefa (String titulo, String descricao,  Prioridade prioridade, StatusTarefa status){
        this.titulo = titulo;
        this.descricao = descricao;
        this.prioridade = prioridade;
        this.status = status;
    }

    public void exibirInformacao(){
        System.out.println("############################################");
        System.out.println("Título: " + titulo);
        System.out.println("Descrição: " + descricao);
        System.out.println("Prioridade: " + prioridade.getDescricao());
        System.out.println("Status: " + status.getDescricao());
        System.out.println("############################################");
    }

    public void concluirTarefa(){
        this.status = StatusTarefa.CONCLUIDA;
    }
    



    //GETTERS AND SETTERS
    public String getTitulo(){
        return titulo;
    }

    public void setTitulo (String titulo){
        this.titulo = titulo;
    }

    public String getDescricao(){
        return descricao;
    }

    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public Prioridade getPrioridade(){
        return prioridade;
    }

    public void setPrioridade(Prioridade prioridade){
            this.prioridade = prioridade;    
    }

    public StatusTarefa getStatus(){
        return status;
    }

    public void setStatus(StatusTarefa status){
        this.status = status;
    }
}
