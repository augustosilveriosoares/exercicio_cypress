public abstract class Factory {

    Carro fabrica(String modelo){
        System.out.println("--------------------------");
        System.out.println("Fabricando: "+modelo);
        System.out.println("Concluído");
        System.out.println("--------------------------");
        return new Carro();
    }

    abstract String recuperaCarro();
}
