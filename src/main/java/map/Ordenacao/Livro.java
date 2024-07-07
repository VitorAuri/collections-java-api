package main.java.map.Ordenacao;

import java.util.Comparator;

public class Livro implements Comparable<Livro> {
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco) {
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", preco=" + preco +
                '}';
    }

    @Override
    public int compareTo(Livro o) {
        return 0;
    }
}

class ComparatorPorPreco implements Comparator<Livro> {
    public int compare(Livro livro1, Livro livro2) {
        return Double.compare(livro1.getPreco(),livro2.getPreco());
    }
}

class ComparatorPorAutor implements Comparator<Livro> {

    @Override
    public int compare(Livro l1, Livro l2) {
        return l1.getAutor().compareToIgnoreCase(l2.getAutor());
    }
}
