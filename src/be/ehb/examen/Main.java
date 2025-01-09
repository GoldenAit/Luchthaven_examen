package be.ehb.examen;

import be.ehb.examen.Persoon.Passagier;
import be.ehb.examen.Persoon.Personeelslid;
import be.ehb.examen.Persoon.Persoon;
import java.util.List;
import java.util.Scanner;
import java.util.ArrayList;
import be.ehb.examen.Ticket;
import be.ehb.examen.Vlucht;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner voor input (optioneel)

        // Maak een paar vluchten
        Vlucht vlucht1 = new Vlucht("MAR123", "Rabat", 200, 80);
        Vlucht vlucht2 = new Vlucht("CDG456", "Tokyo", 250, 50);

        // Maak een paar passagiers
        Passagier passagier1 = new Passagier("Ilias Ait", 30, "Straat 123", 20.5);
        Passagier passagier2 = new Passagier("thomas Jerry", 65, "Plein 456", 25.2);
        Passagier passagier3 = new Passagier("Goerge Bush", 95, "Laan 789", 25.8);

        // Boek tickets voor de passagiers
        Ticket ticket1 = new Ticket(passagier1, vlucht1, Ticket.ECONOMY); // Gebruik constanten
        Ticket ticket2 = new Ticket(passagier2, vlucht1, Ticket.BUSINESS); // Gebruik constanten
        Ticket ticket3 = new Ticket(passagier3, vlucht2, Ticket.ECONOMY); // Gebruik constanten

        // Koppel de ticketnummers aan de passagiers
        passagier1.setTicketNummer(ticket1.getTicketNummer());
        passagier2.setTicketNummer(ticket2.getTicketNummer());
        passagier3.setTicketNummer(ticket3.getTicketNummer());

        // Voeg passagiers toe aan de vluchten (met foutafhandeling)
        try {
            vlucht1.voegPassagierToe(passagier1, Ticket.ECONOMY); // Methode in Vlucht klasse (zie hieronder)
            vlucht1.voegPassagierToe(passagier2, Ticket.BUSINESS);
            vlucht2.voegPassagierToe(passagier3, Ticket.ECONOMY);
        } catch (IllegalArgumentException e) {
            System.err.println("Fout bij het toevoegen van passagier: " + e.getMessage());
        }

        // Print informatie over de vluchten en passagiers
        System.out.println(vlucht1);
        System.out.println(vlucht2);
        System.out.println(passagier1);
        System.out.println(passagier2);
        System.out.println(passagier3);
        System.out.println(ticket1);
        System.out.println(ticket2);
        System.out.println(ticket3);

        //Testen of het toevoegen van een passagier aan een vlucht werkt
        System.out.println("Passagiers op vlucht " + vlucht1.getVluchtCode() + ":");
        for (Passagier p: vlucht1.getEconomischPassagiers()){
            System.out.println(p.getNaam());
        }
        for (Passagier p: vlucht1.getBusinessPassagiers()){
            System.out.println(p.getNaam());
        }

        scanner.close(); // Sluit de scanner (belangrijk om resources vrij te geven)
    }
}
