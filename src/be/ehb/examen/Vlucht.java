package be.ehb.examen;

import be.ehb.examen.Persoon.Passagier;
import be.ehb.examen.Persoon.Personeelslid;

import java.util.ArrayList;
import java.util.List;

public class Vlucht {
    private String vluchtCode; // camelCase
    private String bestemming; // camelCase
    private int aantalPlaatsenEconomy;
    private int aantalPlaatsenBusiness;
    private int capaciteit; // Totale capaciteit
    private List<Passagier> economischPassagiers;
    private List<Passagier> businessPassagiers;
    private List<Personeelslid> personeel;

    public Vlucht(String vluchtCode, String bestemming, int aantalPlaatsenEconomy, int aantalPlaatsenBusiness) {
        this.vluchtCode = vluchtCode;
        this.bestemming = bestemming;
        this.aantalPlaatsenEconomy = aantalPlaatsenEconomy;
        this.aantalPlaatsenBusiness = aantalPlaatsenBusiness;
        this.capaciteit = aantalPlaatsenEconomy + aantalPlaatsenBusiness; // Bereken de totale capaciteit
        this.economischPassagiers = new ArrayList<>();
        this.businessPassagiers = new ArrayList<>();
        this.personeel = new ArrayList<>();
    }

    // Getters
    public String getVluchtCode() {
        return vluchtCode;
    }

    public String getBestemming() {
        return bestemming;
    }

    public int getAantalPlaatsenEconomy() {
        return aantalPlaatsenEconomy;
    }

    public int getAantalPlaatsenBusiness() {
        return aantalPlaatsenBusiness;
    }

    public int getCapaciteit() {
        return capaciteit;
    }

    public List<Passagier> getEconomischPassagiers() {
        return economischPassagiers;
    }

    public List<Passagier> getBusinessPassagiers() {
        return businessPassagiers;
    }

    public List<Personeelslid> getPersoneel() {
        return personeel;
    }

    // Methoden voor functionaliteit (voorbeeld)
    public void voegPassagierToe(Passagier passagier, String klasse) {
        if (klasse.equals(Ticket.ECONOMY)) {
            if (economischPassagiers.size() < aantalPlaatsenEconomy) {
                economischPassagiers.add(passagier);
            } else {
                throw new IllegalArgumentException("Economisch class is vol.");
            }
        } else if (klasse.equals(Ticket.BUSINESS)) {
            if (businessPassagiers.size() < aantalPlaatsenBusiness) {
                businessPassagiers.add(passagier);
            } else {
                throw new IllegalArgumentException("Business class is vol.");
            }
        } else {
            throw new IllegalArgumentException("Ongeldige klasse.");
        }
    }

    public boolean isVol() {
        return economischPassagiers.size() + businessPassagiers.size() >= capaciteit;
    }

    @Override
    public String toString() {
        return "Vluchtcode: " + vluchtCode + ", Bestemming: " + bestemming +
                ", Economy plaatsen: " + aantalPlaatsenEconomy + ", Business plaatsen: " + aantalPlaatsenBusiness +
                ", Totale capaciteit: " + capaciteit;
    }
}