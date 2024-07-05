package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private Set<Aluno> alunoSet;

    public GerenciadorAlunos() { this.alunoSet = new HashSet<>(); }

    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome,matricula,media));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno aluno : alunoSet) {
            if(aluno.getMatricula() == matricula) {
                alunoParaRemover = aluno;
                break;
            }
        }
        if (alunoParaRemover == null) {
            System.out.println("Sem alunos para remover.");
        }
        else {
            alunoSet.remove(alunoParaRemover);
        }
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(new ComparatorPorNome());
        if(!alunoSet.isEmpty()){
            alunosPorNome.addAll(alunoSet);
            return alunosPorNome;
        }
        else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorNota());
        if(!alunoSet.isEmpty()) {
            alunosPorNota.addAll(alunoSet);
            return alunosPorNota;
        }
        else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public Set<Aluno> exibirAlunos() {
        Set<Aluno> alunos = new TreeSet<>(alunoSet);
        if(!alunoSet.isEmpty()) {
            return alunos;
        }
        else {
            throw new RuntimeException("O conjunto está vazio!");
        }
    }

    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();
        gerenciadorAlunos.adicionarAluno("Aflred",123,10);
        gerenciadorAlunos.adicionarAluno("Jorge",1234567,6);
        gerenciadorAlunos.adicionarAluno("Bernardo",12345,8);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        gerenciadorAlunos.removerAluno(1234567);
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

    }

}
