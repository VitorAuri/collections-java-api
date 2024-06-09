package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;
    public ListaTarefas() { this.tarefaSet = new HashSet<>(); }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Set<Tarefa> tarefasParaApagar = null;
        if(!tarefaSet.isEmpty()){
            for (Tarefa t : tarefaSet) {
                if(t.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefasParaApagar.add(t);
                }
            }
        }
        if(tarefasParaApagar==null){
            System.out.println("Sem tarefas para apagar");
        }
        else{
            tarefaSet.remove(tarefasParaApagar);
        }
    }

    public Set<Tarefa> exibirTarefas() {
        return tarefaSet;
    }

    public int contarTarefas() {
        return tarefaSet.size();
    }


}
