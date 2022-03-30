package com.company;

import java.util.Scanner;

public class Atividade17 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Qual o tamnho, em metros quadrados, da área desejada: ");
        double tamanhoEmMetrosQuadrados = scanner.nextDouble();
        byte quantidadeDeLitrosPorMetros = 3;
        byte quantidadeDeLataporTinta  = 18;
        byte preçoDaLata = 80;

        double corbeturaDaTintaEmLata = tamanhoEmMetrosQuadrados / quantidadeDeLitrosPorMetros;
        double quantidadeDeLata = corbeturaDaTintaEmLata / quantidadeDeLataporTinta;
        double quantidadePagaPorLata = quantidadeDeLata * preçoDaLata;

        double quantidadeDeTintaPorGalao = 3.6;
        int preçoDoGalao = 25;

        double corbeturaDatintaPorGalao = tamanhoEmMetrosQuadrados / quantidadeDeTintaPorGalao;
        double quantodadeDeGlalao = corbeturaDatintaPorGalao / quantidadeDeTintaPorGalao;
        double quatidadePagaPorGalao = quantodadeDeGlalao * preçoDoGalao;

        double quanntidadePagaPorLataArredondado = Math.ceil(quantidadePagaPorLata);
        double quantodadeDeGalaoArredondado = Math.ceil(quatidadePagaPorGalao);




    }
}
