public class Usuario {
    public static void main(String[] args) throws Exception {
        

        SmarTv smartTv = new SmarTv();

        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.aumentarVolume();
        smartTv.diminuirVolume();
        

        smartTv.mudarCanal(30);
        smartTv.aumentarCanal();
        smartTv.aumentarCanal();
        smartTv.mudarCanal(100);
        smartTv.diminuirCanal();

        System.out.println("Tv ligada ? " + smartTv.ligada);
        System.out.println("Canal Atual ? " + smartTv.canal);
        System.out.println("Volume Atual ? " + smartTv.volume);

        smartTv.desligar();
        System.out.println("Novo status -> Tv ligada ? " + smartTv.ligada);

        
    }
}
