package main.java.com.flightbooking.dao;
import com.flightbooking.model.Flight;
import com.flightbooking.utils.DatabaseConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FlightDAO {
    public static List<Flight> getFlights(String from, String to) {
        List<Flight> flights = new ArrayList<>();
        try {
            Connection conn = DatabaseConnection.getConnection();
            String sql = "SELECT * FROM flights WHERE from_city=? AND to_city=?";
            PreparedStatement stmt = conn.prepareStatement(sql);
            stmt.setString(1, from);
            stmt.setString(2, to);
            ResultSet rs = stmt.executeQuery();

            while (rs.next()) {
                flights.add(new Flight(rs.getInt("id"), rs.getString("from_city"),
                        rs.getString("to_city"), rs.getDouble("price")));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return flights;
    }
}
