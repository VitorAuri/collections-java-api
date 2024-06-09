package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> palavrasUnicas;
    public ConjuntoPalavrasUnicas() { this.palavrasUnicas = new HashSet<>(); }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        if(!palavrasUnicas.isEmpty()) {
            for (String p : palavrasUnicas) {
                if (p.equalsIgnoreCase(palavra)) {
                    palavraParaRemover = p;
                    break;
                }
            }
        }
        palavrasUnicas.remove(palavraParaRemover);
    }

    public Set<String> exibirPalavras(){
        return palavrasUnicas;
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoDePalavras = new ConjuntoPalavrasUnicas();

        conjuntoDePalavras.adicionarPalavra("joshua");
        System.out.println(conjuntoDePalavras.exibirPalavras());
        conjuntoDePalavras.removerPalavra("joshua");
        System.out.println(conjuntoDePalavras.exibirPalavras());
    }

}
