package be.ehb.examen;

import be.ehb.examen.Persoon.Passagier;
import java.util.UUID; // Voor het genereren van unieke ticketnummers


public class Ticket {
    private String ticketNummer;
    private Passagier passagier;
    private Vlucht vlucht;
    private String klasse; // "economy" of "business"
    public static final String ECONOMY = "economy"; // Constante voor economy class
    public static final String BUSINESS = "business"; // Constante voor business class

    public Ticket(Passagier passagier, Vlucht vlucht, String klasse) {
        this.ticketNummer = UUID.randomUUID().toString(); // Genereer uniek ticketnummer
        this.passagier = passagier;
        this.vlucht = vlucht;
        this.klasse = klasse;
    }

    // Getters
    public String getTicketNummer() {
        return ticketNummer;
    }

    public Passagier getPassagier() {
        return passagier;
    }

    public Vlucht getVlucht() {
        return vlucht;
    }

    public String getKlasse() {
        return klasse;
    }

    @Override
    public String toString() {
        return "Ticketnummer: " + ticketNummer + "\n" +
                "Passagier: " + passagier.getNaam() + "\n" +
                "Vlucht: " + vlucht.getVluchtCode() + " (" + vlucht.getBestemming() + ")\n" +
                "Klasse: " + klasse;
    }
}

