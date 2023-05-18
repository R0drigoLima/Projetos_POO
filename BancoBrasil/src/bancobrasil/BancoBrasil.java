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
       Usuario user1 = new Usuario();
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
       //Construção e inserção de dados do usuário.
       System.out.println("Dados do Usuário");
       System.out.println("Digite o nome do cliente :");
       user1.nome = scan.next();
       System.out.println("Digite o sobrenome do cliente :");
       user1.sobrenome = scan.next();
       System.out.println("Digite o telefone do cliente :");
       user1.telefone = scan.next();
       contaBancaria1.proprietario = user1;
       System.out.println("Digite o valor de deposito :");
       contaBancaria1.depositar(scan.nextDouble());
       
       System.out.println(contaBancaria1.agencia+"\n"
                + contaBancaria1.conta+ "\n"
                + contaBancaria1.proprietario.imprimirInfo()+ "\n"
                + contaBancaria1.consultarSaldo());
       
       System.out.println("Digite o valor para saque :");
       contaBancaria1.sacar(scan.nextDouble());
       
       System.out.println(contaBancaria1.consultarSaldo());
    }
}
