public abstract class Angajat {
    private String nume;
    private String prenume;
    private String functie;
    private int salariu;
    private int aniVechime;
    public String getNume() {
        return nume;
    }
    public String getPrenume() {
        return prenume;
    }
    public String getFunctie() {
        return functie;
    }
    public int getSalariu() {
        return salariu;
    }
    public int getAniVechime() {
        return aniVechime;
    }
    public Angajat(String nume, String prenume, String functie, int salariu, int aniVechime) {
        this.nume = nume;
        this.prenume = prenume;
        this.functie = functie;
        this.salariu = salariu;
        this.aniVechime = aniVechime;
    }
    public double afisareSalariu()
    {
        System.out.println(salariu+salariu*0.1*aniVechime);
        return salariu+salariu*0.1*aniVechime;
    }
    public String afisareNumeFunctie()
    {
        System.out.println(this.nume+" "+this.prenume+" "+this.functie);
        return this.nume+" "+this.prenume+" "+this.functie;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((nume == null) ? 0 : nume.hashCode());
        result = prime * result + ((prenume == null) ? 0 : prenume.hashCode());
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Angajat other = (Angajat) obj;
        if (nume == null) {
            if (other.nume != null)
                return false;
        } else if (!nume.equals(other.nume))
            return false;
        if (prenume == null) {
            if (other.prenume != null)
                return false;
        } else if (!prenume.equals(other.prenume))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return nume + " " + prenume;
    }
    
}