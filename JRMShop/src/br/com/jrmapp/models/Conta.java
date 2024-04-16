package br.com.jrmapp.models;

import java.util.ArrayList;
import java.util.Comparator;

public class Conta{
    private String nome;
    private float saldo;

    public Conta(String nome, float saldo){
        this.nome = nome;
        this.saldo = saldo;
    }

    public void comprar(Produto p){
        if (p.getPreco()> this.saldo){
            System.out.println("Saldo insuficiente para a realização da compra");
        }else{
            this.saldo -= p.getPreco();
            System.out.println("Compra realizada com sucesso! seu saldo agora é de: R$ " + this.saldo);
        }
    }

    public void mostrarCompras(ArrayList<Produto> c){
        c.sort(Comparator.comparing(Produto::getPreco));
        for (int i = 0; i< c.size(); i++){
            System.out.println(c.get(i).getNome() + "("+ c.get(i).getPreco() + ")");
        }
    }

    public String getNome() {
        return nome;
    }

    public float getSaldo() {
        return saldo;
    }
}
