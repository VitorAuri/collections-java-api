package main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;

    public Tarefa(String descricao) { this.descricao = descricao; }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "{descricao="+descricao+"}";
    }
}
