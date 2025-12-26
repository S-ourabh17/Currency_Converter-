package com.currency.servlet;
	

	import jakarta.servlet.ServletException;
	import jakarta.servlet.annotation.WebServlet;
	import jakarta.servlet.http.HttpServlet;
	import jakarta.servlet.http.HttpServletRequest;
	import jakarta.servlet.http.HttpServletResponse;

	import java.io.IOException;
	import java.io.PrintWriter;
	import java.util.HashMap;
	import java.util.Map;

	@WebServlet("/convert")
	public class CurrencyServlet extends HttpServlet {

	    private static final Map<String, Double> rates = new HashMap<>();

	    @Override
	    public void init() {
	        // Base currency USD
	        rates.put("USD", 1.0);
	        rates.put("INR", 83.0);
	        rates.put("EUR", 0.92);
	    }

	    @Override
	    protected void doPost(HttpServletRequest request, HttpServletResponse response)
	            throws ServletException, IOException {

	        double amount = Double.parseDouble(request.getParameter("amount"));
	        String from = request.getParameter("from");
	        String to = request.getParameter("to");

	        double convertedAmount = convert(amount, from, to);

	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();

	        out.println("<h2>Conversion Result</h2>");
	        out.println("<p>" + amount + " " + from + " = " + convertedAmount + " " + to + "</p>");
	        out.println("<a href='index.html'>Back</a>");
	    }

	    private double convert(double amount, String from, String to) {
	        double inUSD = amount / rates.get(from);
	        return inUSD * rates.get(to);
	    }
	}

