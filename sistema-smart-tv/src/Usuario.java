public class Usuario {
  public static void main(String[] args) {
    SmartTv smartTv = new SmartTv();

    smartTv.diminuirVolume();
    smartTv.diminuirVolume();
    smartTv.aumentarVolume();
    System.out.println("Volume atual :" + smartTv.volume);

    System.out.println("Tv esta ligada ?" + smartTv.ligada);
    System.out.println("Canal Atual ?" + smartTv.canal);
    System.out.println("Tv Ligada ?" + smartTv.volume);

    smartTv.ligar();
    smartTv.desligar();

  }
}
