public class FluturasSalariu {
    private Angajat angajat;
    private int salar;
    public Angajat getAngajat() {
        return angajat;
    }
    public int getSalar() {
        return salar;
    }
    public FluturasSalariu(Angajat angajat, int salar) {
        this.angajat = angajat;
        this.salar = this.angajat.getSalariu();
    }
}
