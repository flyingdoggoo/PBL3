package main.java.com.flightbooking.model;
public class Flight {
    private int id;
    private String from;
    private String to;
    private double price;

    public Flight(int id, String from, String to, double price) {
        this.id = id;
        this.from = from;
        this.to = to;
        this.price = price;
    }

    public int getId() { return id; }
    public String getFrom() { return from; }
    public String getTo() { return to; }
    public double getPrice() { return price; }
}
