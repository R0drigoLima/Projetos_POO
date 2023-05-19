
package bancobrasil;

/**
 *
 * @RodrigoLima
 */
public class ContaBancaria {
    //Atributos da Classe
    String agencia;
    String conta;
    double saldo;
    Usuario proprietario;
    //Construtores
    public ContaBancaria(){};

    public ContaBancaria(String agencia, String conta, double saldo, Usuario proprietario){
        this.agencia = agencia;
        this.conta = conta;
        this.saldo = saldo;
        this.proprietario = proprietario;
    } 
    //Get e Set
    public String getAgencia(){
        return agencia;
    }

    public String getConta(){
        return conta;
    }

    public double getSaldo(){
        return saldo;
    }

    public Usuario getProprietario(){
        return proprietario;
    }

    public void setAgencia(String agencia){
        this.agencia = agencia;
    }

    public void setConta(String conta){
        this.conta = conta;
    }

    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void setProprietario(Usuario proprietario){
        this.proprietario = proprietario;
    }

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
    
    void transferir(ContaBancaria contabancaria, double valor){
        if(valor<=this.saldo){
            this.sacar(valor);
            contabancaria.saldo += valor;
        }else{
            System.out.println("O valor disponivel na conta é insuficiente !");
        }
        
            
    }
    
    String consultarSaldo(){
        //String.format método da classe String para utilizar formatação
        //com indentificadores (%d, %f %s).
        return String.format("Seu saldo é : R$ %.2f",this.saldo);
    }
        
}
