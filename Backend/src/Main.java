import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        
        Tarefa tarefa1 = new Tarefa(
            "Estudar Java",
            "Aprender POO",
            Prioridade.ALTA,
            StatusTarefa.PENDENTE
        );
     
        Tarefa tarefa2 = new Tarefa(
            "Estudar SQL",
            "Aprender Banco de Dados",
            Prioridade.MEDIA,
            StatusTarefa.EM_ANDAMENTO
        );

        Tarefa tarefa3 = new Tarefa(
            "Estudar HTML/CSS",
            "Aprendendo Front-End",
            Prioridade.BAIXA,
            StatusTarefa.PENDENTE
        );

        Tarefa tarefa4 = new Tarefa(
            "Estudar Python",
            "Aprendendo Python",
            Prioridade.ALTA,
            StatusTarefa.EM_ANDAMENTO
        );


        //Armazenando as tarefas e adicionando manualmente algumas tarefas
        ArrayList<Tarefa> tarefas = new ArrayList<>();

        //Adicionando tarefas
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        gerenciador.adicionarTarefa(tarefa3);
        gerenciador.adicionarTarefa(tarefa4);

        //Mostrando os titulos das tarefas
        gerenciador.listarTarefas();

        //Filtrando por Prioridade
        ArrayList<Tarefa> tarefasAltas = filtrarPorPrioridade(tarefas, Prioridade.ALTA);
        for(Tarefa tarefaAtual: tarefasAltas){
            System.out.println("Tarefas ALTAS: " + tarefaAtual.getTitulo());
        }

        //Filtrando por Status
        ArrayList<Tarefa> tarefasPendentes = filtrarPorStatus(tarefas, StatusTarefa.PENDENTE);
        for(Tarefa tarefaAtual: tarefasPendentes) {
            System.out.println("Tarefas Pendentes: " +tarefaAtual.getTitulo());
        }
        
        //Mostrando o tamanho da lista
        System.out.println("Total de tarefas: " + gerenciador.contarTarefas());

        //Buscando tarefa
        Tarefa resultado = buscarTarefa(tarefas, "Estudar Java");
        if (resultado != null){
            resultado.exibirInformacao();
        }
        else{
            System.out.println("Tarefa não encontrada");
        }
        
        //Alterando a ordem das tarefas
        alterarTarefas(tarefas, 0, 3);
        System.out.println("\n--- Tarefas após a troca ---");
        listarTarefas(tarefas);
        
        //Removendo uma tarefa da lista
        removerTarefa(tarefas, tarefa3);


    }




    




    //Alterar a posição das tarefas
    public static void alterarTarefas(ArrayList<Tarefa> tarefa, int posicao1, int posicao2){

        //Verifica se é uma posição válida
        if(posicao1 < tarefa.size() && posicao1 >= 0 && posicao2 < tarefa.size() && posicao2 >= 0){
        Tarefa temporaria = tarefa.get(posicao1);
        Tarefa outraTemporaria = tarefa.get(posicao2);

            //Verifica se passou alguma posição
            if(temporaria != null && outraTemporaria != null){
                tarefa.set(posicao2, temporaria);
                tarefa.set(posicao1, outraTemporaria);
            }
        }
    
    }

    //Filtrar tarefas por Prioridade
    public static ArrayList<Tarefa> filtrarPorPrioridade (ArrayList<Tarefa> listaTarefa, Prioridade prioridade){
        ArrayList<Tarefa> tarefasFiltradas = new ArrayList<>();
        for (Tarefa tarefaAtual: listaTarefa){
            if (tarefaAtual.getPrioridade() == prioridade){
                tarefasFiltradas.add(tarefaAtual);
            }
        }
        return tarefasFiltradas;
    }

    //Filtrar tarefas por Status
    public static ArrayList<Tarefa> filtrarPorStatus (ArrayList<Tarefa> listaTarefa, StatusTarefa status){
        ArrayList<Tarefa> tarefasFiltradas = new ArrayList<>();
        for(Tarefa tarefaAtual: listaTarefa){
            if(tarefaAtual.getStatus() == status){
                tarefasFiltradas.add(tarefaAtual);
            }
        }
        return tarefasFiltradas;
    }

    //Alterar titulo
    public static void alterarTitulo(ArrayList<Tarefa> tarefa, String tituloAtual, String tituloNovo){
        Tarefa tarefas = buscarTarefa(tarefa, tituloAtual);
        if(tarefas != null){
            tarefas.setTitulo(tituloNovo);
        }else{
            System.out.println("Tarefa não encontrada");
        }

    }

    //Alterar Descrição
    public static void alterarDescricao(ArrayList<Tarefa> tarefa, String tituloAtual, String descricaoNova){
        Tarefa tarefas = buscarTarefa(tarefa, tituloAtual);
        if(tarefas != null){
            tarefas.setDescricao(descricaoNova);
        }else{
            System.out.println("Tarefa não encontrada");
        }

    }

    //ALterar Prioridade
    public static void alterarPrioridade(ArrayList<Tarefa> tarefa, Prioridade novaPrioridade, String tituloAtual){
        Tarefa tarefas = buscarTarefa(tarefa, tituloAtual);
        if(tarefas != null){
            tarefas.setPrioridade(novaPrioridade);
        } else{
            System.out.println("Tarefa não encontrada");
        }
    }

    //Alterar Status
    public static void alterarStatus(ArrayList<Tarefa> tarefa, StatusTarefa novoStatus, String tituloAtual){
        Tarefa tarefas = buscarTarefa(tarefa, tituloAtual);
        if(tarefas != null){
            tarefas.setStatus(novoStatus);
        }else{
            System.out.println("Tarefa não encontrada");
        }
    }

}