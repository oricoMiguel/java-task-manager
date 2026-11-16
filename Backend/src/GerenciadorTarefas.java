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

    //PRIORIDADE
    public void alterarPrioridade(Prioridade novaPrioridade, String tituloAtual){
        Tarefa tarefaEncontrada = buscarTarefa(tituloAtual);
        if(tarefaEncontrada != null){
            tarefaEncontrada.setPrioridade(novaPrioridade);
        }else{
            System.out.println("Tarefa não encontrada");
        }
    }

    //Status
    public void alterarStatus(StatusTarefa novoStatus, String tituloAtual){
        Tarefa tarefaEncontrada = buscarTarefa(tituloAtual);
        if(tarefaEncontrada != null){
            tarefaEncontrada.setStatus(novoStatus);
        }else{
            System.out.println("Tarefa não encontrada");
        }
    }

    //Filtrar por Prioridade
    public ArrayList<Tarefa> filtrarPorPrioridade(Prioridade prioridade){
        ArrayList<Tarefa> tarefasFiltradas = new ArrayList<>();
        for(Tarefa tarefaAtual: tarefas){
            if(tarefaAtual.getPrioridade() == prioridade){
                tarefasFiltradas.add(tarefaAtual);
            }
        }
        return tarefasFiltradas;
    }

    //Filtrar por Status
    public ArrayList<Tarefa> filtrarPorStatus(StatusTarefa status){
        ArrayList<Tarefa> tarefasFiltradas = new ArrayList<>();
        for(Tarefa tarefaAtual: tarefas){
            if (tarefaAtual.getStatus() == status){
                tarefasFiltradas.add(tarefaAtual);
            }
        }
        return tarefasFiltradas;
    }

    //Alterar Tarefas
    public void alterarTarefas(int posicao1, int posicao2){
        //Verificar se a posição é válida
        if(posicao1 < tarefas.size() && posicao1 >= 0 && posicao2 < tarefas.size() && posicao2 >=0){
            Tarefa temporaria = tarefas.get(posicao1);
            Tarefa outraTemporaria = tarefas.get(posicao2);
        
            //Verifica se passou uma posição
            if(temporaria != null && outraTemporaria != null){
                tarefas.set(posicao1, outraTemporaria);
                tarefas.set(posicao2, temporaria);
            }
        }
    }
}
