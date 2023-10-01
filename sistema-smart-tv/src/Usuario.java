public class Usuario {
    public static void main(String[] args) throws Exception {
       
        SmartTv smartTv = new SmartTv();
        
        smartTv.ligar ();
          System.out.println("Novo Status-> TV Ligada: " + smartTv.ligada);

        smartTv.desligar();
          System.out.println("Novo Status-> TV Ligada: " + smartTv.ligada);
        
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();
         smartTv.aumentarVolume();
        System.out.println("volume Atual: " + smartTv.volume);

        System.out.println("novo canal: " + smartTv.canal);
        smartTv.mudarCanal(10);
        System.out.println("novo canal: " + smartTv.canal);

        System.out.println("TV Ligada: " + smartTv.ligada);
        System.out.println("Canal Atual: "+ smartTv.canal);
        System.out.println("Volume Atual: " + smartTv.volume);

        

        

    }
}
