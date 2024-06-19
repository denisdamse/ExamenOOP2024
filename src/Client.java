public class Client {
    private String nume;

    public String getNume() {
        return nume;
    }

    public Client(String nume) {
        this.nume = nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    @Override
    public String toString() {
        return nume;
    }
    
}
