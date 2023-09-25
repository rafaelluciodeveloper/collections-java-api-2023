package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemList;
    
    public CarrinhoDeCompras(){
        this.itemList =  new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade){
        Item item = new Item(nome, preco, quantidade);
        this.itemList.add(item);
    }
    
    public void removerItem(String nome){
        List<Item> itensParaRemover = new ArrayList<>();
        if (!itemList.isEmpty()) {
            for (Item i : itemList) {
                if (i.getNome().equalsIgnoreCase(nome)) {
                    itensParaRemover.add(i);
                }
            }
            itemList.removeAll(itensParaRemover);
        } else {
            throw new RuntimeException("A lista está vazia!");
        }    
    }
    
    public double calcularValorTotal(){
        double valorTotal = 0;
        if (!itemList.isEmpty()) {
            for (Item item : itemList) {
                valorTotal += item.getPreco() * item.getQuantidade();
            }
            return valorTotal;
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public void exibirItens(){
        if (!itemList.isEmpty()) {
            System.out.println(this.itemList);
        } else {
            System.out.println("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        carrinhoDeCompras.adicionarItem("Arroz", 10.0, 2);
        carrinhoDeCompras.adicionarItem("Feijão", 5.0, 3);
        carrinhoDeCompras.adicionarItem("Macarrão", 3.0, 1);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("Feijão");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
    }
    
}
