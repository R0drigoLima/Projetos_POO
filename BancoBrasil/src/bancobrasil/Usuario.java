/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bancobrasil;

import java.util.Date;

/**
 *
 * @author programador
 */
public class Usuario {
    String nome;
    String sobrenome;
    String telefone;
    Date dataRegistro = new Date();
    
    String imprimirInfo(){
        return String.format("Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data: %s\n",
                          this.nome,this.sobrenome,this.telefone,this.dataRegistro);
    }
    
}
