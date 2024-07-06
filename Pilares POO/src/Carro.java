public class Carro {
    public void ligar() {
        confereCambio();
        confereCombustivel();
        System.out.println("CARRO LIGADO");
    }
    public void confereCombustivel() {
        System.out.println("conferindo combustivel");
    }
    public void confereCambio() {
        System.out.println("conferindo cambio");
    }
}
