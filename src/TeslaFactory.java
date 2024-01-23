import javax.xml.stream.FactoryConfigurationError;

public class TeslaFactory extends Factory {


    @Override
    String recuperaCarro() {
        System.out.println("Pedido para a Fabrica: Tesla Model S");
        return "Tesla Model S";
    }
}
