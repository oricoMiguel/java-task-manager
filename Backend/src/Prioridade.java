//Guardar constantes e métodos também
public enum Prioridade {
    BAIXA,
    MEDIA,
    ALTA; 


    public String getDescricao() {
        switch (this) {
            case BAIXA:
                return "Baixa";
            case MEDIA:
                return "Média";
            case ALTA:
                return "Alta";
            default:
                return "Desconhecida";
        }
    }
}