public class Oferta extends Act{
    private Client client;
    private int valoareTotala;
    public Client getClient() {
        return client;
    }
    public int getValoareTotala() {
        return valoareTotala;
    }
    public Oferta(String id, String numarUnicIdentificare, Client client, int valoareTotala) {
        super(id, numarUnicIdentificare);
        this.client = client;
        this.valoareTotala = valoareTotala;
    }
}
