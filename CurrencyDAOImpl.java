package dao;

import model.Currency;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class CurrencyDAOImpl implements CurrencyDAO {

    @Override
    public List<Currency> getAllCurrencies() {
        List<Currency> list = new ArrayList<>();

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement("SELECT * FROM currency");
             ResultSet rs = ps.executeQuery()) {

            while (rs.next()) {
                list.add(new Currency(
                        rs.getString("code"),
                        rs.getDouble("rate")
                ));
            }
        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }

        return list;
    }

    @Override
    public double getRate(String from, String to) {
        String query = "SELECT rate FROM conversion WHERE from_currency=? AND to_currency=?";

        try (Connection conn = DBConnection.getConnection();
             PreparedStatement ps = conn.prepareStatement(query)) {

            ps.setString(1, from);
            ps.setString(2, to);

            ResultSet rs = ps.executeQuery();
            if (rs.next()) return rs.getDouble("rate");

        } catch (SQLException e) {
            System.out.println("DB Error: " + e.getMessage());
        }

        return -1;
    }
}
