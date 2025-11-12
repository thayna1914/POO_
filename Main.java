public class Main {
    public static void main(String[] args) {
        Mercadinho m = new Mercadinho();
    

        m.adicionarCliente(new ClienteOuroVip("Damon", 700, "0101", "Guarabira"));
        m.adicionarCliente(new ClienteRegular("Stefan", 300, "0202", "Guarabira"));
        m.adicionarCliente(new ClienteOuroVip("Herllan", 100, "0303", "Alagoa Grande"));
        m.adicionarCliente(new ClienteVip("Thayná", 200, "1915", "Alagoinha"));
        m.adicionarCliente(new ClienteVip("Emilly", 2019, "2911"), "Guarabira");

        m.imprimirClientes();
    }

}
