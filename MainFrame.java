package gui;

import javax.swing.*;
import dao.CurrencyDAOImpl;
import model.DefaultConversionStrategy;

public class MainFrame extends JFrame {

    public MainFrame() {
        setTitle("Currency Converter");
        setSize(400, 300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JLabel label = new JLabel("Currency Converter GUI");
        add(label);

        setVisible(true);
    }
}
