public class Main {
    public static void main(String[] args) {
        Cachorro c = new Cachorro();
        c.reagir("Olá");
        c.reagir("Vai apanhar");

        c.reagir(11,45);
        c.reagir(19,00);
        c.reagir(true);
    }

}