package br.com.guilherme.tesch.principal;

import br.com.guilherme.tesch.modelos.Informacoes;

import java.util.Scanner;

public class Main {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Informacoes informacoes = new Informacoes();

        System.out.println("Digite o limete do cartão: ");
        informacoes.setLimiteCartao(scanner.nextDouble());

        System.out.println("Digite a descrição da compra: ");
        informacoes.setDescricaoDaCompra(scanner.nextLine());

        System.out.println("Digite o valor da compra: ");
        informacoes.setValorDaCompra(scanner.nextDouble());

    }
}
