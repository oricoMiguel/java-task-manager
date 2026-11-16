import java.util.ArrayList;

public class GerenciadorTarefas {
    
    private ArrayList<Tarefa> tarefas = new ArrayList<>();


    //Método para adicionar tarefa
    public void adicionarTarefa(Tarefa tarefa){
        tarefas.add(tarefa);
    }

    //Método para listar as tarefas pelo título
    public void listarTarefas(){
        for(Tarefa tarefa: tarefas){
            System.out.println(tarefa.getTitulo());
        }
    }

    //Método para contar tarefas
    public int contarTarefas(){
        return tarefas.size();
    }

    //Método para buscar tarefa pelo título
    public Tarefa buscarTarefa (String titulo){
        for(Tarefa tarefa: tarefas){
            if(tarefa.getTitulo().equals(titulo)){
                return tarefa;
            }
        }
        //Se não achar
        return null;
    }

    //Método para apagar
    public void removerTarefa(String titulo){
        Tarefa tarefaEncontrada = buscarTarefa(titulo);
        if(tarefaEncontrada != null){
            tarefas.remove(tarefaEncontrada);
        }else{
            System.out.println("Tarefa não encontrada");
        }
    }

    //Métodos de alteração dos campos
    //TITULO
    public void alterarTitulo(String tituloAtual, String tituloNovo){
         Tarefa tarefaEncontrada = buscarTarefa(tituloAtual);
         if(tarefaEncontrada != null){
            tarefaEncontrada.setTitulo(tituloNovo);
         }else{
            System.out.println("Tarefa não encontrada");
         }
    }
    //DESCRIÇÃO
    public void alterarDescricao(String tituloAtual, String descricaoNova){
         Tarefa tarefaEncontrada = buscarTarefa(tituloAtual);
         if(tarefaEncontrada != null){
            tarefaEncontrada.setDescricao(descricaoNova);
         }else{
            System.out.println("Tarefa não encontrada");
         }
    }
}
