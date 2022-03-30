package com.company.comecando.atividades;

import java.util.Scanner;

public class Atividade16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o tamanho, em metros quadrados, da área desejada:  ");
        double tamanhoEmMetrosQuadrados = scanner.nextDouble();
        int quantidadeDeLitrosPorMetros = 3;
        int quantidadeDeLataporTinta = 18;
        int preçoDaLata = 80;
        double coberturaDaTinta = tamanhoEmMetrosQuadrados / quantidadeDeLitrosPorMetros;
        double quantidadeDeLata = coberturaDaTinta / quantidadeDeLataporTinta;
        double preçoTotal = quantidadeDeLata * preçoDaLata;
        double quantidadeDeLataArrendodado = Math.ceil(quantidadeDeLata);
        System.out.println("A quantidade de latas é: " + quantidadeDeLataArrendodado);
        System.out.print("O preço total é: " + preçoTotal);
        scanner.close();
    }
}
