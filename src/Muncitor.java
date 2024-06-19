import java.util.ArrayList;

public class Muncitor extends Angajat{
    private ArrayList<String> responsabilitati = new ArrayList<String>();

    public ArrayList<String> getResponsabilitati() {
        return responsabilitati;
    }

    public Muncitor(String nume, String prenume, String functie, int salariu, int aniVechime) {
        super(nume, prenume, functie, salariu, aniVechime);
    }
    
}
