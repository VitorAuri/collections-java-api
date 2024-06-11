package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefasPendentes;
    Set<Tarefa> tarefasConcluidas;
    public ListaTarefas() { this.tarefasConcluidas = new HashSet<>(); this.tarefasPendentes = new HashSet<>(); }

    public void adicionarTarefa(String descricao) {
        tarefasPendentes.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Set<Tarefa> tarefasParaApagar = null;
        if(!tarefasPendentes.isEmpty()){
            for (Tarefa t : tarefasPendentes) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaApagar.add(t);
                }
            }
        }
        if(tarefasParaApagar==null){
            System.out.println("Sem tarefas para apagar");
        }
        else{
            tarefasPendentes.remove(tarefasParaApagar);
        }
    }

    public Set<Tarefa> exibirTarefas() {
        return tarefasPendentes;
    }

    public int contarTarefas() {
        return tarefasPendentes.size();
    }


}
