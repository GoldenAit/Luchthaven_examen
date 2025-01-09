package be.ehb.examen.Persoon;

public class Personeelslid {
    String naam;
    String functie;

    public Personeelslid(String naam, String functie) {
        this.naam = naam;
        this.functie = functie;}

        @Override
        public String toString(){
            return "Naam: " + naam + ", Functie: " + functie;


        // Doel : Vertegenwoodigt een personeelslid
        // Erft over de classe Persoon
        // methoden getters en setters
    }
}
