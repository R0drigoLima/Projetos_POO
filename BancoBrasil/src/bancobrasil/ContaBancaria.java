/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancobrasil;

/**
 *
 * @Rodrigo Lima
 */
public class ContaBancaria {
    //Atributos da Classe
    String agencia;
    String conta;
    double saldo;
    Usuario proprietario;
    //Metodos(Comportamentos) da classe
    void depositar(double valor){
        this.saldo += valor;
    }
    
    void sacar(double valor){
        if(valor>this.saldo){
            System.out.println("O valor disponivel na conta é insuficiente !");
        }else{
            this.saldo -= valor;
        }   
    }
    
    void transferir(){
        
    }
    
    String consultarSaldo(){
        //String.format método da classe String para utilizar formatação
        //com indentificadores (%d, %f %s).
        return String.format("Seu saldo é : R$ %.2f",this.saldo);
    }
        
}
