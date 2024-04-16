package br.com.jrmapp.main;

import br.com.jrmapp.models.Conta;
import br.com.jrmapp.models.Produto;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("******************\nBem-vindo ao seu app de compras!\n");

        System.out.println("Digite o seu nome: ");
        String nome = scan.nextLine();
        System.out.println("Digite o seu saldo atual: ");
        float saldo = scan.nextFloat();
        scan.nextLine();

        Conta contaUsuario = new Conta(nome, saldo);
        ArrayList<Produto> listaCompras = new ArrayList<>();

        int determinante = 1;
        while (true) {
            System.out.println("0 para sair, 1 para realizar uma compra: ");
            determinante = scan.nextInt();
            scan.nextLine();

            if (determinante == 0){
                break;
            }

            System.out.println("Qual é o nome do produto? ");
            String nomeProduto = scan.nextLine();
            System.out.println("Qual é o preco dele? ");
            float precoProduto = scan.nextFloat();
            scan.nextLine();
            Produto novoProduto = new Produto(nomeProduto, precoProduto);
            listaCompras.add(novoProduto);

            contaUsuario.comprar(novoProduto);
        }

        System.out.println("*******************\nCompras realizadas: ");
        contaUsuario.mostrarCompras(listaCompras);
        System.out.println("\n*******************");
    }
}
