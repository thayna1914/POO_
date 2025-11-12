public class ClienteRegular extends Cliente{

    public ClienteRegular(String nome, double valorDaCompra){
        super(nome, valorDaCompra);
    }

     @Override
    public double calcularPagamento(){
        return getValorDaCompra();
}
    public String toString(){
        return "Cliente: " + "Valor da Compra: ";
    }
}