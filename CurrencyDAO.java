package dao;

import model.Currency;
import java.util.List;

public interface CurrencyDAO {
    List<Currency> getAllCurrencies();
    double getRate(String from, String to);
}
