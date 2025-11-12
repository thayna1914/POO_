public class ClienteOuroVip extends ClienteVip{
    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco) {
        super(nome, valorDaCompra, numeroCartao);
        this.endereco = endereco;
    }

     @Override
    public double calcularPagamento(){
        return getValorDaCompra() * (15/100);
}

 public String toString(){
        return "Cliente: " + "Valor da Compra: " + "Número do Cartão: " + "Endereço: ";
    }
}