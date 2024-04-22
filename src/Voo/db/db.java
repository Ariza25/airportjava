package Voo.db;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class db {
    public static void main(String[] args) {
        // Criando informações sobre os voos
        List<Flight> flights = new ArrayList<>();

        flights.add(new Flight("LATAM Airlines Group SA.", 200, "Boeing 747", new Date(), 30, 500.0f));
        flights.add(new Flight("Gol Transportes Aéreos.", 250, "Airbus A380", new Date(), 40, 600.0f));
        flights.add(new Flight("Azul Brazilian Airlines.", 230, "Boeing 787", new Date(), 35, 550.0f));
        flights.add(new Flight("Aerolineas Argentinas.", 300, "Airbus A320", new Date(), 20, 400.0f));
        flights.add(new Flight("Azul Brazilian Airlines.", 200, "Boeing 737", new Date(), 25, 450.0f));

        // Exibindo informações sobre os voos
        for (int i = 0; i < flights.size(); i++) {
            Flight flight = flights.get(i);
            System.out.println("Voo " + (i + 1));
            System.out.println("Empresa: " + flight.getCompany());
            System.out.println("Capacidade: " + flight.getCapacity());
            System.out.println("Modelo do Avião: " + flight.getAirplaneModel());
            System.out.println("Data do Voo: " + flight.getFlightDate());
            System.out.println("Fileiras: " + flight.getRows());
            System.out.println("Valor da Passagem: " + flight.getTicketPrice());
            System.out.println();
        }
    }
}
