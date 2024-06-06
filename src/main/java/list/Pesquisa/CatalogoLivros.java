package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {
    private List<Livro> listaLivros;
    public CatalogoLivros() { this.listaLivros = new ArrayList<>();}

    public void adicionarLivro(String nome, String autor,int anoPublicacao) {
        listaLivros.add(new Livro(nome,autor,anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosDoAutor = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for(Livro livro : listaLivros) {
                if(livro.getAutor().equalsIgnoreCase(autor)) {
                    livrosDoAutor.add(livro);
                }
            }
        }
        return livrosDoAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloDeAnos = new ArrayList<>();
        if(!listaLivros.isEmpty()) {
            for(Livro livro : listaLivros) {
                if(livro.getAnoPublicacao() >= anoInicial && livro.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloDeAnos.add(livro);
                }
            }
        }
        return livrosPorIntervaloDeAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroEncontrado = null;
        if(!listaLivros.isEmpty()) {
            for(Livro livro : listaLivros) {
                if(livro.getTitulo().equalsIgnoreCase(titulo)) {
                    livroEncontrado = livro;
                    break;
                }
            }
        }
        return livroEncontrado;
    }

    public static void main(String[] args) {
        CatalogoLivros catalogo = new CatalogoLivros();
        catalogo.adicionarLivro("Nome Livro","Autor",2024);

        System.out.println(catalogo.pesquisarPorTitulo("Nome Livro"));
        System.out.println(catalogo.pesquisarPorAutor("Autor"));
        System.out.println(catalogo.pesquisarPorIntervaloAnos(2024,2020));

    }

}