public enum StatusTarefa {
    PENDENTE,
    EM_ANDAMENTO,
    CONCLUIDA;

    public String getDescricao(){
        switch (this){
            case PENDENTE:
                return "Pendente";
            case EM_ANDAMENTO:
                return "Em andamento";
            case CONCLUIDA:
                return "Concluída";
            default:
                return "Desconhecido";
 
        }
    }
}
