package com.company;

import java.util.Scanner;

public class Atividade18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Qual o tamanho do arquivo em mMB que deseja baixar? ");
        double tamnhoArquivo = scanner.nextDouble();
        System.out.print(" E a velocidade, em MBps, da conexão que deseja baixar? ");
        double velocidadedInternet = scanner.nextDouble();
        double tempoDeDownload = tamnhoArquivo / (velocidadedInternet / 8) / 60;
        System.out.printf("O tempo necessário para download do arquivo é: %.2f minutos.", tempoDeDownload);
        scanner.close();
    }
}
