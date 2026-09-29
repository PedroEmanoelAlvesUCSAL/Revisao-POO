package Aplicacao;

import Entidades.Cliente;
import Entidades.ItensNota;
import Entidades.NotaVenda;
import Entidades.Produto;

import java.util.Scanner;

public class Programa {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String nome, email, dataNascimento, dataNota, nomeProduto;
        int numero, quantidadeItens, qtdProduto;
        Double precoProduto;

        System.out.println("Informe os dados do Cliente:");
        System.out.print("Nome: ");
        nome = scan.nextLine();
        System.out.print("Email: ");
        email = scan.nextLine();
        System.out.print("Data de Nascimento (DD/MM/YYYY): ");
        dataNascimento = scan.nextLine();

        Cliente cliente = new Cliente(nome, email, dataNascimento);

        System.out.println("Informe os dados da Nota de Vendas:");
        System.out.print("Qual a data da nota?  ");
        dataNota = scan.next();
        System.out.print("Numero: ");
        numero = scan.nextInt();

        NotaVenda nota = new NotaVenda(dataNota, numero, cliente);

        System.out.print("Quantos itens estarão na nota?");
        quantidadeItens = scan.nextInt();

        for(int i = 1; i<= quantidadeItens; i++){
            System.out.println("\nInforme os dados do item " +i+":");
            System.out.print("Nome do Produto: ");
            nomeProduto = scan.nextLine();
            scan.nextLine();
            System.out.print("Preço do produto: ");
            precoProduto = scan.nextDouble();
            Produto produto = new Produto(nomeProduto, precoProduto);

            System.out.print("Quantidade: ");
            qtdProduto = scan.nextInt();

            ItensNota item = new ItensNota(qtdProduto, precoProduto, produto);
            nota.addItem(item);
        }

        System.out.println("\nRESUMO DO PEDIDO: ");
        System.out.println(nota);
    }
}
