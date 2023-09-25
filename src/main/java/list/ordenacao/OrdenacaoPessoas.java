package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoas {

    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordernarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordernarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;

    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("João", 75, 1.80);
        ordenacaoPessoas.adicionarPessoa("Maria", 30, 1.60);
        ordenacaoPessoas.adicionarPessoa("José", 15, 1.70);
        ordenacaoPessoas.adicionarPessoa("Ana", 50, 1.50);
        ordenacaoPessoas.adicionarPessoa("Pedro", 60, 1.90);

        System.out.println("Lista original: " + ordenacaoPessoas.pessoaList);
        System.out.println("Ordenado por idade: " + ordenacaoPessoas.ordernarPorIdade());
        System.out.println("Ordenado por altura: " + ordenacaoPessoas.ordernarPorAltura());

    }
}
