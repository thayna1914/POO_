public class Conta{

 //Atributos

private int numeroConta;
private String nomeCliente;
private int saldo;
private boolean estaAtiva;

//Construtor

public Conta(int numeroConta, String nomeCliente){
    this.numeroConta = numeroConta;
    this.nomeCliente = nomeCliente;
    this.saldo = 0;
    this.estaAtiva = true;
}

//Métodos 

public void Depositar(double valor){
    if(valor > 0 && estaAtiva){
        saldo += valor;
    } else {
        System.out.println("Algo deu errado, tente novamente!"); 
    }
}

public void Sacar(double valor){
    if(valor <= saldo && estaAtiva && valor > 0){
        saldo -= valor;
    } else {
        System.out.println("Algo deu errado, tente novamente!");
    }
 }

public void Desativar(){
    estaAtiva = false;
}

public void Ativar(){
    estaAtiva = true;
}



//Gets e Sets 

public int getNumeroConta(){
    return numeroConta;
}

public void setNumeroConta( int novoNumeroConta){
    this.numeroConta = novoNumeroConta;
}

public String getNomeCliente(){
    return nomeCliente;
}

public void setNomeCliente(String novoNomeCliente){
    this.nomeCliente = novoNomeCliente;
}

public int getSaldo(){
    return saldo;
}

public void setSaldo(int novoSaldo){
    this.saldo = novoSaldo;
}

public boolean getEstaAtiva(){
    return estaAtiva;
}

public void setEstaAtiva(boolean novoEstaAtiva){
    this.estaAtiva = novoEstaAtiva;
    
}

public void exibir(){
    System.out.println(toString());
}
public String toString(){
    return String.format("Número da conta: %d, Nome do cliente: %s, Saldo: %d, Ativada: %s", numeroConta, nomeCliente, saldo, estaAtiva ? "sim" : "não");
}
  }
 
