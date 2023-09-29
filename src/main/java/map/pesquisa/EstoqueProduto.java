package main.java.map.pesquisa;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProduto {

    private Map<Long,Produto> estoqueProdutosMap;

    public EstoqueProduto(){
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade){
        this.estoqueProdutosMap.put(codigo, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos(){
        System.out.println(this.estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque(){
        double valorTotalEstoque = 0.0;

        if(!this.estoqueProdutosMap.isEmpty()){
            for(Produto p : this.estoqueProdutosMap.values()){
                valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }

            return valorTotalEstoque;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Produto obterProdutoMaisCaro(){
        Produto produtoMaisCaro = null;
        double precoMaisCaro = Double.MIN_VALUE;

        if(!this.estoqueProdutosMap.isEmpty()){
            for(Produto p : this.estoqueProdutosMap.values()){
                if(p.getPreco() > precoMaisCaro){
                    precoMaisCaro = p.getPreco();
                    produtoMaisCaro = p;
                }
            }

            return produtoMaisCaro;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        for (Produto p : estoqueProdutosMap.values()) {
            if (p.getPreco() < menorPreco) {
                produtoMaisBarato = p;
                menorPreco = p.getPreco();
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorNoEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProduto estoqueProduto = new EstoqueProduto();
        estoqueProduto.adicionarProduto(1, "Arroz", 10.0, 10);
        estoqueProduto.adicionarProduto(2, "Feijão", 5.0, 10);
        estoqueProduto.adicionarProduto(3, "Macarrão", 3.0, 10);
        estoqueProduto.exibirProdutos();
        System.out.println(estoqueProduto.calcularValorTotalEstoque());
        System.out.println(estoqueProduto.obterProdutoMaisCaro());
        System.out.println(estoqueProduto.obterProdutoMaisBarato());
        System.out.println(estoqueProduto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
    }

}
