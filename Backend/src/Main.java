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
        adicionarTarefa(tarefas, tarefa1);
        adicionarTarefa(tarefas, tarefa2);
        adicionarTarefa(tarefas, tarefa3);
        adicionarTarefa(tarefas, tarefa4);

        //Mostrando os titulos das tarefas
        listarTarefas(tarefas);

        //Mostrando o tamanho da lista
        System.out.println(contarTarefas(tarefas));

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


    //Percorrendo as tarefas armazenadas (vendo apenas o título)
    public static void listarTarefas (ArrayList<Tarefa> tarefas){
        for (Tarefa tarefa: tarefas){
            System.out.println(tarefa.getTitulo());
        }
    }

    //Informa o tamanho da nossa lista
    public static int contarTarefas(ArrayList<Tarefa> tarefas){
        return tarefas.size();
    }

    //Verifica se a tarefa existe pelo título
    public static Tarefa buscarTarefa (ArrayList<Tarefa> tarefas, String titulo){
        for(Tarefa tarefa: tarefas){
            if (tarefa.getTitulo().equals(titulo)){
                return tarefa;
            }
        }
        //Se não achar
        return null;
    }

    //Remover uma tarefa
    public static void removerTarefa(ArrayList<Tarefa> tarefas, Tarefa tarefa){
        if(tarefas.remove(tarefa)){
            System.out.println("Tarefa apagada");
        }
        else{
            System.out.println("Tarefa não encontrada para apagar");
        }
        
    }

    //Adicionar tarefa
    public static void adicionarTarefa(ArrayList<Tarefa> tarefas, Tarefa tarefa){
        tarefas.add(tarefa);
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


}