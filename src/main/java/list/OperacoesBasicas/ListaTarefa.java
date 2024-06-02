package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    private List<Tarefa> tarefaList;

    public ListaTarefa() {
        this.tarefaList = new ArrayList<>();
    }

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
        System.out.println("NOVA TAREFA ADICIONADA!");
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        for(Tarefa tarefa : tarefaList) {
            if(tarefa.getDescricao().equalsIgnoreCase(descricao))
                tarefasParaRemover.add(tarefa);
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas() {
        return tarefaList.size();
    }

    public void obterDescricoesTarefas() {
        System.out.println(tarefaList);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        listaTarefa.adicionarTarefa("Conquistar o mundo");
        listaTarefa.adicionarTarefa("Conquistar o mundo");
        listaTarefa.adicionarTarefa("Joseph");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.removerTarefa("Conquistar o mundo");
        System.out.println("Número total de tarefas: " + listaTarefa.obterNumeroTotalTarefas());

        System.out.println("- Descrição das Tarefas -");
        listaTarefa.obterDescricoesTarefas();

    }
}
