package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProdutos() { this.estoqueProdutosMap = new HashMap<>();}

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome,quantidade,preco));
    }

    public void exibirProdutos() {
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
            for(Produto p : estoqueProdutosMap.values()) {
                valorTotalEstoque += p.getPreco();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if(!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if(p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                }
            }
        }
        return produtoMaisCaro;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();

        estoqueProdutos.adicionarProduto(2L,"Coca-cola",1,15.0);
        estoqueProdutos.adicionarProduto(1L,"Pepsi",2,10.0);
        estoqueProdutos.adicionarProduto(3L,"Fanta",1,13.0);
        estoqueProdutos.exibirProdutos();

        System.out.println("Valor total do estoque R$:"+estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("Produto mais caro:"+estoqueProdutos.obterProdutoMaisCaro());
    }
}
