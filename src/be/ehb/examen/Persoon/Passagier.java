package be.ehb.examen.Persoon;

import be.ehb.examen.Ticket;

public class Passagier extends Persoon {

    private double bagageGewicht;
    private String ticketNummer; // Consistente naamgeving

    public Passagier(String naam, int leeftijd, String adres, double bagageGewicht) {
        super(naam, leeftijd, adres); // Correcte aanroep van de superklasse constructor
        this.bagageGewicht = bagageGewicht;
        this.ticketNummer = null; // Ticket is initieel null
    }

    // Getters en setters
    public double getBagageGewicht() {
        return bagageGewicht;
    }

    public void setBagageGewicht(double bagageGewicht) {
        this.bagageGewicht = bagageGewicht;
    }

    public String getTicketNummer() { // Consistente naamgeving
        return ticketNummer;
    }

    public void setTicketNummer(String ticketNummer) { // Consistente naamgeving
        this.ticketNummer = ticketNummer;
    }

    @Override
    public String toString() {
        return super.toString() + ", Bagage: " + bagageGewicht + "kg, Ticket: " + ticketNummer;
    }
}