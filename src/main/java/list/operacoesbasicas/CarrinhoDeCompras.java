package main.java.list.operacoesbasicas;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itens;
    
    public CarrinhoDeCompras(){
        itens =  new ArrayList<>();
    }
    
    public void adicionarItem(Item item){
        itens.add(item);
    }
    
    public void removerItem(Item item){
        itens.remove(item);
    }
    
    public double calcularValorTotal(){
        double valorTotal = 0;
        for(Item item : itens){
            valorTotal += item.getPreco() * item.getQuantidade();
        }
        return valorTotal;
    }
    
    public void exibirItens(){
        System.out.println(itens);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();
        Item item1 = new Item("Arroz", 10.0, 2);
        Item item2 = new Item("Feijão", 5.0, 3);
        Item item3 = new Item("Macarrão", 3.0, 1);
        carrinhoDeCompras.adicionarItem(item1);
        carrinhoDeCompras.adicionarItem(item2);
        carrinhoDeCompras.adicionarItem(item3);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem(item2);
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total: " + carrinhoDeCompras.calcularValorTotal());
    }
    
}
