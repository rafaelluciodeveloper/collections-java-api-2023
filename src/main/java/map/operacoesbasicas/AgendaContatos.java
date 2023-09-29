package main.java.map.operacoesbasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String,Integer> agendaContatosMap;

    public AgendaContatos(){
        this.agendaContatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome,Integer telefone){
        this.agendaContatosMap.put(nome,telefone);
    }

    public void removerContato(String nome){
        if(!this.agendaContatosMap.isEmpty()){
            this.agendaContatosMap.remove(nome);
        }else{
            throw new RuntimeException("A agenda de contatos está vazia.");
        }
    }

    public void exibirContatos(){
        if (!agendaContatosMap.isEmpty()) {
            System.out.println(agendaContatosMap);
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
    }

    public Integer pesquisarPorNome(String nome){
        Integer numeroPorNome = null;
        if (!agendaContatosMap.isEmpty()) {
            numeroPorNome = agendaContatosMap.get(nome);
            if (numeroPorNome == null) {
                System.out.println("Contato não encontrado na agenda.");
            }
        } else {
            System.out.println("A agenda de contatos está vazia.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();
        agendaContatos.adicionarContato("João", 1);
        agendaContatos.adicionarContato("Maria", 2);
        agendaContatos.adicionarContato("José", 3);
        agendaContatos.exibirContatos();
        System.out.println(agendaContatos.pesquisarPorNome("João"));
        agendaContatos.removerContato("João");
        agendaContatos.exibirContatos();
    }

}
