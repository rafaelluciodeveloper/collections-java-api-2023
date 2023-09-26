package main.java.set.operacoesbasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidado {
    
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidado() {
        this.convidadoSet = new HashSet<>();
    }
    
    public void adicionarCOnvidado(String nome, int codigoConvite){
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }
    
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidado = null;
        if(!convidadoSet.isEmpty()){
            for(Convidado c : convidadoSet){
                if(c.getCodigoConvite() == codigoConvite){
                    convidado = c;
                    break;
                }
            }
            convidadoSet.remove(convidado);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }
    
    public int contarConvidados(){
        return convidadoSet.size();
    }
    
    public void exibirConvidados(){
        if(!convidadoSet.isEmpty()){
            System.out.println(this.convidadoSet);
        }else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidado conjuntoConvidado = new ConjuntoConvidado();
        conjuntoConvidado.adicionarCOnvidado("João", 1);
        conjuntoConvidado.adicionarCOnvidado("Maria", 2);
        conjuntoConvidado.adicionarCOnvidado("José", 3);
        conjuntoConvidado.exibirConvidados();
        conjuntoConvidado.removerConvidadoPorCodigoConvite(2);
        conjuntoConvidado.exibirConvidados();
        System.out.println("Quantidade de convidados: " + conjuntoConvidado.contarConvidados());
    }
    
}
