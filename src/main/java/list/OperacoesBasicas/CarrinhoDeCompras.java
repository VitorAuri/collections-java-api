package main.java.list.OperacoesBasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> listaItens;

    public CarrinhoDeCompras() {this.listaItens = new ArrayList<>();}

    public void adicionarItem(String nome, double preco, int quantidade) {
        List<Item> itensParaAdicionar = new ArrayList<>();
        for (int i=1;i<=quantidade;i++) {
            itensParaAdicionar.add(new Item(nome, preco));
        }
        listaItens.addAll(itensParaAdicionar);
    }

    public void removerItem(String nome) {
        List<Item> itensParaRemover = new ArrayList<>();
        for (Item item : listaItens) {
            if (item.getNome().equalsIgnoreCase(nome))
                itensParaRemover.add(item);
        }
        listaItens.removeAll(itensParaRemover);
    }

    public void calcularValorTotal() {
        double valorTotal = 0;
        for (Item item : listaItens) {
            valorTotal += item.getPreco();
        }
        System.out.println("Valor total: " + valorTotal);
    }

    public void numeroTotalItens(){
        System.out.println(listaItens.size());
    }

    public void exibirItens() {
        System.out.println(listaItens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();
        carrinho.adicionarItem("Brinquedo",20.0,10);
        carrinho.adicionarItem("Sundae",10.0,2);
        carrinho.exibirItens();
//        carrinho.numeroTotalItens();
//        carrinho.calcularValorTotal();
//        carrinho.removerItem("Brinquedo");
//        carrinho.numeroTotalItens();
//        carrinho.calcularValorTotal();
    }
}
