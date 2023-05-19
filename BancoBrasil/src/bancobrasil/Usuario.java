
package bancobrasil;

import java.util.Date;

/**
 *
 * @author RodrigoLima
 */
public class Usuario {
    private String nome;
    private String sobrenome;
    private String telefone;
    private Date dataRegistro = new Date();
    //Construtores
    public Usuario(){};

    public Usuario(String nome, String sobrenome, String telefone){
        this.nome =nome;
        this.sobrenome = sobrenome;
        this.telefone = telefone;
    }
    //Get e Set
    public String getNome(){
        return this.nome;
    }

    public String getSobrenome(){
        return this.sobrenome;
    }

    public String getTelefone(){
        return this.telefone;
    }

    public Date getDataRegistro(){
        return this.dataRegistro;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setSobrenome(String sobrenome){
        this.sobrenome = sobrenome;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setDataregistro(Date dataregistro){
        this.dataRegistro = dataregistro;
    }
    String imprimirInfo(){
        return String.format("Nome: %s\n Sobrenome: %s\n Telefone: %s\n Data: %s\n",
                          this.nome,this.sobrenome,this.telefone,this.dataRegistro);
    }
    
}
