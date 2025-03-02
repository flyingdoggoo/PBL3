package main.java.com.flightbooking.controller;
import com.flightbooking.dao.FlightDAO;
import com.flightbooking.model.Flight;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@WebServlet("/search-flights")
public class FlightServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String from = request.getParameter("from");
        String to = request.getParameter("to");

        List<Flight> flights = FlightDAO.getFlights(from, to);

        request.setAttribute("flights", flights);
        request.getRequestDispatcher("/pages/search-results.jsp").forward(request, response);
    }
}
