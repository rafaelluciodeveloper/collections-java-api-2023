package main.java.list.ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    
    private List<Integer> numerosList;
    
    public OrdenacaoNumeros(){
        this.numerosList = new ArrayList<>();
    }
    
    public void adicionar(Integer numero){
        numerosList.add(numero);
    }
    
    public List<Integer> ordernarAscendente(){
        List<Integer> numerosAscendente = new ArrayList<>(numerosList);
        if(!numerosAscendente.isEmpty()) {
            Collections.sort(numerosAscendente);
        }
        return numerosAscendente;
    }
    
    public void exibirNumeros(){
        if(!numerosList.isEmpty()) {
            System.out.println(this.numerosList);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public List<Integer> orderDescendente(){
        List<Integer> numerosDescendentes = new ArrayList<>(numerosList);
        if(!numerosDescendentes.isEmpty()) {
            numerosDescendentes.sort(Collections.reverseOrder());
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
        return numerosDescendentes;
    }
}
