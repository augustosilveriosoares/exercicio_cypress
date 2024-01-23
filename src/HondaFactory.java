public class HondaFactory extends Factory {
    @Override
    String recuperaCarro() {
        System.out.println("Pedido para a Fabrica: Civic ELX");
        return "Civic ELX";
    }
}
