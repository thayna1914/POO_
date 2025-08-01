public class PrincipalConta{
    public static void main(String[] args){
        Conta a = new Conta(4002, "Adrielle");
        Conta t = new Conta(8922, "Thayná");
        Conta p = new Conta(1024, "Pedro");

        System.out.println("---------Estado Inicial--------");
        System.out.println(a);
        System.out.println(t);
        System.out.println(p);
      
        //Depósitos
        a.Depositar(50);
        t.Depositar(35);
        p.Depositar(90);

        System.out.println("-----------Após Deposito-----------");
        System.out.println(a);
        System.out.println(t);
        System.out.println(p);
         
        //Alterar nome
        a.setNomeCliente("Adrielle");
        t.setNomeCliente("Thayná");
        p.setNomeCliente("Paulo");


        //Saques
        a.Sacar(300);
        t.Sacar(900);
        p.Sacar(200);

        System.out.println("----------Após Saques-----------");
        System.out.println(a);
        System.out.println(t);
        System.out.println(p);

        //Desativar contas
        a.Desativar();
        t.Desativar();
        p.Desativar();

        System.out.println("---------Pós Desativação--------");
        System.out.println(a);
        System.out.println(t);
        
    }
}
