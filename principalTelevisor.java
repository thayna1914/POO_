public class principalTelevisor{
    public static void main(String [] args){
        Televisor t = new Televisor();
        ControleRemoto c = new ControleRemoto(t);

        c.ligar();
        c.aumentarVolume();
        c.trocarCanal(5);
        c.exibirStatus();

        c.diminuirVolume();
        c.trocarCanal(13);
        c.exibirStatus();

        c.desligar();
        c.exibirStatus();
    }

}
