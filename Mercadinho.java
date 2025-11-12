public class Mercadinho{
    private Cliente[] clientes;

    public void adicionarCliente(Cliente c){
        for (int i = 0; i < clientes.length; i++) {
            clientes[i] = c;
            i++;
     }
    }

    public double calcularTotal(){
         double total = 0;
        for(int i = 0; i < clientes.length; i++){
        total += clientes[i].calcularPagamento();
     }
     return total;
    }

    public void imprimirClientes(){
    System.out.println(toString());

    }
}