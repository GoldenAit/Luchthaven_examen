package be.ehb.examen.Persoon;

public class Persoon {
    // eigenschappen => datamembers , variables
    public String naam;
    public int leeftijd;
    public String adres;
    // Dit is voor de contructor en de  getters en setters
    public Persoon(String naam, int leeftijd, String adres) {
        this.naam = naam;
        this.leeftijd = leeftijd;
        this.adres = adres;

}

    // Getters en setters
    public String getNaam() {
        return naam;
    }

    public void setNaam(String naam) {
        this.naam = naam;
    }

    public int getLeeftijd() {
        return leeftijd;
    }

    public void setLeeftijd(int leeftijd) {
        this.leeftijd = leeftijd;
    }

    @Override
    public String toString() {
        return "Naam: " + naam + ", Leeftijd: " + leeftijd;
    }
}



