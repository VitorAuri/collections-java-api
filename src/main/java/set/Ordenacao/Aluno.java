package main.java.set.Ordenacao;

import java.util.Comparator;
import java.util.Objects;

public class Aluno implements Comparable<Aluno> {
    private String nome;
    private long matricula;
    private double media;

    public Aluno(String nome, long matricula, double media) {
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome() {
        return nome;
    }

    public long getMatricula() {
        return matricula;
    }

    public double getMedia() {
        return media;
    }

    @Override
    public String toString() {
        return "Aluno{" +
                "nome='" + nome + '\'' +
                ", matricula=" + matricula +
                ", media=" + media +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Double.compare(getMedia(), aluno.getMedia()) == 0 && Objects.equals(getNome(), aluno.getNome());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getMedia());
    }

    @Override
    public int compareTo(Aluno outroAluno) {
        return nome.compareToIgnoreCase(outroAluno.getNome());
    }
}
class ComparatorPorNota implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return Double.compare(a1.getMedia(),a2.getMedia());
    }
}

class ComparatorPorNome implements Comparator<Aluno> {
    @Override
    public int compare(Aluno a1, Aluno a2) {
        return a1.getNome().compareTo(a2.getNome());
    }
}