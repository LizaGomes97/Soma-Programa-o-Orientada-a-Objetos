/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.portifolio.soma.orientadoaobjetos;

import java.util.Scanner;

/**
 *
 * @author Liza
 */
public class PortifolioSomaOrientadoAObjetos {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Vamos realizar uma soma simples? Me ajude\n");
        System.out.print("Digite o primeiro numero: ");
        double Valor1 = scanner.nextDouble();
        System.out.print("Digite o segundo numero: ");
        double Valor2 = scanner.nextDouble();
        
        double Soma = Valor1 + Valor2;
        
        System.out.print("A soma de " + Valor1 + " + " + Valor2 + " foi igual a " + Soma);
        
        scanner.close();
    }
}
