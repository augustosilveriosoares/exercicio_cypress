public class Main {

    public static void main (String args[]){

        Factory factory1 = new HondaFactory();
        Factory factory2 = new TeslaFactory();
        String modelo1 = factory1.recuperaCarro();
        String modelo2 = factory2.recuperaCarro();
        Carro carro = factory1.fabrica(modelo1);
        Carro carro2 = factory2.fabrica(modelo2);
    }
}
