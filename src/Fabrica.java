import java.util.ArrayList;
import java.util.HashSet;

public class Fabrica {
    private static HashSet<Angajat> angajati = new HashSet<Angajat>();
    private static HashSet<Client> clienti = new HashSet<Client>();
    private static ArrayList<Act> acte = new ArrayList<Act>();
    public HashSet<Angajat> getAngajati() {
        return angajati;
    }
    public HashSet<Client> getClienti() {
        return clienti;
    }
    public ArrayList<Act> getActe() {
        return acte;
    }
    public static void adaugareAngajat(Angajat a)
    {
        angajati.add(a);
    }
    public static void concediereAngajat(Angajat a)
    {
        for(Angajat x:angajati)
        {
            if(x.equals(a))
            {
                angajati.remove(a);
            }
        }
    }
    public static void adaugareClient(Client c)
    {
        clienti.add(c);
    }
    public static void afisareClienti()
    {
        for(Client c: clienti)
        {
            System.out.println(c);
        }
    }
    public void generareContract(Oferta o)
    {
        acte.add(o);
    }
    public boolean eliberareFluturas(FluturasSalariu f) throws AngajatConcediatException
    {
        for(Angajat a: angajati)
        {
            if(a.equals(f.getAngajat()))
            {
                return true;
            }
        }
        throw new AngajatConcediatException();
    }
    public static void main(String[] args) {
        Angajat Denis = new Muncitor("Denis","Damse","Informatician",1500,5);
        Angajat Caleb = new Muncitor("Caleb","Motiu","Informatician",2000,5);
        Angajat Nicolae = new Manager("Nicolae", "Popescu", "Inginer", 4000, 45);
        System.out.println("Salariu "+Denis);
        Denis.afisareSalariu();
        System.out.println("Salariu "+Caleb);
        Caleb.afisareSalariu();
        Denis.afisareNumeFunctie();
        Fabrica.adaugareAngajat(Denis);
        Fabrica.adaugareAngajat(Caleb);
        Fabrica.adaugareAngajat(Nicolae);
        Client client1 = new Client("Donalt Trump");
        Client client2 = new Client("Celalalt");
        Fabrica.adaugareClient(client1);
        Fabrica.adaugareClient(client2);
        Fabrica.afisareClienti();
    }
}
