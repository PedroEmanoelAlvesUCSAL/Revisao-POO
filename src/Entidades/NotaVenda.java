package Entidades;

import java.util.ArrayList;
import java.util.List;

public class NotaVenda {
    private String data;
    private Integer numero;

    private Cliente cliente;
    List<ItensNota> itens = new ArrayList<>();

    public NotaVenda(String data, Integer numero, Cliente cliente) {
        this.data = data;
        this.numero = numero;
        this.cliente = cliente;
    }

    public String getData() {
        return data;
    }

    public Integer getNumero() {
        return numero;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public List<ItensNota> getItens() {
        return itens;
    }

    public void addItem(ItensNota item){
        itens.add(item);
    }

    public void removeItem(ItensNota item){
        itens.remove(item);
    }

    public Double total(){
        double soma = 0;
        for (ItensNota obj : itens){
            soma += obj.subtotal();
        }

        return soma;
    }

    @Override
    public String toString() {
        String saidaDados = "";
        saidaDados += "Momento da pedido: " + data + "\n" + cliente;
        for(ItensNota obj : itens){
            saidaDados += obj;
        }
        saidaDados += "\nValor Total: " + total();
        return saidaDados;
    }
}
