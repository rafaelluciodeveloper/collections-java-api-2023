package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionario;

    public Dicionario(){
        this.dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String significado){
        this.dicionario.put(palavra, significado);
    }

    public void removerPalavra(String palavra){
        if(!this.dicionario.isEmpty()){
            this.dicionario.remove(palavra);
        }else{
            throw new RuntimeException("O dicionário está vazio.");
        }
    }

    public String pesquisarPorPalavra(String palavra){
        String definicao = dicionario.get(palavra);
        if (definicao != null) {
            return definicao;
        }
        return "Linguagem não encontrada no dicionário.";
    }

    public void exibirPalavras(){
        if (!dicionario.isEmpty()) {
            System.out.println(dicionario);
        } else {
            System.out.println("O dicionário está vazio.");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();
        dicionario.adicionarPalavra("Java", "Linguagem de programação.");
        dicionario.adicionarPalavra("Python", "Linguagem de programação.");
        dicionario.adicionarPalavra("C", "Linguagem de programação.");
        dicionario.exibirPalavras();
        System.out.println(dicionario.pesquisarPorPalavra("Java"));
        dicionario.removerPalavra("Java");
        dicionario.exibirPalavras();
    }

}
