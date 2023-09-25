package main.java.list.pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    
    private List<Integer> numerosList;
    
    public SomaNumeros(){
        this.numerosList = new ArrayList<>();
    }
    
    public void adicionarNumero(int numero){
        this.numerosList.add(numero);
    }
    
    public int somarNumeros(){
        int soma = 0;
        for (Integer numero : numerosList) {
            soma += numero;
        }
        return soma;
    }
    
    public int encontrarMaiorNumero(){
        int maiorNumero = Integer.MIN_VALUE;
        if(!numerosList.isEmpty()){
        for (Integer numero : numerosList) {
            if(numero >= maiorNumero){
                maiorNumero = numero;
            }
        }
        return maiorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public int encontrarMenorNumero(){
        int menorNumero = Integer.MAX_VALUE;
        if(!numerosList.isEmpty()){
        for (Integer numero : numerosList) {
            if(numero <= menorNumero){
                menorNumero = numero;
            }
        }
        return menorNumero;
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public void exibirNumeros(){
        if(!numerosList.isEmpty()){
            System.out.println(this.numerosList);
        }else{
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(20);
        somaNumeros.adicionarNumero(30);
        somaNumeros.adicionarNumero(40);
        somaNumeros.adicionarNumero(50);
        somaNumeros.exibirNumeros();
        System.out.println("Soma: " + somaNumeros.somarNumeros());
        System.out.println("Maior número: " + somaNumeros.encontrarMaiorNumero());
        System.out.println("Menor número: " + somaNumeros.encontrarMenorNumero());
    }
    
    
}
