import java.util.ArrayList;

public class Manager extends Angajat{
    private ArrayList<Muncitor> muncitoriSubordine = new ArrayList<Muncitor>();
    
    public Manager(String nume, String prenume, String functie, int salariu, int aniVechime) {
        super(nume, prenume, functie, salariu, aniVechime);
    }

    public ArrayList<Muncitor> getMuncitoriSubordine() {
        return muncitoriSubordine;
    }
}
