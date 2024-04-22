package Voo.db;

import java.util.Date;

// Classe pai para representar um meio de transporte aéreo genérico
class AirTransport {
    private String company;
    private int capacity;

    public AirTransport(String company, int capacity) {
        this.company = company;
        this.capacity = capacity;
    }

    // Getters e Setters
    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }
}

// Classe Flight que herda de AirTransport
public class Flight extends AirTransport {
    private String airplaneModel;
    private Date flightDate;
    private int rows;
    private float ticketPrice;

    public Flight(String company, int capacity, String airplaneModel, Date flightDate, int rows, float ticketPrice) {
        super(company, capacity); // Chamando o construtor da classe pai
        this.airplaneModel = airplaneModel;
        this.flightDate = flightDate;
        this.rows = rows;
        this.ticketPrice = ticketPrice;
    }

    // Getters e Setters específicos para a classe Flight
    public String getAirplaneModel() {
        return airplaneModel;
    }

    public void setAirplaneModel(String airplaneModel) {
        this.airplaneModel = airplaneModel;
    }

    public Date getFlightDate() {
        return flightDate;
    }

    public void setFlightDate(Date flightDate) {
        this.flightDate = flightDate;
    }

    public int getRows() {
        return rows;
    }

    public void setRows(int rows) {
        this.rows = rows;
    }

    public float getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(float ticketPrice) {
        this.ticketPrice = ticketPrice;
    }
}
