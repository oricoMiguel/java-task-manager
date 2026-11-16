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

        //Adicionando tarefas
        GerenciadorTarefas gerenciador = new GerenciadorTarefas();
        gerenciador.adicionarTarefa(tarefa1);
        gerenciador.adicionarTarefa(tarefa2);
        gerenciador.adicionarTarefa(tarefa3);
        gerenciador.adicionarTarefa(tarefa4);

        //Mostrando os titulos das tarefas
        gerenciador.listarTarefas();

        // Filtrando por Prioridade
        ArrayList<Tarefa> filtroAlta = gerenciador.filtrarPorPrioridade(Prioridade.ALTA);
            if (filtroAlta.isEmpty()) {
                System.out.println("Tarefa não encontrada");
            } else {
                for (Tarefa tarefaAtual : filtroAlta) {
                    tarefaAtual.exibirInformacao();
                }
            }
        
        //Filtrando por Status
        ArrayList<Tarefa> tarefasPendentes = gerenciador.filtrarPorStatus(StatusTarefa.PENDENTE);
        if(tarefasPendentes.isEmpty()){
            System.out.println("Tarefa não encontrada");
        }else {
            for (Tarefa tarefaAtual: tarefasPendentes){
                tarefaAtual.exibirInformacao();
            }
        }
        
        //Mostrando o tamanho da lista
        System.out.println("Total de tarefas: " + gerenciador.contarTarefas());

        //Buscando tarefa
        Tarefa busca = gerenciador.buscarTarefa("Estudar HTML/CSS");
        if(busca != null){
           busca.exibirInformacao(); 
        }else{
            System.out.println("Tarefa Não Encontrada");
        }
        
        //Alterando a ordem das tarefas
        gerenciador.alterarTarefas(0, 2);
        gerenciador.listarTarefas();

        //Removendo uma tarefa da lista
        gerenciador.removerTarefa("Estudar HTML/CSS");
        gerenciador.listarTarefas();



      
    }
}