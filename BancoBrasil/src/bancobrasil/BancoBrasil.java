/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancobrasil;

import java.util.Scanner;

/**
 *
 * @Rodrigo Lima
 */
public class BancoBrasil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Instanciando Objeto do tipo conta bancaria e referenciando nas 
        //variavel contaBancaria1 e contaBancaria2
       ContaBancaria contaBancaria1 = new ContaBancaria();
       ContaBancaria contaBancaria2 = new ContaBancaria();
       /*Atribuindo valores ao nosso Objeto
       contaBancaria1.agencia = "0001";
       contaBancaria1.conta = "12345";
       contaBancaria1.proprietario = "Junior";
       contaBancaria1.saldo = 1.99;
       
       System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta+ "\n"
                + contaBancaria1.proprietario+ "\n"
                + contaBancaria1.saldo);*/
       
       Scanner scan = new Scanner(System.in);
       
       System.out.println("BEM-VINDO AO BANCO DO BRASIL");
       System.out.println("CADASTRO DE CONTAS");
       System.out.println("Digite a agência :");
       contaBancaria1.agencia = scan.next();
       System.out.println("Digite a conta :");
       contaBancaria1.conta = scan.next();
       System.out.println("Digite o proprietario :");
       contaBancaria1.proprietario = scan.next();
       System.out.println("Digite o saldo inicial :");
       contaBancaria1.saldo = scan.nextDouble();
       
       System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta+ "\n"
                + contaBancaria1.proprietario+ "\n"
                + contaBancaria1.saldo);
    }
    
}
