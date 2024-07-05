package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {this.dicionarioMap = new HashMap<>(); }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra,definicao);
    }

    public void removerPalavra(String palavra) {
        if(!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String definicaoPalavraPesquisada = null;
        if(!dicionarioMap.isEmpty()) {
            definicaoPalavraPesquisada = dicionarioMap.get(palavra);
        }
        return definicaoPalavraPesquisada;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Andar","Ato de caminhar");
        dicionario.adicionarPalavra("Dormir","Ato de descansar");
        dicionario.exibirPalavras();
        dicionario.removerPalavra("Dormir");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Andar"));
    }
}
